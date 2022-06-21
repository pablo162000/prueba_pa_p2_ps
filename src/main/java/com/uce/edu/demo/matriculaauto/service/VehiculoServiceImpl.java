package com.uce.edu.demo.matriculaauto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculaauto.modelo.Vehiculo;
import com.uce.edu.demo.matriculaauto.repository.IVehiculoRepository;
@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	@Override
	public void insertarVehiculo(Vehiculo v) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.insertarVehiculo(v);
		
	}

	@Override
	public Vehiculo buscarvehiculo(String marca) {
		// TODO Auto-generated method stub
		
		return this.iVehiculoRepository.buscarvehiculo(marca);
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.actualizar(v);
	}

	@Override
	public void eliminar(String marca) {
		// TODO Auto-generated method stub
		this.eliminar(marca);
	}

}
