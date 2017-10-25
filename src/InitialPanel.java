
import java.awt.BorderLayout;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brend
 */
public class InitialPanel extends JPanel {
    
    private gamePanel gp;
    private ScorePanel sp;
    
    InitialPanel(){
        super();
        BorderLayout bl = new BorderLayout();
        gp = new gamePanel();
        sp = new ScorePanel();
        setLayout(bl);
        add(sp,BorderLayout.NORTH);
        add(gp, BorderLayout.CENTER);
    }

    /**
     * @return the gp
     */
    public gamePanel getGp() {
        return gp;
    }

    /**
     * @param gp the gp to set
     */
    public void setGp(gamePanel gp) {
        this.gp = gp;
    }

    /**
     * @return the sp
     */
    public ScorePanel getSp() {
        return sp;
    }

    /**
     * @param sp the sp to set
     */
    public void setSp(ScorePanel sp) {
        this.sp = sp;
    }
    
}
