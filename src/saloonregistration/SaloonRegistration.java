/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saloonregistration;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class SaloonRegistration {
    
        SaloonRegistration(){
            
        JFrame frame = new JFrame("Saloon Registration System");
        frame.setSize(300, 300);
        
        JLabel jlTop = new JLabel("Saloon Registration System");
        jlTop.setBounds(70, 20, 200, 60);
        frame.add(jlTop);
        
        //Username
        JLabel jlUsername = new JLabel("Username");
        jlUsername.setBounds(50, 70, 60, 20);
        frame.add(jlUsername);
        
        JTextField jtfUsername = new JTextField();
        jtfUsername.setBounds(120, 70, 120, 20);
        frame.add(jtfUsername);
        
        //Password
        JLabel jlPass = new JLabel("Password");
        jlPass.setBounds(50, 90, 60, 20);
        frame.add(jlPass);
  
        JTextField jtfPass = new JTextField();
        jtfPass.setBounds(120, 90, 120, 20);
        frame.add(jtfPass);
        
        //First time login
        JLabel jlfirst = new JLabel("First time login?");
        jlfirst.setBounds(150, 130, 100, 20);
        frame.add(jlfirst);
        
        //Forgot Passwprd
        JLabel jlResert = new JLabel("Forgot Password?");
        jlResert.setBounds(135, 110, 120, 20);
        frame.add(jlResert);


        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new SaloonRegistration();
    }
    
}
