package Models;

public class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	private byte numPuertas;
	private String color;
	private String tipoGas;
	private short anioMatriculacion;
	private short cv;
	
	
	public Vehiculo(String matricula, String marca, String modelo, byte numPuertas, String color, String tipoGas,
			short anioMatriculacion, short cv) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.numPuertas = numPuertas;
		this.color = color;
		this.tipoGas = tipoGas;
		this.anioMatriculacion = anioMatriculacion;
		this.cv = cv;
	}
	
	
	public Vehiculo(){
		this.matricula = "";
		this.marca = "";
		this.modelo = "";
		this.numPuertas = 0;
		this.color = "";
		this.tipoGas = "";
		this.anioMatriculacion = 0;
		this.cv = 0;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public byte getNumPuertas() {
		return numPuertas;
	}


	public void setNumPuertas(byte numPuertas) {
		this.numPuertas = numPuertas;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getTipoGas() {
		return tipoGas;
	}


	public void setTipoGas(String tipoGas) {
		this.tipoGas = tipoGas;
	}


	public short getAnioMatriculacion() {
		return anioMatriculacion;
	}


	public void setAnioMatriculacion(short anioMatriculacion) {
		this.anioMatriculacion = anioMatriculacion;
	}


	public short getCv() {
		return cv;
	}


	public void setCv(short cv) {
		this.cv = cv;
	}


	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", numPuertas="
				+ numPuertas + ", color=" + color + ", tipoGas=" + tipoGas + ", anioMatriculacion=" + anioMatriculacion
				+ ", cv=" + cv + "]";
	}
	
	
}
