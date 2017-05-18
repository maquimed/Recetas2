package tareasGIT;

import java.util.ArrayList;

public class Receta {
	String nombre;
	ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	ArrayList<String> preparacion = new ArrayList<String>();
	int hola;
	
	public Receta() {
		
	}

	public Receta(String nombre, ArrayList<Ingrediente> ingredientes, ArrayList<String> preparacion) {

		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.preparacion = preparacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public ArrayList<String> getPreparacion() {
		return preparacion;
	}
	public void setPreparacion(ArrayList<String> preparacion) {
		this.preparacion = preparacion;
	}
	public void addIngrediente(Ingrediente ingrediente) {
		this.ingredientes.add(ingrediente);
	}
}
