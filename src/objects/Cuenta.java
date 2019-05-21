package objects;

public class Cuenta {
	private String nombre;

	public Cuenta(String nombre) {
		
		this.nombre = nombre;
	}
	
	public Cuenta() {
		//System.out.println("object created");
	}
	

	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
