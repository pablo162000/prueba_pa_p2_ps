package com.uce.edu.demo.matriculaauto.service;

import com.uce.edu.demo.matriculaauto.modelo.Vehiculo;

public interface IVehiculoService {
	
	// CRUD
		public void insertarVehiculo(Vehiculo v);

		public Vehiculo buscarvehiculo(String marca);

		public void actualizar(Vehiculo v);

		public void eliminar(String marca);

}
