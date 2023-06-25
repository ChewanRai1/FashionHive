package com.system.kinmel.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "review")
public class Review {
    @Id
    @SequenceGenerator(name = "kinmel_product_seq_gen", sequenceName = "kinmel_product_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "kinmel_product_seq_gen", strategy = GenerationType.SEQUENCE)
    private Integer id;


}
