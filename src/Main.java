import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NCSLab lab = new NCSLab();
        imprimirComputadores(lab.getComputadores());
        mostrarComputadoresX64(lab.getComputadores());
        imprimirConsumoEnergetico(lab.getComputadores());
    }

    public static void imprimirComputadores(ArrayList<Computador> computadores) {
        System.out.println("Todos os computadores:");
        for (Computador computador : computadores) {
            System.out.println(
                    "ID: " + computador.getId() +
                            ", RAM: " + computador.getRam() +
                            ", Disco: " + computador.getDisco() +
                            ", CPU: " + computador.getCpu() +
                            ", Nível: " + computador.getNivel()+
                            "       GPU: " + computador.getGpu() +
                            ", Arquitetura; " + computador.getArquitetura()
            );
        }
    }

    public static void mostrarComputadoresX64(ArrayList<Computador> computadores) {
        System.out.println("\nComputadores de arquitetura x64:");
        for (Computador computador : computadores) {
            if ("x64".equals(computador.getArquitetura())) {
                System.out.println(
                        "ID: " + computador.getId()
                );


            }
        }
    }

    public static void imprimirConsumoEnergetico(ArrayList<Computador> computadores) {
        System.out.println("\nConsumo Energético dos Computadores:");
        for (Computador computador : computadores) {
            System.out.println(
                    "ID: " + computador.getId() + ", Consumo Energético: " + computador.calcularConsumoEnergetico() + " W"
            );
        }
    }

}