package org.example.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
     private int id;
     private int productId;
     private String productName;
     private String description;
     private int forSale;
}
