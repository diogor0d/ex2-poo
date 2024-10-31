import java.util.ArrayList;

/**
 * A classe Main é o ponto de entrada do programa que cria uma infraestrutura aleatória e apresenta a lista de computadores, computadores x64 e consumo energético.
 * @author Diogo Rodrigues 2022257625
 * @author João Cruz
 * @version 1.0
 */
public class Main {

    /**
     * Método principal que imprime a infraestrutura ICT do laboratório NCS.
     *
     * @param args Argumentos da linha de comandos.
     */
    public static void main(String[] args) {
        NCSLab lab = new NCSLab();
        System.out.print("INFRAESTRUTURA ICT DO LABORATÓRIO NCS\n");
        imprimirComputadores(lab.getComputadores());
        mostrarComputadoresX64(lab.getComputadores());
        imprimirConsumoEnergetico(lab.getComputadores());
    }

    /**
     * Método que imprime os computadores da infraestrutura ICT do laboratório NCS.
     *
     * @param computadores Lista de computadores.
     */
    public static void imprimirComputadores(ArrayList<Computador> computadores) {
        System.out.println("LISTAGEM DE COMPUTADORES:");
        for (Computador computador : computadores) {
            System.out.println(
                    "ID: " + computador.getId() +
                            ", RAM: " + computador.getRam() +
                            ", Disco: " + computador.getDisco() +
                            ", CPU: " + computador.getCpu() +
                            ", Nível: " + computador.getNivel() +
                            ", (Arquitetura: " + computador.getArquitetura() + ")"
            );
        }
        System.out.print("\n");
    }

    /**
     * Método que imprime os computadores de arquitetura x64 da infraestrutura ICT do laboratório NCS.
     *
     * @param computadores Lista de computadores.
     */
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

    /**
     * Método que imprime o consumo energético (em Watts) dos computadores da infraestrutura ICT do laboratório NCS.
     *
     * @param computadores Lista de computadores.
     */
    public static void imprimirConsumoEnergetico(ArrayList<Computador> computadores) {
        System.out.println("CONSUMOS ENERGÉTICOS DOS COMPUTADORES:");
        for (Computador computador : computadores) {
            System.out.println(
                    "ID: " + computador.getId() + ", Consumo Energético: " + computador.calcularConsumoEnergetico() + " W"
            );
        }
    }
}