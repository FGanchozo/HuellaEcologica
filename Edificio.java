public class Edificio implements ImpactoEcologico {
    private String tipo;
    private double consumoEnergia;

    public Edificio(String tipo, double consumoEnergia) {
        this.tipo = tipo;
        this.consumoEnergia = consumoEnergia;
    }

    public String getTipo() {
        return tipo;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    @Override
    public double obtenerImpactoEcologico() {
        return consumoEnergia * 0.5; // Cálculo de impacto ecológico para edificios
    }
}
