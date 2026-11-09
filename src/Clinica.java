public class Clinica implements Asegurable{
    private String nombre;
    private String direccion;
    private String numeroPoliza;

    public Clinica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroPoliza = "POL-CLINICA-" + nombre.toUpperCase();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 5_000_000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return numeroPoliza;
    }
}
