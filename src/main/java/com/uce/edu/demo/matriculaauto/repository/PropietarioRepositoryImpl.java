package com.uce.edu.demo.matriculaauto.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculaauto.modelo.Propietario;
@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	@Override
	public void crearPropietario(Propietario p) {
System.out.println("Se ha creado un propietario "+ p);		
	}

	@Override
	public void eliminarPropietario(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el propietario "+ cedula);
	}

}
