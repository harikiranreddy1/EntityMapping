package com.users.H2crud.service;
import com.users.H2crud.exception.UserException;
import com.users.H2crud.model.Role;
import com.users.H2crud.model.UserRoleMapping;
import com.users.H2crud.model.Users;
import com.users.H2crud.repository.RoleRepo;
import com.users.H2crud.repository.UserRepo;
import com.users.H2crud.repository.UserRoleMapRepo;
import jakarta.transaction.Transactional;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RoleRepo roleRepo;

    @Autowired
    private UserRoleMapRepo userRoleMapRepo;

    @Transactional
    public Users saveUserWithRole(Users users, Long roleID){

        Role role = roleRepo.findById(roleID).orElseThrow(()-> new UserException("Role not found with ID : "+ roleID));

        users.setRole(role);

        Users savedUser = userRepo.save(users);


        UserRoleMapping userRoleMapping =  new UserRoleMapping();
        userRoleMapping.setUsers(savedUser);
        userRoleMapping.setRole(role);
        
        userRoleMapRepo.save(userRoleMapping);

        return savedUser;

    }
//    public Users createUser(Users users){
//       return userRepo.save(users);
//
//    }
}
