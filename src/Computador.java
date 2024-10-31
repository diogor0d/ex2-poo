import java.util.Random;

/**
 * Esta classe representa um computador que integra o Laboratório NCS.
 * Cada computador é, no geral, caracterizado pelo seu ID único, quantidade de RAM, capacidade de disco, CPU e tipo de arquitetura.
 */
public class Computador {
    /**
     * Identificador único de cada computador.
     */
    private int id;

    /**
     * Quantidade de RAM do computador.
     */
    private int ram;

    /**
     * Capacidade de armazenamento do disco do computador.
     */
    private int disco;

    /**
     * Frequencia de relógio do CPU do computador.
     */
    private double cpu;

    /**
     * Nível do computador na rede (Cloud, Edge, IOT.
     */
    private String nivel;

    /**
     * Arquitetura do CPU do computador (x64 ou ARM).
     */
    private String arquitetura;

    // Contador de ids a atribuir aos computadores
    private static int idCounter = 1;

    /**
     * Construtor da classe Computador.
     *
     * @param ram         Quantidade de RAM do computador.
     * @param disco       Capacidade de armazenamento do disco do computador.
     * @param cpu         Frequencia de relógio do CPU do computador.
     * @param nivel       Nível do computador na rede (Cloud, Edge, IOT).
     * @param arquitetura Arquitetura do CPU do computador (x64 ou ARM).
     */
    public Computador(int ram, int disco, double cpu, String nivel, String arquitetura) {
        this.id = idCounter++;
        this.ram = ram;
        this.disco = disco;
        this.cpu = cpu;
        this.nivel = nivel;
        this.arquitetura = arquitetura;
    }

    /**
     * Método que escolhe um valor aleatório de um array de inteiros.
     *
     * @param valores Array de inteiros.
     * @return Valor aleatório do array.
     */
    public static int escolherValorAleatorio(int[] valores) {
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
    public static double gerarCpuAleatoria(double min, double max) {
        Random random = new Random();
        double cpu = min + (max - min) * random.nextDouble();
        return Math.round(cpu * 10.0) / 10.0;  // Arredonda para uma casa decimal
    }


    /**
     * Método que gera uma arquitetura aleatória (x64 ou ARM).
     *
     * @return Arquitetura aleatória.
     */
    public static String gerarArquiteturaAleatoria() {
        Random random = new Random();
        return random.nextBoolean() ? "x64" : "ARM";
    }

    /**
     * Método que calcula o consumo energético do computador.
     *
     * @return Consumo energético do computador em Watts.
     */
    public double calcularConsumoEnergetico() {
        return 0;
    }


    /**
     * Método que devolve o ID do computador.
     *
     * @return ID do computador.
     */
    public int getId() {
        return id;
    }

    /**
     * Método que devolve a quantidade de RAM do computador.
     *
     * @return Quantidade de RAM do computador em GB.
     */
    public int getRam() {
        return ram;
    }

    /**
     * Método que devolve a capacidade de armazenamento do disco do computador.
     *
     * @return Capacidade de armazenamento do disco do computador em GB.
     */
    public int getDisco() {
        return disco;
    }

    /**
     * Método que devolve a frequência de relógio do CPU do computador.
     *
     * @return Frequência de relógio do CPU do computador em GHz.
     */
    public double getCpu() {
        return cpu;
    }

    /**
     * Método que devolve o nível do computador na rede.
     *
     * @return Nível do computador na rede.
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * Método que devolve a arquitetura do CPU do computador.
     *
     * @return Arquitetura do CPU do computador.
     */
    public String getArquitetura() {
        return arquitetura;
    }
}