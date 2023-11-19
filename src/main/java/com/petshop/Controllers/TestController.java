package com.petshop.Controllers;

import com.petshop.Models.Cliente;
import com.petshop.Services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    // private final UsuarioRepository usuarioRepository;

    // private final ClienteRepository clienteRepository;
    
    // @Autowired
    // public TestController(UsuarioRepository usuarioRepository) {
    //     this.usuarioRepository = usuarioRepository;
    // }

    @Autowired
    private ClienteService clienteService;


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

