package com.users.H2crud.controller;

import com.users.H2crud.model.Role;
import com.users.H2crud.model.Users;
import com.users.H2crud.repository.RoleRepo;
import com.users.H2crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    public UserService userService;

    @Autowired
    private RoleRepo roleRepo;


    @PostMapping("/addUser")
    public Users createUserWithRole(@RequestBody Users users, @RequestParam Long roleID){
      return userService.saveUserWithRole(users,roleID);

    }

    @GetMapping("/roles")
    public List<Role> getAllRoles(){
        return roleRepo.findAll();
    }
}
