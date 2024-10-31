import java.util.ArrayList;
import java.util.Random;

/**
 * Esta classe representa o laboratório NCS que contém uma lista de computadores.
 */
public class NCSLab {
    /**
     * Lista de computadores do laboratório NCS.
     */
    private ArrayList<Computador> computadores;

    /**
     * Contador de IDs dos computadores.
     */
    private int idCounter = 1;

    // Servidor
    /**
     * Possíveis valores de RAM para um servidor.
     */
    private final int[] rams_servidor = {128, 256, 512};
    /**
     * Possíveis valores de disco para um servidor.
     */
    private final int[] discos_servidor = {1024, 2048, 4096, 8192};

    // Laptop

    /**
     * Possíveis valores de RAM para um laptop.
     */
    private final int[] rams_laptop = {16, 32, 64};
    /**
     * Possíveis valores de disco para um laptop.
     */
    private final int[] discos_laptop = {256, 512, 1024};

    // Raspberry Pi

    /**
     * Possíveis valores de RAM para um RaspberryPi.
     */
    private final int[] rams_rpi = {2, 4, 8};
    /**
     * Possíveis valores de disco para um RaspberryPi.
     */
    private final int[] discos_rpi = {16, 32, 64, 128};

    /**
     * Construtor da classe NCSLab.
     */
    public NCSLab() {
        computadores = new ArrayList<>();

        // Adiciona 5 servidores
        for (int i = 0; i < 5; i++) {
            computadores.add(new Servidor(idCounter++, escolherValorAleatorio(rams_servidor), escolherValorAleatorio(discos_servidor), gerarCpuAleatoria(3.0, 4.0), gerarArquiteturaAleatoria()));
        }

        // Adiciona 5 laptops
        for (int i = 0; i < 5; i++) {
            computadores.add(new Laptop(idCounter++, escolherValorAleatorio(rams_laptop), escolherValorAleatorio(discos_laptop), gerarCpuAleatoria(2.0, 3.0), gerarArquiteturaAleatoria(), gerarGpuAleatoria()));
        }

        // Adiciona 5 Raspberry Pis
        for (int i = 0; i < 5; i++) {
            computadores.add(new RaspberryPi(idCounter++, escolherValorAleatorio(rams_rpi), escolherValorAleatorio(discos_rpi), gerarCpuAleatoria(1.0, 2.0), gerarArquiteturaAleatoria()));
        }
    }

    /**
     * Método que escolhe um valor aleatório dentro de um array de inteiros.
     *
     * @param valores Array de inteiros.
     * @return Valor aleatório dentro do array.
     */
    public int escolherValorAleatorio(int[] valores) {
        Random random = new Random();
        return valores[random.nextInt(valores.length)];
    }

    /**
     * Método que gera uma frequência de relógio aleatória dentro de um intervalo.
     *
     * @param min Valor mínimo da CPU.
     * @param max Valor máximo da CPU.
     * @return frequência de relógio aleatória em GHz.
     */
    public double gerarCpuAleatoria(double min, double max) {
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
     *
     * @param computadores Lista de computadores.
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
     *
     * @param computadores Lista de computadores com arquitetura x64.
     */
    public void mostrarComputadoresX64() {
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
     *
     * @param computadores Lista de computadores.
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