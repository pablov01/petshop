package com.petshop.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petshop.Models.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Puedes agregar métodos personalizados si es necesario
}

