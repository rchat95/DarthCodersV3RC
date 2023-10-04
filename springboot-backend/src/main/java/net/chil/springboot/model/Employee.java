package net.chil.springboot.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
// JPA entity
public class Employee {

    @Id //primary key
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private String firstName;

    private String lastName;

    private String email;

}
