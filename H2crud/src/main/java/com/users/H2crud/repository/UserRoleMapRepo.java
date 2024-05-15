package com.users.H2crud.repository;

import com.users.H2crud.model.UserRoleMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface UserRoleMapRepo extends JpaRepository<UserRoleMapping, Long> {



}
