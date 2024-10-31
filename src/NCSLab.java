import java.util.ArrayList;

/**
 * Esta classe representa o laboratório NCS que contém uma lista de computadores.
 */
public class NCSLab {
    /**
     * Lista de computadores do laboratório NCS.
     */
    private ArrayList<Computador> computadores;

    /**
     * Construtor da classe NCSLab.
     */
    public NCSLab() {
        computadores = new ArrayList<>();

        // Adiciona 5 servidores
        for (int i = 0; i < 5; i++) {
            computadores.add(new Servidor());
        }

        // Adiciona 5 laptops
        for (int i = 0; i < 5; i++) {
            computadores.add(new Laptop());
        }

        // Adiciona 5 Raspberry Pis
        for (int i = 0; i < 5; i++) {
            computadores.add(new RaspberryPi());
        }
    }

    /**
     * Método que retorna a lista de computadores do laboratório NCS.
     * @return Lista de computadores.
     */
    public ArrayList<Computador> getComputadores() {
        return computadores;
    }
}