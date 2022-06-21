package com.uce.edu.demo.matriculaauto.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculaauto.modelo.Vehiculo;
@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	@Override
	public void insertarVehiculo(Vehiculo v) {

		System.out.println("Se ha insertado el vehiculo" + v);
	}

	@Override
	public Vehiculo buscarvehiculo(String marca) {

		System.out.println("Se ha biscado el vehiculo " + marca);
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca(marca);
		return vehiculo;
	}

	@Override
	public void actualizar(Vehiculo v) {

		System.out.println("Se ha actualizado el vahiculo " + v);
	}

	@Override
	public void eliminar(String marca) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el vehiculo " + marca);
	}

}
