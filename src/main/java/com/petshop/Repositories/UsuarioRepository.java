package com.petshop.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.petshop.Models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}