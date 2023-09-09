package com.picpaydesafio.repositories;

import com.picpaydesafio.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    /**método que busca usuários pelos documentos.
     * findUserByDocument
     * */
    Optional<User> findUserByDocument(String document);
    Optional<User> findUserById(Long id);
}