package Models;

public class Cliente {
	private String nif;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String tlf;
	private String emial;
	
	
	public Cliente(String nif, String nombre, String apellidos, String direccion, String tlf, String emial) {
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.tlf = tlf;
		this.emial = emial;
	}
	
	
	
	public Cliente() {
		this.nif = "";
		this.nombre = "";
		this.apellidos = "";
		this.direccion = "";
		this.tlf = "";
		this.emial = "";
	}



	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTlf() {
		return tlf;
	}
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	public String getEmial() {
		return emial;
	}
	public void setEmial(String emial) {
		this.emial = emial;
	}



	@Override
	public String toString() {
		return "Cliente [nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ ", tlf=" + tlf + ", emial=" + emial + "]";
	}
	
	
	
}
