package com.example.auth.reg.Golubev.repos;


import com.example.auth.reg.Golubev.models.ModelUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<ModelUser, Long> {
    ModelUser findByUsername(String username);
    boolean existsByUsername(String username);
}
