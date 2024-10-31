import java.util.Random;

/**
 * Esta classe representa um computador portátil que integra o Laboratório NCS.
 */
public class Laptop extends Computador {
    /**
     * Nível do computador "Laptop" na rede (Cloud, Edge, IOT.
     */
    private static final String nivel = "Edge";

    /**
     * O atributo booleano gpu é um valor exclusivo à subclasse laptop que caracteriza a existência de uma gpu no laptop.
     */
    private boolean gpu;

    /**
     * Possíveis valores de RAM para um laptop.
     */
    private static final int[] possivel_ram = {16, 32, 64};

    /**
     * Possíveis valores de disco para um laptop.
     */
    private static final int[] possivel_disco = {256, 512, 1024};

    /**
     * Construtor da classe Laptop.
     */
    public Laptop() {
        super(
                Computador.escolherValorAleatorio(possivel_ram),
                Computador.escolherValorAleatorio(possivel_disco),
                Computador.gerarCpuAleatoria(2.0, 3.0),
                nivel,
                Computador.gerarArquiteturaAleatoria()
        );
        this.gpu = gerarGpuAleatoria();
    }

    /**
     * Método que gera um valor booleano aleatório para a existência de uma gpu no laptop.
     *
     * @return Valor booleano aleatório.
     */
    private static boolean gerarGpuAleatoria() {
        Random random = new Random();
        return random.nextBoolean();
    }

    /**
     * Método que calcula o consumo energético de um laptop.
     *
     * @return Consumo energético do laptop.
     */
    public double calcularConsumoEnergetico() {
        double energia = 50 * getCpu();
        if (getGpu()) {
            energia *= 1.2;
        }
        energia = Math.round(energia * 10.0) / 10.0;
        return energia;
    }

    /**
     * Método que retorna o valor do atributo gpu.
     *
     * @return Valor do atributo gpu.
     */
    public Boolean getGpu() {
        return gpu;
    }
}