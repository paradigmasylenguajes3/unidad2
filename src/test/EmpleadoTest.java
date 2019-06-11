package test;

import objects.AreaTrabajo;
import objects.Direccion;
import objects.Empleado;

public class EmpleadoTest {
	
	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado();
		
		Direccion direccion = new Direccion(); 
		
		AreaTrabajo area = new AreaTrabajo();
		
		//seteo los atributos del objeto Direccion
		direccion.setCalle("San Nicolas de Bari");
		direccion.setBarrio("Centro");
		direccion.setNumero(115);
		
		area.setNombre("Sistemas");
		area.setDescripcion("lalalla");
		
		
		empleado1.setNombre("Juan");
		empleado1.setApellido("Perez");
		empleado1.setDocumento(12345678);
		empleado1.setNumeroLegajo(111);
		empleado1.setDireccion(direccion);
		empleado1.setAreaTrabajo(area);
		
		
		System.out.println(empleado1.getDireccion());
		
		
		
		
		
	}	

}
