public class Conejo extends Animal {

    public Conejo(String nombre, int edad, String nombreDueno) {
        super(nombre, edad, nombreDueno);
    }

    @Override
    public double calcularCosto() {
        return 35_000;
    }
}