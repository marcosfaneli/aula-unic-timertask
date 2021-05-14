package monitorcomputador;

import java.util.Timer;

/**
 *
 * @author faneli
 */
public class Agendador {
    
    public Agendador(String endereco, long tempo){
        Testador t = new Testador(endereco);
        Timer timer = new Timer();
        timer.schedule(t, 0, tempo);
    }
    
}
