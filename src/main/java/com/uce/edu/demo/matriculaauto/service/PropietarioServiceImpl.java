package com.uce.edu.demo.matriculaauto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculaauto.modelo.Propietario;
import com.uce.edu.demo.matriculaauto.repository.IPropietarioRepository;
@Service
public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	@Override
	public void crearPropietario(Propietario p) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.crearPropietario(p);
	}

	@Override
	public void eliminarPropietario(String cedula) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.eliminarPropietario(cedula);
	}

}
