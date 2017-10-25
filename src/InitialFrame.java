
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brend
 */
public class InitialFrame extends JFrame {
    
    private InitialPanel ip;
    
    InitialFrame(){
       super("The Tackle Breaking Runningback!");
       ip = new InitialPanel();
       add(ip);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize (1800, 1000);
       setVisible(true);
    }

    /**
     * @return the ip
     */
    public InitialPanel getIp() {
        return ip;
    }

    /**
     * @param ip the ip to set
     */
    public void setIp(InitialPanel ip) {
        this.ip = ip;
    }
    
}
