import java.util.Random;

public class Laptop extends Computador {
    private static final String nivel= "Edge";


    private static final int[] possivel_ram = {16, 32, 64};
    private static final int[] possivel_disco = {256, 512, 1024};

    public Laptop() {
        super(
                Computador.escolherValorAleatorio(possivel_ram),
                Computador.escolherValorAleatorio(possivel_disco),
                Computador.gerarCpuAleatoria(2.0, 3.0),
                nivel,
                gerarGpuAleatoria(),
                Computador.gerarArquiteturaAleatoria()
        );
    }

    private static boolean gerarGpuAleatoria() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public double calcularConsumoEnergetico() {
        double energia = 50 * getCpu();
        if(getGpu()){
            energia*=1.2;
        }
        return energia;
    }
}