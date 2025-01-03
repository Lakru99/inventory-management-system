package org.example.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Inventory {
    private int id;
    private int itemId;
    private int productId;
    private int quantity;
}
