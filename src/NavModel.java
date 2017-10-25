
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brend
 */
public class NavModel {
   
    
    private int delay = 600;
    private int moveX = 1;
    private int moveY = 1;
    private int touchCounter = 0;
    private int tackleCounter = 0;
    private int xX = 100;
    private int yY = 400;
    private Rectangle r1 = new Rectangle(xX,yY,80,80);
    private Rectangle l1 = new Rectangle(900,400,80,80);
    private Rectangle l2 = new Rectangle(1100,100,80,80);
    private Rectangle l3 = new Rectangle(1000,700,80,80);
    public Color blue = Color.BLUE;
    public Color green = Color.GREEN;
    public Color yellow = Color.YELLOW;
    public NavModel(){
       
    }
    
    public void checkTackle(Timer tm){
       if(getR1().getBounds().intersects(getL1().getBounds()) || getR1().getBounds().intersects(getL2().getBounds()) || getR1().getBounds().intersects(getL3().getBounds())){
           getL1().setBounds(900,400,80,80);
           getL2().setBounds(1100,100,80,80);
           getL3().setBounds(1000,700,80,80);
           setxX(100);
           setyY(400);
           getR1().setBounds(100,400,80,80);
           tm.stop();
           setTackleCounter(getTackleCounter() + 1);
       } 
    }
    
    public void checkTouchdown(Timer tm, int width){
        if(getR1().getX() >= (width-230)){
           getL1().setBounds(900,400,80,80);
           getL2().setBounds(1100,100,80,80);
           getL3().setBounds(1000,700,80,80);
           setxX(100);
           setyY(400);
           getR1().setBounds(100,400,80,80);
           tm.stop();
           setTouchCounter(getTouchCounter() + 1);
        }
        
    }
    
    public void lb1Chase(){
        
        getL1().setBounds(new Rectangle((getL1().x + lbX(getR1().x,getL1().x)),(getL1().y + lbY(getR1().y,getL1().y)),80,80));
    }
    
    public void lb2Chase(){
        
        getL2().setBounds(new Rectangle((getL2().x + lbX(getR1().x,getL2().x)),(getL2().y + lbY(getR1().y,getL2().y)),80,80));
    }
    
    public void lb3Chase(){
        
        getL3().setBounds(new Rectangle((getL3().x + lbX(getR1().x,getL3().x)),(getL3().y + lbY(getR1().y,getL3().y)),80,80));
    }
    
    public int lbY(int rby, int lby){
        if(rby-lby> 0){
            setMoveY(3);
            
        }
        else{
            setMoveY(-3);
        }
        return getMoveY();
    }
    public int lbX(int rbx, int lbx){
        if(rbx-lbx > 0){
            setMoveX(3);  
        }
        else{
            setMoveX(-3);
        }
        return getMoveX();
    }
    
    public void rbXPos(){
        setxX(getxX() + 4); 
        getR1().setBounds(new Rectangle(getxX(), getyY(),80,80));
    }
    
    public void rbXNeg(){
        setxX(getxX() - 4);
        getR1().setBounds(new Rectangle(getxX(), getyY(),80,80));
    }
    
    public void rbYPos(){
        setyY(getyY() + 4);
        getR1().setBounds(new Rectangle(getxX(), getyY(),80,80));
    }
    
    public void rbYNeg(){
        setyY(getyY() - 4);
        getR1().setBounds(new Rectangle(getxX(), getyY(),80,80));
    }
    
    /**
     * @return the delay
     */
    public int getDelay() {
        return delay;
    }

    /**
     * @param delay the delay to set
     */
    public void setDelay(int delay) {
        this.delay = delay;
    }

    /**
     * @return the moveX
     */
    public int getMoveX() {
        return moveX;
    }

    /**
     * @param moveX the moveX to set
     */
    public void setMoveX(int moveX) {
        this.moveX = moveX;
    }

    /**
     * @return the moveY
     */
    public int getMoveY() {
        return moveY;
    }

    /**
     * @param moveY the moveY to set
     */
    public void setMoveY(int moveY) {
        this.moveY = moveY;
    }

    /**
     * @return the touchCounter
     */
    public int getTouchCounter() {
        return touchCounter;
    }

    /**
     * @param touchCounter the touchCounter to set
     */
    public void setTouchCounter(int touchCounter) {
        this.touchCounter = touchCounter;
    }

    /**
     * @return the tackleCounter
     */
    public int getTackleCounter() {
        return tackleCounter;
    }

    /**
     * @param tackleCounter the tackleCounter to set
     */
    public void setTackleCounter(int tackleCounter) {
        this.tackleCounter = tackleCounter;
    }

    /**
     * @return the xX
     */
    public int getxX() {
        return xX;
    }

    /**
     * @param xX the xX to set
     */
    public void setxX(int xX) {
        this.xX = xX;
    }

    /**
     * @return the yY
     */
    public int getyY() {
        return yY;
    }

    /**
     * @param yY the yY to set
     */
    public void setyY(int yY) {
        this.yY = yY;
    }

    /**
     * @return the r1
     */
    public Rectangle getR1() {
        return r1;
    }

    /**
     * @param r1 the r1 to set
     */
    public void setR1(Rectangle r1) {
        this.r1 = r1;
    }

    /**
     * @return the l1
     */
    public Rectangle getL1() {
        return l1;
    }

    /**
     * @param l1 the l1 to set
     */
    public void setL1(Rectangle l1) {
        this.l1 = l1;
    }

    /**
     * @return the l2
     */
    public Rectangle getL2() {
        return l2;
    }

    /**
     * @param l2 the l2 to set
     */
    public void setL2(Rectangle l2) {
        this.l2 = l2;
    }

    /**
     * @return the l3
     */
    public Rectangle getL3() {
        return l3;
    }

    /**
     * @param l3 the l3 to set
     */
    public void setL3(Rectangle l3) {
        this.l3 = l3;
    }
    
    
}
