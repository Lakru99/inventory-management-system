package org.example.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private int id;
    private int itemId;
    private String orderDate;
    private int amount;
}
