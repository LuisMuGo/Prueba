package arraylist3;

public class Persona {
	private String nombre;
	private String dni;
	
	public Persona(String nombre) {
		this.nombre=nombre;
		this.dni=generaDNI();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String generaDNI() {
		String dni="";
		for(int i=0; i<8; i++) {
			int num=(int) (Math.random()*10);
			dni=dni+String.valueOf(num);
		}
		String letras [] = {"A", "B" , "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N"};
		int num=(int) (Math.random()*14);
		dni=dni+letras[num];
		return dni;
	}
	
	@Override
	public String toString() {
		String x=nombre + "  " + dni;
		return x;
	}
}
