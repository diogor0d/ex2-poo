import java.util.ArrayList;
import java.util.Collections;

public class NCSLab {
    private ArrayList<Computador> computadores;

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

    public ArrayList<Computador> getComputadores() {
        return computadores;

    }
}