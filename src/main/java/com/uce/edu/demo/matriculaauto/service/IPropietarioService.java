package com.uce.edu.demo.matriculaauto.service;

import com.uce.edu.demo.matriculaauto.modelo.Propietario;

public interface IPropietarioService {

	public void crearPropietario(Propietario p);

	public void eliminarPropietario(String cedula);

}
