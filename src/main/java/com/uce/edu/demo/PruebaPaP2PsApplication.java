package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.matriculaauto.modelo.MatriculaVehiculo;
import com.uce.edu.demo.matriculaauto.modelo.Propietario;
import com.uce.edu.demo.matriculaauto.modelo.Vehiculo;
import com.uce.edu.demo.matriculaauto.service.IMatriculaVehiculoService;
import com.uce.edu.demo.matriculaauto.service.IPropietarioService;
import com.uce.edu.demo.matriculaauto.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2PsApplication implements CommandLineRunner{

	@Autowired
	private Vehiculo vehiculo;
	@Autowired
	private Propietario propietario;
	@Autowired
	private MatriculaVehiculo matriculaVehiculo;
	@Autowired
	private IVehiculoService vehiculoService;
	@Autowired
	private IPropietarioService propietarioService;
	@Autowired
	private IMatriculaVehiculoService matriculaVehiculoService;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2PsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		this.vehiculo.setMarca("Toyota");
		this.vehiculo.setPlaca("PIX500");
		this.vehiculo.setPrecio(new BigDecimal(21000));
		this.vehiculo.setTipo("liviano");
		
		this.vehiculoService.insertarVehiculo(vehiculo);
		this.vehiculo.setMarca("Hyundai");
		this.vehiculo.setPlaca("PIX501");	
		this.vehiculoService.actualizar(vehiculo);
		
		this.propietario.setApellido("Suntaxi");
		this.propietario.setCedula("1724157688");
		this.propietario.setFechaNacimiento(LocalDateTime.of(2000, 2, 16, 3, 15));
		this.propietario.setNombre("Pablo");
		this.propietarioService.crearPropietario(propietario);
		
		this.matriculaVehiculo.setFechaMatricula(LocalDateTime.now());
		this.matriculaVehiculo.setPropietario(propietario);
this.matriculaVehiculo.setVehiculo(vehiculo);

this.matriculaVehiculoService.crearMatricula("1724157688","PIX500");
		
		
		
	}
	
	

}
