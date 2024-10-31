public class RaspberryPi extends Computador {
    /**
     * Nível do computador RespberryPi na rede (Cloud, Edge, IOT.
     */
    private static final String nivel = "IoT";

    /**
     * Possíveis valores de RAM para um RaspberryPi.
     */
    private static final int[] possivel_ram = {2, 4, 8};

    /**
     * Possíveis valores de disco para um RaspberryPi.
     */
    private static final int[] possivel_disco = {16, 32, 64, 128};

    /**
     * Construtor da classe RaspberryPi.
     */
    public RaspberryPi() {
        super(
                Computador.escolherValorAleatorio(possivel_ram),
                Computador.escolherValorAleatorio(possivel_disco),
                Computador.gerarCpuAleatoria(1.0, 2.0),
                nivel,
                Computador.gerarArquiteturaAleatoria()
        );
    }

    /**
     * Método que calcula o consumo energético de um RaspberryPi.
     *
     * @return Consumo energético do RaspberryPi.
     */
    public double calcularConsumoEnergetico() {
        double energia = 20 * getCpu();
        energia = Math.round(energia * 10.0) / 10.0;
        return energia;
    }
}