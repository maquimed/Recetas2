package tareasGIT;

public class Ingrediente {
	float cantidad;
	String unidad;
	String nombre;
	
	public Ingrediente () {
		
	}

	public Ingrediente(float cantidad, String unidad, String nombre) {
		this.cantidad = cantidad;
		this.unidad = unidad;
		this.nombre = nombre;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return cantidad + " " + unidad + " de " + nombre;
	}

	public static void main(String[] args) {
		Ingrediente	i = new	Ingrediente(3, "kg", "tomates");
		System.out.println(i.toString());
		
	}
	
}
