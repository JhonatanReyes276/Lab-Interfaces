public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String nombreDueno;

    public Animal(String nombre, int edad, String nombreDueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }

    public abstract double calcularCosto();

    public void imprimirFicha() {
        System.out.println("Ficha del animal:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nombre de su dueño: " + nombreDueno);
        System.out.println("Costo de la consulta: $" + calcularCosto());
    }

}
