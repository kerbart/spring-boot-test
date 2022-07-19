package com.kerbart.springBootTest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity
@Table(name = "PETS")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PetEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer id;

    @Column(name="name")
    String name;

    @Column(name="age")
    Long age;
}
