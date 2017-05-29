package Models;

public class Cliente {
	private String nif;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String direccion;
	private String tlf;
	private String emaill;
	
	
	public Cliente(String nif, String nombre, String apellido1,String apellido2, String direccion, String tlf, String emial) {
		this.nif = nif;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2=apellido2;
		this.direccion = direccion;
		this.tlf = tlf;
		this.emaill = emial;
	}
	
	
	
	public Cliente() {
		this.nif = "";
		this.nombre = "";
		this.apellido1 = "";
		this.direccion = "";
		this.tlf = "";
		this.emaill = "";
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
		return apellido1;
	}
	public void setApellidos(String apellidos) {
		this.apellido1 = apellidos;
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
		return emaill;
	}
	public void setEmial(String emial) {
		this.emaill = emial;
	}



	@Override
	public String toString() {
		return "Cliente [nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellido1 + " " + apellido2 +" direccion=" + direccion
				+ ", tlf=" + tlf + ", emial=" + emaill + "]";
	}
	
	
	static public void ClientePrueba(){
		
		Cliente c = new Cliente("78978198Q","alejandro","villalobos","trujillo","Malaga","952818280","ale@hotmail.es");
		Container.getListaClientes().add(c);
	}
	
}
