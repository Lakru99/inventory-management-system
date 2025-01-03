package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class ProductEntity {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private int productId;
     private String productName;
     private String description;
     private int forSale;
}
