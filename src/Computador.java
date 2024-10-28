import java.util.Random;

public class Computador {
    private int id;
    private int ram;
    private int disco;
    private double cpu;
    private String nivel;
    private Boolean gpu;
    private String arquitetura;

    private static int idCounter = 1;

    // Construtor
    public Computador(int ram, int disco, double cpu, String nivel, Boolean gpu, String arquitetura) {
        this.id = idCounter++;
        this.ram = ram;
        this.disco = disco;
        this.cpu = cpu;
        this.nivel = nivel;
        this.gpu = gpu;
        this.arquitetura = arquitetura;
    }

    public static int escolherValorAleatorio(int[] valores) {
        Random random = new Random();
        return valores[random.nextInt(valores.length)];
    }

    public static double gerarCpuAleatoria(double min, double max) {
        Random random = new Random();
        double cpu = min + (max - min) * random.nextDouble();
        return Math.round(cpu * 10.0) / 10.0;  // Arredonda para uma casa decimal
    }


    public static String gerarArquiteturaAleatoria() {
        Random random = new Random();
        return random.nextBoolean() ? "x64" : "ARM";
    }

    public double calcularConsumoEnergetico() {
        return 0;
    }





    public int getId() {
        return id;
    }
    public int getRam() {
        return ram;
    }
    public int getDisco() {
        return disco;
    }
    public double getCpu() {
        return cpu;
    }
    public String getNivel() {
        return nivel;
    }
    public Boolean getGpu() {
        return gpu;
    }
    public String getArquitetura() {
        return arquitetura;
    }
}