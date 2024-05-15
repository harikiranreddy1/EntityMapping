package com.users.H2crud.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name="roles")
public class Role {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   private String roleName;






}
