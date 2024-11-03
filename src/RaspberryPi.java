/**
 * Classe que representa um computador RaspberryPi.
 */
public class RaspberryPi extends Computador {

    /**
     * Construtor da classe RaspberryPi.
     * @param id Identificador único do RaspberryPi.
     * @param ram Quantidade de RAM do RaspberryPi.
     * @param disco Capacidade de armazenamento do disco do RaspberryPi.
     * @param cpu Frequência de relógio do CPU do RaspberryPi.
     * @param arquitetura Arquitetura do CPU do RaspberryPi (x64 ou ARM).
     */
    public RaspberryPi(int id, int ram, int disco, double cpu, String arquitetura) {
        super(id, ram, disco, cpu, "IoT", arquitetura);
    }

    /**
     * Método que calcula o consumo energético de um RaspberryPi.
     *
     * @return Consumo energético do RaspberryPi arredondado a uma casa decimal.
     */
    @Override
    public double calcularConsumoEnergetico() {
        double energia = 20 * getCpu();
        energia = Math.round(energia * 10.0) / 10.0;
        return energia;
    }
}