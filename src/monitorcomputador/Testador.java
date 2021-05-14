/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitorcomputador;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.TimerTask;

/**
 *
 * @author faneli
 */
public class Testador extends TimerTask {
    
    private String endereco;
    
    public Testador(String endereco){
        this.endereco = endereco;
    }
    
    public void pingar() {
        InetAddress computador;
        
        try {
            computador = InetAddress.getByName(endereco);
            
            if(computador.isReachable(2000) == true){
                System.out.println("Endereço "+endereco+" esta online");
            }else{
                System.out.println("Endereço "+endereco+" esta offline");
            }
        } catch (UnknownHostException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void run() {
        pingar();
    }
    
}
