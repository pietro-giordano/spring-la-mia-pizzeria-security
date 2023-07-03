package org.lessons.springlamiapizzeriacrud.repository;

import org.lessons.springlamiapizzeriacrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

      // metodo per recuperare User tramite username
      Optional<User> findByUsername(String username);
}
