/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartmark;

import Views.LoginSmartMark;

/**
 *
 * @author FireX
 */
public class SmartMark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            LoginSmartMark loginForm = new LoginSmartMark();
                
                loginForm.setVisible(true);
            }
        });  
    }
    
}
