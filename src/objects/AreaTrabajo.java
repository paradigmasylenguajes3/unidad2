package objects;

public class AreaTrabajo {
	
	private String nombre;
	private String descripcion;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return  nombre;
	}
	
	public AreaTrabajo(String nombre) {
		
		this.setNombre(nombre);
		
	}
	
	public AreaTrabajo() {
		
	}
	

}
