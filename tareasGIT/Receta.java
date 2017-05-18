package tareasGIT;

import java.util.ArrayList;

public class Receta {
	String nombre;
	ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	ArrayList<String> preparacion = new ArrayList<String>();
	
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
	public void addPreparacion(String preparacion) {
		this.preparacion.add(preparacion);
	}

	public String listarIngredientes() {
		String lista="";
		for(Ingrediente i:ingredientes) {
			lista+=i.toString()+"\n";
		}
		return lista;
	}
	public String listarPreparacion() {
		String lista="";
		for(int i=0; i<preparacion.size(); i++) {
			int paso = i+1;
			lista+="Paso "+ paso + " : " +preparacion.get(i)+"\n";
		}
		return lista;
	}
	@Override
	public String toString() {
		return "Receta: " + nombre.toUpperCase() + "\n\nIngredientes\n" + listarIngredientes() + "\nPreparacion\n" + listarPreparacion();
	}
	 public static void main(String[] args) {
		Ingrediente i = new Ingrediente(3, "kg", "tomates");
		Ingrediente i2 = new Ingrediente(3, "kg", "cigalas");
		Receta r = new Receta();
		r.setNombre("Cigalas con Tomate");
		r.addIngrediente(i);
		r.addIngrediente(i2);
		r.addPreparacion("Pelar los tomates");
		r.addPreparacion("Poner una olla con agua a hervir");
		System.out.println(r.toString());
	}
}
