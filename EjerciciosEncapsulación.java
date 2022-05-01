public class EjerciciosEncapsulación {
	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.setNombre("Federico");
		String nombre = persona.getNombre();
		persona.setEdad(28);
		int edad = persona.getEdad();
		persona.setTelefono(3884041285L);
		long telefono = persona.getTelefono();
		System.out.println("Nombre: "+nombre+" Edad: "+edad+" Telefono: "+telefono);
	}
}
class Persona {
	private String nombre;
	private int edad;
	private long telefono;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return this.edad;
}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public long getTelefono() {
		return this.telefono;
}

}