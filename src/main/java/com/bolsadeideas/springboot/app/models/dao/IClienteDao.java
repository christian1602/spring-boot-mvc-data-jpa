package com.bolsadeideas.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

// A LA INTERFAZ IClienteDao NO ES NECESARIO ANOTARLA CON NINGUNA ANOTACION
// YA QUE ES UNA INTERFAZ ESPECIAL PORQUE HEREDA DE CrudRepository.
// POR LO TANTO, POR DEBAJO YA ES ES UN COMPONENTE DE SPRING
// EN EL CUERPO DE LA INTERFACE, ES POSIBLE AGREGAR NUEVOS METODOS CON CONSULTAS PERSONALIZADAS
// CON @Query, O A TRAVES DEL NOMBRE DEL METODO

public interface IClienteDao extends CrudRepository<Cliente, Long> {
}
