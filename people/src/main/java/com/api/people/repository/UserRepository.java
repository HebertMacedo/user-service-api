package com.api.people.repository;

import com.api.people.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}


/**
 * A interface UserRepository é responsável por fornecer métodos para acessar e manipular dados
 * relacionados à entidade User no banco de dados. Estende JpaRepository, que fornece operações
 * básicas de CRUD (Create, Read, Update, Delete) de forma conveniente.
 * A anotação @Repository indica que esta interface é uma componente Spring gerenciada.
 */
