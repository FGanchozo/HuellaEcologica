public class Bicicleta implements ImpactoEcologico {
    private String tipo;
    private double peso;

    public Bicicleta(String tipo, double peso) {
        this.tipo = tipo;
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public double obtenerImpactoEcologico() {
        return peso * 0.1; // Cálculo de impacto ecológico para bicicletas
    }
}
