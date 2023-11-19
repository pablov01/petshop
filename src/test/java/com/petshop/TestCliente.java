package com.petshop;
import com.petshop.Models.Cliente;
import com.petshop.Services.ClienteService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootTest
public class TestCliente {
    //inyecta dependencia de manera automatica del servicio que se utiliza
    @Autowired
    private ClienteService clienteService;

    @Test
    @Transactional
    @GetMapping("/test")
    @ResponseBody
        public void testInsertarCliente() {
            Cliente cliente = new Cliente();
            cliente.setNombres("Juan");
            cliente.setApellidos("Perez");
            cliente.setCedula("123456789");
            cliente.setRuc("1234567890123");
            cliente.setDireccion("Calle Principal");
            cliente.setEmail("juan@example.com");
            cliente.setTelefono("1234567890");

            Cliente clienteGuardado = clienteService.guardarCliente(cliente);

            // Verificar que el cliente se haya guardado correctamente
            assert clienteGuardado.getId() != null;
        }
}

