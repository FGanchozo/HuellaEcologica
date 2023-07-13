public class Auto implements ImpactoEcologico {
    private String marca;
    private double consumoCombustible;

    public Auto(String marca, double consumoCombustible) {
        this.marca = marca;
        this.consumoCombustible = consumoCombustible;
    }

    public String getMarca() {
        return marca;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Calcular el impacto ecológico del auto
        // Aquí puedes implementar la fórmula adecuada según la información que consultaste
        // por ejemplo, si el consumoCombustible está en litros por kilómetro y la emisión de CO2
        // está en gramos por litro, puedes utilizar una fórmula como esta:
        // impactoEcológico = consumoCombustible * emisionesCO2;
        // Donde emisionesCO2 es un factor determinado por las características del combustible utilizado.

        // En este ejemplo, simplemente retornaremos el consumo de combustible del auto
        return consumoCombustible;
    }
}
