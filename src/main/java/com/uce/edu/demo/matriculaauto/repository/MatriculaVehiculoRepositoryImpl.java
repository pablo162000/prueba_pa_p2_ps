package com.uce.edu.demo.matriculaauto.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MatriculaVehiculoRepositoryImpl implements IMatriculaVehiculoRepository{

	@Override
	public void crearMatricula(String cedula,String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha creado una matricula");
	}

}
