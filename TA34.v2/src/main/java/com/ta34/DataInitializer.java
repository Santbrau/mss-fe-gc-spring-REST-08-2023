package com.ta34;

import com.ta34.model.Empleado;
import com.ta34.model.Trabajo;
import com.ta34.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public void run(String... args) throws Exception {
        Empleado empleado1 = new Empleado("Juan", Trabajo.CAMARERO);
        Empleado empleado2 = new Empleado("María", Trabajo.CAMARERO);
        Empleado empleado3 = new Empleado("Pablo", Trabajo.CAMARERO);
        Empleado empleado4 = new Empleado("Joel", Trabajo.CAMARERO);
        Empleado empleado5 = new Empleado("Gerardo", Trabajo.CAMARERO);
        Empleado empleado6 = new Empleado("Paula", Trabajo.COCINERO);
        Empleado empleado7 = new Empleado("Laura", Trabajo.COCINERO);
        Empleado empleado8 = new Empleado("Marc", Trabajo.PINCHE);
        Empleado empleado9 = new Empleado("Pepe", Trabajo.PINCHE);
        Empleado empleado10 = new Empleado("Fran", Trabajo.METRE);
        Empleado empleado11 = new Empleado("Jordi", Trabajo.GERENTE);
        empleadoRepository.saveAll(List.of(empleado1, empleado2, empleado3, 
        						empleado4, empleado5, empleado6, empleado7,
        						empleado8, empleado9, empleado10, empleado11));
    }
}