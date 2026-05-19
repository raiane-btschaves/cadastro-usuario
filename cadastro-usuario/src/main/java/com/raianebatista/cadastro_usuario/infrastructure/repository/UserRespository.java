package com.raianebatista.cadastro_usuario.infrastructure.repository;

import com.raianebatista.cadastro_usuario.infrastructure.entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UserRespository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}


