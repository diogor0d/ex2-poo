import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NCSLab lab = new NCSLab();
        System.out.print("INFRAESTRUTURA ICT DO LABORATÓRIO NCS\n");
        imprimirComputadores(lab.getComputadores());
        mostrarComputadoresX64(lab.getComputadores());
        imprimirConsumoEnergetico(lab.getComputadores());
    }

    public static void imprimirComputadores(ArrayList<Computador> computadores) {
        System.out.println("COMPUTADORES:");
        for (Computador computador : computadores) {
            System.out.println(
                    "ID: " + computador.getId() +
                            ", RAM: " + computador.getRam() +
                            ", Disco: " + computador.getDisco() +
                            ", CPU: " + computador.getCpu() +
                            ", Nível: " + computador.getNivel()+
                            "       (GPU: " + computador.getGpu() +
                            ", Arquitetura: " + computador.getArquitetura() +")"
            );
        }
        System.out.print("\n");
    }

    public static void mostrarComputadoresX64(ArrayList<Computador> computadores) {
            System.out.println("COMPUTADORES DE ARQUITETURA x64:");
        for (Computador computador : computadores) {
            if ("x64".equals(computador.getArquitetura())) {
                System.out.println(
                        "ID: " + computador.getId()
                );
            }
        }
        System.out.print("\n");
    }

    public static void imprimirConsumoEnergetico(ArrayList<Computador> computadores) {
        System.out.println("CONSUMOS ENERGÉTICOS DOS COMPUTADORES:");
        for (Computador computador : computadores) {
            System.out.println(
                    "ID: " + computador.getId() + ", Consumo Energético: " + computador.calcularConsumoEnergetico() + " W"
            );
        }
    }
}