package com.example.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cursomc.domain.Pedido;;

//Realizar operações de acesso a dados, do objeto categoria que esta conectado ao banco de dados.

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

	
}
