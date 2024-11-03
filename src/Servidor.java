/**
 * Classe que representa um servidor, um substrato do termo computador.
 */
public class Servidor extends Computador {
    /**
     * Construtor da classe Servidor.
     * @param id Identificador único do servidor.
     * @param ram Quantidade de RAM do servidor.
     * @param disco Capacidade de armazenamento do disco do servidor.
     * @param cpu Frequência de relógio do CPU do servidor.
     * @param arquitetura Arquitetura do CPU do servidor (x64 ou ARM).
     */
    public Servidor(int id, int ram, int disco, double cpu, String arquitetura) {
        super(id, ram, disco, cpu, "Cloud", arquitetura);
    }

    /**
     * Método que calcula o consumo energético de um servidor.
     *
     * @return Consumo energético do servidor arredondado a uma casa decimal.
     */
    @Override
    public double calcularConsumoEnergetico() {
        double energia = 80 * getCpu();
        energia = Math.round(energia * 10.0) / 10.0;
        return energia;
    }
}