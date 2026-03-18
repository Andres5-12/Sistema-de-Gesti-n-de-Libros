package com.example.demo.Service;

import com.example.demo.Model.PerfilUsuario;
import com.example.demo.Repository.PerfilUsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerfilUsuarioServiceImpl {

    private final PerfilUsuarioRepository perfilUsuarioRepository;

    public PerfilUsuarioServiceImpl(PerfilUsuarioRepository perfilUsuarioRepository) {
        this.perfilUsuarioRepository = perfilUsuarioRepository;
    }

    public List<PerfilUsuario> obtenerTodos() {
        return perfilUsuarioRepository.findAll();
    }

    public Optional<PerfilUsuario> obtenerPorId(Long id) {
        return perfilUsuarioRepository.findById(id);
    }

    public PerfilUsuario guardar(PerfilUsuario perfilUsuario) {
        return perfilUsuarioRepository.save(perfilUsuario);
    }

    public PerfilUsuario actualizar(Long id, PerfilUsuario perfilUsuario) {
        perfilUsuario.setId(id);
        return perfilUsuarioRepository.save(perfilUsuario);
    }

    public void eliminar(Long id) {
        perfilUsuarioRepository.deleteById(id);
    }
}