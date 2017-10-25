
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brend
 */
public class ScorePanel extends JPanel {
    
    private JLabel touch;
    private JLabel tackle;
    private JButton str;
    private JSlider jS1;
    private JLabel tackleScore;
    private JLabel touchScore;
    private JRadioButton blue;
    private JRadioButton green;
    private JRadioButton yellow;
    private ButtonGroup group;
   
    
    ScorePanel(){
        super();
        this.setBackground(Color.DARK_GRAY);
        GridLayout grid = new GridLayout(1,9);
        this.setLayout(grid);
        grid.setHgap(8);
        
         touch = new JLabel("Touchdowns: ");
        setLab(touch);
        
        tackle = new JLabel("Tackles: ");
        setLab(tackle);
        
        touchScore = new JLabel(" 0 ");
        setLab(touchScore);
        
        tackleScore = new JLabel(" 0 ");
        setLab(tackleScore);
        
        str = new JButton("START");
        
        jS1 = new JSlider(JSlider.HORIZONTAL,100,800,400);
        jS1.setBorder(BorderFactory.createTitledBorder("Game Speed"));
        jS1.setMajorTickSpacing(100);
        jS1.setPaintTicks(true);
        jS1.setPaintLabels(true);
        
        blue = new JRadioButton("Blue");
        blue.setSelected(true);
        blue.setBackground(Color.blue);
        green = new JRadioButton("Green");
        green.setBackground(Color.GREEN);
        yellow = new JRadioButton("yellow");
        yellow.setBackground(Color.yellow);
        group = new ButtonGroup();
        group.add(blue);
        group.add(green);
        group.add(yellow);
        
        add(str);
        add(tackle);
        add(tackleScore);
        add(touch);
        add(touchScore);
        add(blue);
        add(green);
        add(yellow);
        add(jS1);
        
    }
    
    public JLabel setLab(JLabel lb){
        lb.setForeground(Color.white);
        lb.setFont(new Font("Times",Font.BOLD,20));
        return lb;
        
    }

    /**
     * @return the touch
     */
    public JLabel getTouch() {
        return touch;
    }

    /**
     * @param touch the touch to set
     */
    public void setTouch(JLabel touch) {
        this.touch = touch;
    }

    /**
     * @return the tackle
     */
    public JLabel getTackle() {
        return tackle;
    }

    /**
     * @param tackle the tackle to set
     */
    public void setTackle(JLabel tackle) {
        this.tackle = tackle;
    }

    /**
     * @return the str
     */
    public JButton getStr() {
        return str;
    }

    /**
     * @param str the str to set
     */
    public void setStr(JButton str) {
        this.str = str;
    }

    /**
     * @return the jS1
     */
    public JSlider getjS1() {
        return jS1;
    }

    /**
     * @param jS1 the jS1 to set
     */
    public void setjS1(JSlider jS1) {
        this.jS1 = jS1;
    }

    /**
     * @return the tackleScore
     */
    public JLabel getTackleScore() {
        return tackleScore;
    }

    /**
     * @param tackleScore the tackleScore to set
     */
    public void setTackleScore(JLabel tackleScore) {
        this.tackleScore = tackleScore;
    }

    /**
     * @return the touchScore
     */
    public JLabel getTouchScore() {
        return touchScore;
    }

    /**
     * @param touchScore the touchScore to set
     */
    public void setTouchScore(JLabel touchScore) {
        this.touchScore = touchScore;
    }

    /**
     * @return the blue
     */
    public JRadioButton getBlue() {
        return blue;
    }

    /**
     * @param blue the blue to set
     */
    public void setBlue(JRadioButton blue) {
        this.blue = blue;
    }

    /**
     * @return the green
     */
    public JRadioButton getGreen() {
        return green;
    }

    /**
     * @param green the green to set
     */
    public void setGreen(JRadioButton green) {
        this.green = green;
    }

    /**
     * @return the yellow
     */
    public JRadioButton getYellow() {
        return yellow;
    }

    /**
     * @param yellow the yellow to set
     */
    public void setYellow(JRadioButton yellow) {
        this.yellow = yellow;
    }

    /**
     * @return the group
     */
    public ButtonGroup getGroup() {
        return group;
    }

    /**
     * @param group the group to set
     */
    public void setGroup(ButtonGroup group) {
        this.group = group;
    }
    
}
