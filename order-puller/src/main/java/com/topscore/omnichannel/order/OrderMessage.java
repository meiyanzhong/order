package com.topscore.omnichannel.order;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderMessage {

    private String id;
    private String type;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime sentDate;
}
