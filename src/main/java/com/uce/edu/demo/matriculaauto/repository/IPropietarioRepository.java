package com.uce.edu.demo.matriculaauto.repository;

import com.uce.edu.demo.matriculaauto.modelo.Propietario;

public interface IPropietarioRepository {
	
	public void crearPropietario(Propietario p);
	
	public void eliminarPropietario(String cedula);
	
	

}
