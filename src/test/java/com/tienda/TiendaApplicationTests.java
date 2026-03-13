package com.tienda;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // <- Activa el perfil "test" solo cuando se ejecutan los tests
class TiendaApplicationTests {

    @Test
    void contextLoads() {
    }
}