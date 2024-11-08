/**
 * A classe Main é o ponto de entrada do programa que cria uma infraestrutura aleatória e apresenta a lista de computadores, computadores x64 e consumo energético.
 *
 * @author Diogo Rodrigues
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
        NCSLab lab = new NCSLab(5,5,5);
        System.out.print("INFRAESTRUTURA ICT DO LABORATÓRIO NCS\n");
        lab.imprimirComputadores();
        lab.imprimirComputadoresX64();
        lab.imprimirConsumoEnergetico();
    }
}
