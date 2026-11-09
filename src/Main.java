public class Main {
    public static void main(String[] args) {
        System.out.println("Fichas con referencia polimórfica:");
        Animal[] animales = new Animal[] {
                new Perro("Maya", 3, "Diego", "Pitbull", "POL-PERRO-001"),
                new Gato("Simba", 2, "Esperanza", true, "POL-GATO-002"),
                new Ave("Felipe", 1, "Leidy", 150.0)
        };

        for (Animal a : animales) {
            a.imprimirFicha();
        }

        Perro miPerro = new Perro("Max", 4, "Sofia", "Golden Retriever", "POL-PERRO-003");
        Gato miGato = new Gato("Bella", 3, "Javier", false, "POL-GATO-004");

        miPerro.registrarVacuna("Rabia");
        miPerro.registrarVacuna("Parvovirus");
        miGato.registrarVacuna("Triple Felina");

        System.out.println("El perro " + miPerro.nombre + " tiene " + miPerro.getVacunasAplicadas() + " vacunas aplicadas.");
        System.out.println("El gato " + miGato.nombre + " tiene " + miGato.getVacunasAplicadas() + " vacuna aplicada.");

        Clinica vetCare = new Clinica("VetCare", "Calle 100 #12-36");

        Asegurable[] asegurables = new Asegurable[] {
                new Perro("Rex", 5, "Luisa", "Bulldog", "POL-PERRO-005"),
                new Gato("Coco", 4, "Mario", true, "POL-GATO-006"),
                vetCare
        };

        for (Asegurable aseg : asegurables) {
            System.out.println("Póliza: " + aseg.obtenerNumeroPoliza() + " | Prima Anual: $" + aseg.calcularPrimaSeguro());
        }

        Animal[] animalesConConejo = new Animal[] {
                new Perro("Firulais", 3, "Camilo", "Salchicha", "POL-PERRO-001"),
                new Gato("Michi", 2, "Lorena", true, "POL-GATO-002"),
                new Ave("Roberto", 1, "Isabella", 150.0),
                new Conejo("Bugs", 2, "Mateo")
        };

        for (Animal a : animalesConConejo) {
            a.imprimirFicha();
        }
    }
}