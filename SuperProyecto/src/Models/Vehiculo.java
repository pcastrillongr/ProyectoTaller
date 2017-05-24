package Models;

import java.sql.Date;

public class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	private int numPuertas;
	private String color;
	private String tipoGas;
	private int fechamatriculacion;
	private int cv;
	
	
	public Vehiculo(String matricula, String marca, String modelo, int numPuertas, String color, String tipoGas,
			int anioMatriculacion, int cv) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.numPuertas = numPuertas;
		this.color = color;
		this.tipoGas = tipoGas;
		this.fechamatriculacion = anioMatriculacion;
		this.cv = cv;
	}
	
	
	public Vehiculo(){
		this.matricula = "";
		this.marca = "";
		this.modelo = "";
		this.numPuertas = 0;
		this.color = "";
		this.tipoGas = "";
		this.fechamatriculacion=0;
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


	public int getNumPuertas() {
		return numPuertas;
	}


	public void setNumPuertas(int numPuertas) {
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


	public int getAnioMatriculacion() {
		return fechamatriculacion;
	}


	public void setAnioMatriculacion(int aniomatriculacion) {
		this.fechamatriculacion = 0;
	}


	public int getCv() {
		return cv;
	}


	public void setCv(int cv) {
		this.cv = cv;
	}


	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", numPuertas="
				+ numPuertas + ", color=" + color + ", tipoGas=" + tipoGas + ", anioMatriculacion=" + fechamatriculacion
				+ ", cv=" + cv + "]";
	}
	
	
}
