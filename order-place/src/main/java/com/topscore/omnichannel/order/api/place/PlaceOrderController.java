package com.topscore.omnichannel.order.api.place;

import com.topscore.omnichannel.order.data.OrderRepository;
import com.topscore.omnichannel.order.jooq.tables.records.PersonRecord;
import com.topscore.omnichannel.order.model.Department;
import com.topscore.omnichannel.order.model.Order;
import com.topscore.omnichannel.order.model.Person;
import lombok.Data;
import org.jinq.jooq.JinqJooqContext;
import org.jinq.jpa.JinqJPAStreamProvider;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.math.BigDecimal;
import java.util.List;

import static com.topscore.omnichannel.order.jooq.Tables.DEPARTMENT;
import static com.topscore.omnichannel.order.jooq.Tables.PERSON;

@RestController
@RequestMapping("/orders")
public class PlaceOrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private PlaceOrderService placeOrderService;

    @PersistenceContext
    private EntityManager em;

    @Autowired
    private JinqJPAStreamProvider streams;

    @Autowired
    private JinqJooqContext jinq;

    @Autowired
    private DSLContext create;

    @GetMapping
    public List<Order> list() {
        streams.streamAll(em, Order.class).forEach(o -> System.out.println(o.getId() + " -- " + o.getType()));
        List<Order> list = streams.streamAll(em, Order.class).toList();
        System.out.println(list);
        return list;
//        return orderRepository.findAll();
    }

    @Transactional
    @GetMapping("/person")
    public List<Person> persons() {
        Department d = new Department();
        d.setName("Design");

        Person p1 = new Person("Tom");
        p1.setDepartment(d);

        Person p2 = new Person("Jack");
        p2.setDepartment(d);

        em.persist(p1);
        em.persist(p2);
        em.persist(d);

        streams.streamAll(em, Person.class)
                .where(p -> p.getName().equals("Jack"))
                .forEach(person -> System.out.println(person.getId() + " -- " + person.getName()));
        List<Person> list = streams.streamAll(em, Person.class).toList();
        System.out.println(list);

        Result<PersonRecord> result = create.selectFrom(PERSON).fetch();
        System.out.println(result);

        System.out.println("--> " + create.select().from(DEPARTMENT).fetch());

        // 版本不同，无法使用
//        List<DepartmentRecord> records = jinq.from(DEPARTMENT)
//                .where(department -> department.getName().equals("Design"))
//                .selectAll().toList();
//        System.out.println(records);

        return list;
    }

    @GetMapping("/{id}")
    public String one(@PathVariable("id") String orderId) {
        return "";
    }

    @PostMapping
    public String create(@RequestBody OrderForm form) {
        return placeOrderService.createOrder(form);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id) {
        return "";
    }

    /**
     * 订单表单。
     */
    @Data
    public static class OrderForm {
        private Integer type;
        private List<GoodsForm> goods;
    }

    /**
     * 商品表单。
     */
    @Data
    public static class GoodsForm {
        private String id;
        private int quality;
        private BigDecimal unitPrice;
    }
}
