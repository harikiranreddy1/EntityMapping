package com.users.H2crud.service;

import com.users.H2crud.model.Role;
import com.users.H2crud.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

@Autowired
public RoleRepo roleRepo;

public Role addrole(Role role){
    return roleRepo.save(role);
}
}
