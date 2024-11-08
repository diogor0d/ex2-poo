/**
 * Esta classe representa um computador portátil que integra o Laboratório NCS.
 */
public class Laptop extends Computador {
    /**
     * O atributo booleano gpu é um valor exclusivo à subclasse laptop que caracteriza a existência de uma gpu no laptop.
     */
    private final boolean gpu;

    /**
     * Construtor da classe Laptop, recebe dados para inicialização.
     * @param id Identificador único do laptop.
     * @param ram Quantidade de RAM do laptop.
     * @param disco Capacidade de armazenamento do disco do laptop.
     * @param cpu Frequência de relógio do CPU do laptop.
     * @param arquitetura Arquitetura do CPU do laptop (x64 ou ARM).
     * @param gpu Existência de uma GPU no laptop.
     */
    public Laptop(int id, int ram, int disco, double cpu, String arquitetura, boolean gpu) {
        super(id, ram, disco, cpu, "Edge", arquitetura);
        this.gpu = gpu;
    }

    /**
     * Método que calcula o consumo energético de um laptop.
     *
     * @return Consumo energético do laptop arredondado a uma casa decimal.
     */
    @Override
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

    /**
     * Método que devolve uma representação textual de um laptop.
     * Override do método toString() da classe Computador, uma vez que Laptop tem um atributo extra (gpu).
     *
     * @return Representação em string do laptop.
     */
    public String toString() {
        return "ID: " + getId() + ", RAM: " + getRam() + "GB, Disco: " + getDisco() + "GB, CPU: " + getCpu() + "GHz, Nível: " + getNivel() + ", Arquitetura: " + getArquitetura() + ", GPU: " + (getGpu() ? "Sim" : "Não");
    }
}