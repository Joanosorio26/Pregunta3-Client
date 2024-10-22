package com.example.cliente_oauth.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class SecurityController {

    @GetMapping("/public")
    public String publicApi(){
        return "Esta es una API pública.";
    }
    @GetMapping("/private")
    public String privateApi(){
        return "Esta API es privada";
    }
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminApi() {
        return "Esta API es privada y accesible solo para administradores.";
    }
}