package com.example.cursomc.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.cursomc.domain.Pedido;
import com.example.cursomc.repositories.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;//automatica instaciado pela spring, por injeção de dependencia
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
				
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado ! Id: "+ id + ", Tipo: "+Pedido.class.getName(), null));
		
		
	}
	

}
