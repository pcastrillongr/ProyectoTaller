package Models;

import java.util.ArrayList;

public class Container {
	static ArrayList<Vehiculo>listaVehiculos = new ArrayList<Vehiculo>();
	static ArrayList<Cliente>listaClientes = new ArrayList<Cliente>();
	static ArrayList<Vehiculo> vehiculosAux = new ArrayList<Vehiculo>();
	
	public static ArrayList<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}
	public static ArrayList<Vehiculo> getVehiculosAux() {
		return vehiculosAux;
	}
	public static ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}
	
	
}
