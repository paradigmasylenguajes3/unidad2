package objects;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

public class Empleado extends Persona {
	
	private Integer numeroLegajo;
	
	private Direccion direccion;
	
	private AreaTrabajo areaTrabajo;
	
	private TipoDocumento tipoDocumento;

	
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Integer getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(Integer numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public AreaTrabajo getAreaTrabajo() {
		return areaTrabajo;
	}

	public void setAreaTrabajo(AreaTrabajo areaTrabajo) {
		this.areaTrabajo = areaTrabajo;
	}

	public Empleado(Integer numeroLegajo, Direccion direccion, AreaTrabajo areaTrabajo,String nombre,String apellido,Integer documento) {
		
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.setDocumento(documento);
		
		this.numeroLegajo = numeroLegajo;
		this.direccion = direccion;
		this.areaTrabajo = areaTrabajo;
	}

	public Empleado(String nombre,String apellido, AreaTrabajo at,TipoDocumento td) {
		
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setAreaTrabajo(at);
		this.setTipoDocumento(td);
	}
	
	 public Empleado() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return  getNombre() + " "+ getApellido()+" - "+getTipoDocumento() ;
	}
	
	
	

}
