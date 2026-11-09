public class Ave extends Animal {
    private double pesoGramos;

    public Ave(String nombre, int edad, String nombreDueno, double pesoGramos) {
        super(nombre, edad, nombreDueno);
        this.pesoGramos = pesoGramos;
    }

    public double getPesoGramos() {
        return pesoGramos;
    }

    @Override
    public double calcularCosto() {
        double cambio = 100 * pesoGramos;
        return 28_000 + cambio;
    }
}
