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
		this.apellido2="";
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
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	public String getApellido2() {
		return apellido2;
	}



	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}



	public String getEmaill() {
		return emaill;
	}



	public void setEmaill(String emaill) {
		this.emaill = emaill;
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
		
		Cliente c = new Cliente("12345678Q","alejandro","villalobos","trujillo","Malaga","952818280","ale@hotmail.es");
		Cliente pepe=new Cliente("12345678g","pepe","da silva","gomez","calle del pozo","655789654","pepesilva@gmail.com");
		Cliente manolo=new Cliente("987654321h","manolo","gomez","beltran","calle del barrio","544321167","manologomez@gmail.com");
		Cliente juan=new Cliente("24578975f","juan","lopez","gomez","calle del rio","7883465762","juan@gmail.com");
		Cliente lalo=new Cliente("23567806q","lalo","hernando","freire","calle del malecon","633764321","lalo@gmail.com");
		Cliente alejandro=new Cliente("23987390q","alejandro","gomex","gomez","calle de montepinar","688754321","alejandro@gmail.com");
		
		Container.getListaClientes().add(c);
		Container.getListaClientes().add(manolo);
		Container.getListaClientes().add(pepe);
		Container.getListaClientes().add(juan);
		Container.getListaClientes().add(lalo);
	
	}
	
}
