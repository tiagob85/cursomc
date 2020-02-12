package com.example.cursomc.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cursomc.domain.Categoria;
import com.example.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;//automatica instaciado pela spring, por injeção de dependencia
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
				
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado ! Id: "+ id + ", Tipo: "+Categoria.class.getName(), null));
		
		
	}
	
	

}
