package com.users.H2crud.controller;

import com.users.H2crud.model.Role;
import com.users.H2crud.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/role")
public class RoleController {

    @Autowired
    public RoleService roleService;

    @PostMapping("/addrole")
    public Role addRole(@RequestBody Role role){
        return roleService.addrole(role);
    }


}
