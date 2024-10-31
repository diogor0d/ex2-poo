/**
 * Classe que representa um computador RaspberryPi.
 */
public class RaspberryPi extends Computador {

    /**
     * Construtor da classe RaspberryPi.
     */
    public RaspberryPi(int id, int ram, int disco, double cpu, String arquitetura) {
        super(id, ram, disco, cpu, "IoT", arquitetura);
    }

    /**
     * Método que calcula o consumo energético de um RaspberryPi.
     *
     * @return Consumo energético do RaspberryPi.
     */
    @Override
    public double calcularConsumoEnergetico() {
        double energia = 20 * getCpu();
        energia = Math.round(energia * 10.0) / 10.0;
        return energia;
    }
}