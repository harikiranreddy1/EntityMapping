package com.users.H2crud.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="user_role_mapping")
public class UserRoleMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name="role_id")
    private Role role;



}
