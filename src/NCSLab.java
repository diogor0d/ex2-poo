import java.util.ArrayList;
import java.util.Random;

/**
 * Esta classe representa o laboratório NCS que contém uma lista de computadores.
 */
public class NCSLab {
    /**
     * Lista de computadores do laboratório NCS.
     */
    private final ArrayList<Computador> computadores;

    /**
     * Construtor da classe NCSLab, recebe dados para inicialização.
     *
     * @param numServidores   Número de servidores a adicionar ao lab.
     * @param numLaptops      Número de laptops a adicionar ao lab.
     * @param numRaspberryPis Número de Raspberry Pis a adicionar ao lab.
     */
    public NCSLab(int numServidores, int numLaptops, int numRaspberryPis) {
        computadores = new ArrayList<>();

        String[] arquiteturasDisponiveis = {"x64", "ARM"};

        // Adiciona servidores
        int idCounter = 1;

        int[] ramsServidor = {128, 256, 512};
        int[] discosServidor = {1024, 2048, 4096, 8192};
        for (int i = 0; i < numServidores; i++) {
            computadores.add(new Servidor(idCounter++, escolherElementoAleatorio(ramsServidor), escolherElementoAleatorio(discosServidor), gerarCpuClockAleatorio(3.0, 4.0), escolherElementoAleatorio(arquiteturasDisponiveis)));
        }

        // Adiciona laptops
        int[] ramsLaptop = {16, 32, 64};
        int[] discosLaptop = {256, 512, 1024};
        for (int i = 0; i < numLaptops; i++) {
            computadores.add(new Laptop(idCounter++, escolherElementoAleatorio(ramsLaptop), escolherElementoAleatorio(discosLaptop), gerarCpuClockAleatorio(2.0, 3.0), gerarArquiteturaAleatoria(), gerarGpuAleatoria()));
        }

        // Adiciona Raspberry Pis
        int[] ramsRpi = {2, 4, 8};
        int[] discosRpi = {16, 32, 64, 128};
        for (int i = 0; i < numRaspberryPis; i++) {
            computadores.add(new RaspberryPi(idCounter++, escolherElementoAleatorio(ramsRpi), escolherElementoAleatorio(discosRpi), gerarCpuClockAleatorio(1.0, 2.0), gerarArquiteturaAleatoria()));
        }
    }

    /**
     * Método que escolhe um elemento aleatório dentro de um array de inteiros.
     *
     * @param valores Array de um tipo genérico.
     * @return Inteiro aleatório dentro do array.
     */
    private int escolherElementoAleatorio(int[] valores) {
        Random random = new Random();
        return valores[random.nextInt(valores.length)];
    }

    /**
     * Método que escolhe um elemento aleatório dentro de um array de strings.
     *
     * @param valores Array de strings.
     * @return String aleatório dentro do array.
     */
    private String escolherElementoAleatorio(String[] valores) {
        Random random = new Random();
        return valores[random.nextInt(valores.length)];
    }

    /**
     * Método que gera uma frequência de relógio aleatória dentro de um intervalo.
     *
     * @param min Valor mínimo da CPU.
     * @param max Valor máximo da CPU.
     * @return frequência de relógio aleatória em GHz arredondada à primeira casa.
     */
    private double gerarCpuClockAleatorio(double min, double max) {
        Random random = new Random();
        double cpu = min + (max - min) * random.nextDouble();
        return Math.round(cpu * 10.0) / 10.0;  // Arredonda para uma casa decimal
    }

    /**
     * Método que gera uma arquitetura aleatória (x64 ou ARM).
     *
     * @return Arquitetura aleatória.
     */
    public String gerarArquiteturaAleatoria() {
        Random random = new Random();
        return random.nextBoolean() ? "x64" : "ARM";
    }

    /**
     * Método que gera um valor booleano aleatório para a existência de uma gpu no laptop.
     *
     * @return Valor booleano aleatório.
     */
    private boolean gerarGpuAleatoria() {
        Random random = new Random();
        return random.nextBoolean();
    }

    /**
     * Método que imprime os computadores da infraestrutura ICT do laboratório NCS.
     */
    public void imprimirComputadores() {
        System.out.println("COMPUTADORES:");
        for (Computador computador : computadores) {
            System.out.println(computador);
        }
        System.out.print("\n");
    }

    /**
     * Método que imprime os computadores com arquitetura x64 da infraestrutura ICT do laboratório NCS.
     */
    public void imprimirComputadoresX64() {
        System.out.println("COMPUTADORES DE ARQUITETURA x64:");
        for (Computador computador : computadores) {
            if ("x64".equals(computador.getArquitetura())) {
                System.out.println("ID: " + computador.getId());
            }
        }
        System.out.print("\n");
    }

    /**
     * Método que imprime o consumo energético (em Watts) dos computadores da infraestrutura ICT do laboratório NCS.
     */
    public void imprimirConsumoEnergetico() {
        System.out.println("CONSUMOS ENERGÉTICOS DOS COMPUTADORES:");
        for (Computador computador : computadores) {
            System.out.printf("ID: %d > CONSUMO: %.1f W\n", computador.getId(), computador.calcularConsumoEnergetico());
        }
    }


    /**
     * Método que retorna a lista de computadores do laboratório NCS.
     *
     * @return Lista de computadores.
     */
    public ArrayList<Computador> getComputadores() {
        return computadores;
    }
}