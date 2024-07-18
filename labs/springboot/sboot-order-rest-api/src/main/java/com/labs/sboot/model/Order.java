package com.labs.sboot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Description should not be empty")
    private String description;
    @NotBlank(message = "Category should not be empty")
    private String category;
    @Range(min = 1, max = 10, message = "Quantity should be between 1 and 10")
    private int quantity;
    @Positive(message = "Price should not be negative")
    private double price;
}
