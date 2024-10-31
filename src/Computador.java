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

    /**
     * Contador de IDs dos computadores.
     */
    private int idCounter = 1;

    /**
     * Construtor da classe Computador.
     *
     * @param ram         Quantidade de RAM do computador.
     * @param disco       Capacidade de armazenamento do disco do computador.
     * @param cpu         Frequencia de relógio do CPU do computador.
     * @param nivel       Nível do computador na rede (Cloud, Edge, IOT).
     * @param arquitetura Arquitetura do CPU do computador (x64 ou ARM).
     */
    public Computador(int id, int ram, int disco, double cpu, String nivel, String arquitetura) {
        this.id = id;
        this.ram = ram;
        this.disco = disco;
        this.cpu = cpu;
        this.nivel = nivel;
        this.arquitetura = arquitetura;
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

    /**
     * Método que devolve uma representação textual do computador (genérico).
     *
     * @return Representação em string do computador.
     */
    public String toString() {
        return "ID: " + getId() +
                ", RAM: " + getRam() +
                "GB, Disco: " + getDisco() +
                "GB, CPU: " + getCpu() +
                "GHz, Nível: " + getNivel() +
                ", Arquitetura: " + getArquitetura();
    }
}