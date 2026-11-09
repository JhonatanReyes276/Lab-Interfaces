public class Gato extends Animal implements Vacunable, Asegurable {
    private boolean esEsterilizado;
    private String [] vacunas;
    private String numeroPoliza;
    private int contadorVacunas;

    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado, String numeroPoliza) {
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
        this.vacunas = new String[5];
        this.numeroPoliza = numeroPoliza;
        this.contadorVacunas = 0;
    }

    public boolean isEsEsterilizado() {
        return esEsterilizado;
    }

    @Override
    public double calcularCosto() {
        return 38_000;
    }


    @Override
    public double calcularPrimaSeguro() {
        if (esEsterilizado) {
            return 120_000;
        }
        else {
            return 200_000;
        }
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
