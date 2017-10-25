
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JButton;
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
public class gamePanel extends JPanel {
    
    private JButton rb1;
    private JButton lb1;
    private JButton lb2;
    private JButton lb3;
    
    public gamePanel(){
       super();
       setFocusable(true);
       setLayout(null);
       
       rb1= new JButton("RB");
       rb1.setBackground(Color.blue);
       lb1 = new JButton("LB");
       lb2 = new JButton("LB");
       lb3 = new JButton("LB");
       lb1.setBackground(Color.red);
       lb2.setBackground(Color.red);
       lb3.setBackground(Color.red);
       
       add(rb1);
       add(lb1);
       add(lb2);
       add(lb3);
         
      
    }
   
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image background = Toolkit.getDefaultToolkit().getImage("images/field3.jpeg");
        g.drawImage(background, 0, 0,getWidth(),getHeight(), this);
        requestFocusInWindow();    
    }
    
    public void setBlue(){
        getRb1().setBackground(Color.blue);
    }
    
    public void setGreen(){
        getRb1().setBackground(Color.green);
    }
    
    public void setYellow(){
        getRb1().setBackground(Color.yellow);
    }
    
    public void setLb1Move(Rectangle l1){
        getLb1().setBounds(new Rectangle(l1));
    }
    
    public void setLb2Move(Rectangle l2){
        getLb2().setBounds(new Rectangle(l2));
    }
    
    public void setLb3Move(Rectangle l3){
        getLb3().setBounds(new Rectangle(l3));
    }
    
    public void setRbMove(Rectangle r1){
        getRb1().setBounds(new Rectangle(r1));
    }
    
    /**
     * @return the rb1
     */
    public JButton getRb1() {
        return rb1;
    }

    /**
     * @param rb1 the rb1 to set
     */
    public void setRb1(JButton rb1) {
        this.rb1 = rb1;
    }

    /**
     * @return the lb1
     */
    public JButton getLb1() {
        return lb1;
    }

    /**
     * @param lb1 the lb1 to set
     */
    public void setLb1(JButton lb1) {
        this.lb1 = lb1;
    }

    /**
     * @return the lb2
     */
    public JButton getLb2() {
        return lb2;
    }

    /**
     * @param lb2 the lb2 to set
     */
    public void setLb2(JButton lb2) {
        this.lb2 = lb2;
    }

    /**
     * @return the lb3
     */
    public JButton getLb3() {
        return lb3;
    }

    /**
     * @param lb3 the lb3 to set
     */
    public void setLb3(JButton lb3) {
        this.lb3 = lb3;
    }
    
}
