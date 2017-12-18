package com.topscore.omnichannel.order;

import com.topscore.omnichannel.order.entity.Goods;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(tags = "商品服务")
@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsMapper mapper;

    @ApiOperation("获取商品10001")
    @GetMapping("/{number}")
    @ResponseBody
    public Goods index(@ApiParam(value = "商品编号", required = true) @PathVariable("number") String number) {
        return mapper.findOne(number);
    }
}
