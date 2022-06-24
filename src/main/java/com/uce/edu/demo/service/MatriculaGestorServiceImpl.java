package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.repository.IMatriculaRepository;
import com.uce.edu.demo.repository.IPropietarioRepository;
import com.uce.edu.demo.repository.IVehiculoRepository;
@Service
public class MatriculaGestorServiceImpl implements IMatriculaGestorService {
	@Autowired
	private IPropietarioRepository iPropietarioRepository;

	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	@Autowired
	@Qualifier("pesado")
	IMatriculaService matriculaServicePesado;

	@Autowired
	@Qualifier("liviano")
	IMatriculaService matriculaServiceLiviano;

	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Override
	public void generar(String cedula, String placa) {
		// TODO Auto-generated method stub
		Propietario pro = this.iPropietarioRepository.consultar(cedula);
		Vehiculo vehi = this.iVehiculoRepository.buscar(placa);
		BigDecimal valorMatricula;
		String tipo = vehi.getTipo();

		if (tipo.equals("P")) {
			valorMatricula = this.matriculaServicePesado.calcular(vehi.getPrecio());
		} else {
			valorMatricula = this.matriculaServiceLiviano.calcular(vehi.getPrecio());

		}
		
		if(valorMatricula.compareTo(new BigDecimal(2000))>0) {
			BigDecimal valorDescuento = valorMatricula.multiply(new BigDecimal(7)).divide(new BigDecimal(100));
		    valorMatricula=valorMatricula.subtract(valorDescuento);
		}
		
		Matricula matricula= new Matricula();
		matricula.setFechaMatricula(null);
		matricula.setPropietario(pro);
		matricula.setVehiculo(vehi);
		matricula.setValorMatricula(valorMatricula);
		matricula.setFechaMatricula(LocalDateTime.now());
		
		this.iMatriculaRepository.crear(matricula);
		
	}

}
