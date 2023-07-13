import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de Edificio, Auto y Bicicleta
        Edificio edificio = new Edificio("Edificio A", 400);
        Auto auto = new Auto("Toyota", 30);
        Bicicleta bicicleta = new Bicicleta("Deportiva", 5);

        // Crear ArrayList de tipo ImpactoEcologico y agregar los objetos
        ArrayList<ImpactoEcologico> objetos = new ArrayList<>();
        objetos.add(edificio);
        objetos.add(auto);
        objetos.add(bicicleta);

        // Iterar sobre el ArrayList y obtener el impacto ecológico de cada objeto
        for (ImpactoEcologico objeto : objetos) {
            System.out.println("Objeto: " + objeto.getClass().getSimpleName());
            System.out.println("Impacto ecológico: " + objeto.obtenerImpactoEcologico());
            System.out.println("------------------------");
        }
    }
}
