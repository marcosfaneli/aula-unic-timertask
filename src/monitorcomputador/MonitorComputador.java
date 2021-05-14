/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitorcomputador;

/**
 *
 * @author faneli
 */
public class MonitorComputador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agendador agenda1 = new Agendador("192.168.0.1", 5000);
        Agendador agenda2 = new Agendador("192.168.0.238", 5000);
        Agendador agenda3 = new Agendador("8.8.4.4", 5000);
        Agendador agenda4 = new Agendador("8.8.2.2", 5000);
    }
    
}
