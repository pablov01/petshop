package com.petshop.Services;

import com.petshop.Models.Cliente;
import com.petshop.Repositories.ClienteRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;
    
    //indica que va inyectar dependencias automaticamente del archivo ClienteRepository
    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    //obtiene todos los registros de la tabla Clientes
    public List<Cliente> obtenerTodosLosClientes() {
        return clienteRepository.findAll();
    }
    //guarda el nuevo cliente en la base de datos
    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    //elimina un cliente existente en la base mediante su ID
    public void eliminarCliente(Long clienteId) {
        clienteRepository.deleteById(clienteId);
    }

    // Otros métodos que podamos utilizar
}

