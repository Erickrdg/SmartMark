/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoresview;

import SmartConexion.SQLServerConnection;
import Views.BConsumiblesView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author FireX
 */
public class ControladorBConsumible implements ActionListener {

    BConsumiblesView consumibles;
    SQLServerConnection connectio;
    
    public ControladorBConsumible() {
    }

    public ControladorBConsumible(BConsumiblesView consumibles, SQLServerConnection connectio) {
        this.consumibles = consumibles;
        this.connectio = connectio;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    switch (e.getActionCommand()){
         
        
        
    }
    }
    
    
    
}
