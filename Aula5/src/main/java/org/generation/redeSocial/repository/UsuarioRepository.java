package org.generation.redeSocial.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.generation.redeSocial.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario);
}