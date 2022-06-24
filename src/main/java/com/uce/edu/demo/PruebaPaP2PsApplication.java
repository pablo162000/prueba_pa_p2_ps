package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.service.IMatriculaGestorService;
import com.uce.edu.demo.service.IPropietarioService;
import com.uce.edu.demo.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2PsApplication implements CommandLineRunner{

	@Autowired
	private IVehiculoService iVehiculoService;
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IMatriculaGestorService iMatriculaGestorService;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2PsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Totota");
		vehiculo.setPlaca("PCT8976");
		vehiculo.setPrecio(new BigDecimal(50000));
		vehiculo.setTipo("L");
		this.iVehiculoService.insertar(vehiculo);
		
		//2
		vehiculo.setPrecio(new BigDecimal(40000));
		vehiculo.setMarca("Toyota");
		this.iVehiculoService.actualizar(vehiculo);
		
		//3
		Propietario propietario = new Propietario();
		propietario.setApellido("Cayambe");
		propietario.setNombre("Edison");
		propietario.setCedula("541551515");
		propietario.setFechaNacimiento(LocalDateTime.now());
		this.iPropietarioService.crear(propietario);
		
		//4
		this.iMatriculaGestorService.generar("541551515", "PCT8976");
		
		
	}
	
	

}
