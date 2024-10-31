/**
 * Classe que representa um servidor, um substrato do termo computador.
 */
public class Servidor extends Computador {
    /**
     * Construtor da classe Servidor.
     */
    public Servidor(int id, int ram, int disco, double cpu, String arquitetura) {
        super(id, ram, disco, cpu, "Cloud", arquitetura);
    }

    /**
     * Método que calcula o consumo energético de um servidor.
     *
     * @return Consumo energético do servidor.
     */
    @Override
    public double calcularConsumoEnergetico() {
        double energia = 80 * getCpu();
        energia = Math.round(energia * 10.0) / 10.0;
        return energia;
    }
}