package com.umg.empleados.controller;

import com.umg.empleados.model.UEmpleado;
import com.umg.empleados.repository.UEmpleadoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/empleados")
@CrossOrigin(origins = "*")
public class UEmpleadoController {

    private final UEmpleadoRepository repository;

    public UEmpleadoController(UEmpleadoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<UEmpleado> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<UEmpleado> buscar(@PathVariable String id) {
        return repository.findById(id);
    }

    @PostMapping
    public UEmpleado crear(@RequestBody UEmpleado empleado) {
        return repository.save(empleado);
    }

    @PutMapping("/{id}")
    public UEmpleado actualizar(@PathVariable String id, @RequestBody UEmpleado empleado) {
        empleado.setIdempleado(id);
        return repository.save(empleado);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        repository.deleteById(id);
    }
}
