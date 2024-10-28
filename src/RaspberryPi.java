public class RaspberryPi extends Computador {
    private static final String nivel= "IoT";


    private static final int[] possivel_ram = {2, 4, 8};
    private static final int[] possivel_disco = {16, 32, 64, 128};

    public RaspberryPi() {
        super(
                Computador.escolherValorAleatorio(possivel_ram),
                Computador.escolherValorAleatorio(possivel_disco),
                Computador.gerarCpuAleatoria(1.0, 2.0),
                nivel,
                Computador.gerarArquiteturaAleatoria()
        );
    }

    public double calcularConsumoEnergetico() {
        double energia = 20 * getCpu();
        energia = Math.round(energia* 10.0) / 10.0;
        return energia;
    }
}