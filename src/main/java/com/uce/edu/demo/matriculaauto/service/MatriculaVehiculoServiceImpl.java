package com.uce.edu.demo.matriculaauto.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculaauto.modelo.MatriculaVehiculo;
import com.uce.edu.demo.matriculaauto.modelo.Propietario;
import com.uce.edu.demo.matriculaauto.modelo.Vehiculo;
import com.uce.edu.demo.matriculaauto.repository.IMatriculaVehiculoRepository;

@Service
public class MatriculaVehiculoServiceImpl implements IMatriculaVehiculoService {

	@Autowired
	private IMatriculaVehiculoRepository iMatriculaVehiculoRepository;
	@Autowired
	private Vehiculo vehiculo;
	@Autowired
	private Propietario propietario;
	@Autowired
	private MatriculaVehiculo matriculaVehiculo;
	
	private BigDecimal valor;

	@Override
	public void crearMatricula(String cedula, String placa) {
		// TODO Auto-generated method stub
		this.iMatriculaVehiculoRepository.crearMatricula(cedula, placa);
		

		this.vehiculo.setPlaca(placa);
		this.propietario.setCedula(cedula);
		
		if(this.vehiculo.getTipo()=="liviano") {
			valor= this.vehiculo.getPrecio().multiply(new BigDecimal(0.10));
			if(valor.signum()>2000) {
				valor=valor.multiply(new BigDecimal(0.93));
			}
		}else {
			valor= this.vehiculo.getPrecio().multiply(new BigDecimal(0.15));
			if(valor.signum()>2000) {
				valor=valor.multiply(new BigDecimal(0.93));
			}
		}
		
		
		
		this.matriculaVehiculo.setValorMatricula(valor);
		System.out.println(this.matriculaVehiculo);
	
	}
	
	
	
}
