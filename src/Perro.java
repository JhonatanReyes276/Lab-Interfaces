public class Perro extends Animal implements Vacunable, Asegurable {
    private String raza;
    private String numeroPoliza;
    private String [] vacunas;
    private int contadorVacunas;

    public Perro(String nombre, int edad, String nombreDueno, String raza, String numeroPoliza) {
        super(nombre, edad, nombreDueno);
        this.raza = raza;
        this.numeroPoliza = numeroPoliza;
        this.vacunas = new String[5];
        this.contadorVacunas = 0;

    }

    public String getRaza() {
        return raza;
    }

    @Override
    public double calcularCosto() {
        int variacion = 3_000 * edad;
        return 45_000 + variacion;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 80_000 * edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return numeroPoliza;
    }

    @Override
    public void registrarVacuna(String nombre) {
        if (contadorVacunas < vacunas.length) {
            vacunas[contadorVacunas] = nombre;
            contadorVacunas++;
        }
    }

    @Override
    public int getVacunasAplicadas() {
        return contadorVacunas;
    }
}
