public class Servidor extends Computador {
    private static final String nivel= "Cloud";
    private static final Boolean gpu = false;


    private static final int[] possivel_ram = {128, 256, 512};
    private static final int[] possivel_disco = {1024, 2048, 4096, 8192}; //confirmar porque no enunciado tem 10240

    public Servidor() {
        super(
                Computador.escolherValorAleatorio(possivel_ram),
                Computador.escolherValorAleatorio(possivel_disco),
                Computador.gerarCpuAleatoria(3.0, 4.0),
                nivel,
                gpu,
                Computador.gerarArquiteturaAleatoria()
        );
    }

    public double calcularConsumoEnergetico() {
        return 80 * getCpu();
    }

}