
package com.example.TallerSemanaNro_3_SpringBoot_RM.controller;


import com.example.TallerSemanaNro_3_SpringBoot_RM.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    // Muestra el formulario
    @GetMapping("/formulario")
    public String mostrarFormulario (Model model) {
        model.addAttribute("usuario", new Usuario());  // Creamos un objeto Usuario vacio para el formulario
        return "formulario"; // Devuelve la vista formulario.html
    }
    
    // Procesa el formulario y redirige a otra página
    @PostMapping("/guardar")
    public String guardarFormulario(Usuario usuario, Model model) {
        // Aqui podrias guardar el usuazio en la base de datos, etc.
        model.addAttribute("usuario", usuario); // Pasamos los datos del usuario al modelo para mostrarlos
    
        // Redirige a le vista donde se mostrará el usuario guardado
        return "resultado"; // Redirige a resultado.html
    }
}