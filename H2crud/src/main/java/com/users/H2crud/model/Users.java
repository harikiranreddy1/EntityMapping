package com.users.H2crud.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String email;


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="role_id")
    private Role role;


}
