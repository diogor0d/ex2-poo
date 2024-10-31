/**
 * Classe que representa um servidor, um substrato do termo computador.
 */
public class Servidor extends Computador {

    /**
     * Nível do computador "Servidor" na rede (Cloud, Edge, IOT.
     */
    private static final String nivel = "Cloud";

    /**
     * Possíveis valores de RAM para um servidor.
     */
    private static final int[] possivel_ram = {128, 256, 512};

    /**
     * Possíveis valores de disco para um servidor.
     */
    private static final int[] possivel_disco = {1024, 2048, 4096, 8192};

    /**
     * Construtor da classe Servidor.
     */
    public Servidor() {
        super(
                Computador.escolherValorAleatorio(possivel_ram),
                Computador.escolherValorAleatorio(possivel_disco),
                Computador.gerarCpuAleatoria(3.0, 4.0),
                nivel,
                Computador.gerarArquiteturaAleatoria()
        );
    }

    /**
     * Método que calcula o consumo energético de um servidor.
     *
     * @return Consumo energético do servidor.
     */
    public double calcularConsumoEnergetico() {
        double energia = 80 * getCpu();
        energia = Math.round(energia * 10.0) / 10.0;
        return energia;
    }
}