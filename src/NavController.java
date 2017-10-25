
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
public class NavController {
    
    private NavModel model;
    private NavView view;
    private Timer tim;
    private int xx = 0;
    public NavController(NavModel m, NavView v){
        this.model = m;
        this.view = v;
        startButtonListener();
        keyButtonListner();
        sliderListener();
        myTimer();
        colorListener();
    }
    
    private void myTimer(){
        setTim(new Timer(getModel().getDelay(), new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                getView().getMyFrame().getIp().getGp().requestFocusInWindow();
                getModel().checkTackle(getTim());
                getView().getMyFrame().getIp().getSp().getTackleScore().setText(""+getModel().getTackleCounter());
                getModel().checkTouchdown(getTim(), getView().getMyFrame().getIp().getGp().getWidth());
                getView().getMyFrame().getIp().getSp().getTouchScore().setText(""+getModel().getTouchCounter());
                getModel().lb1Chase();
                getModel().lb2Chase();
                getModel().lb3Chase();
                getView().getMyFrame().getIp().getGp().setLb1Move(getModel().getL1());
                getView().getMyFrame().getIp().getGp().setLb2Move(getModel().getL2());
                getView().getMyFrame().getIp().getGp().setLb3Move(getModel().getL3());
            }
        }));
    }
    
    private void startButtonListener(){
     
      getView().getMyFrame().getIp().getSp().getStr().addActionListener(event -> 
            getTim().start());  
      getView().getMyFrame().getIp().getGp().setRbMove(getModel().getR1());
     
    }
    
    public void colorListener(){
        getView().getMyFrame().getIp().getSp().getBlue().addActionListener(event ->
        getView().getMyFrame().getIp().getGp().getRb1().setBackground(getModel().blue));
        
        getView().getMyFrame().getIp().getSp().getGreen().addActionListener(event ->
        getView().getMyFrame().getIp().getGp().getRb1().setBackground(getModel().green));
        
        getView().getMyFrame().getIp().getSp().getYellow().addActionListener(event ->
        getView().getMyFrame().getIp().getGp().getRb1().setBackground(getModel().yellow));
    }

    private void keyButtonListner(){
        getView().getMyFrame().getIp().getGp().addKeyListener(new KeyAdapter(){
          public void keyPressed(KeyEvent ke) {
            int kk = ke.getKeyCode();
            if(kk ==  ke.VK_LEFT) {
                getModel().rbXNeg();
                getView().getMyFrame().getIp().getGp().setRbMove(getModel().getR1());
            }
            if(kk ==  ke.VK_RIGHT) {
                getModel().rbXPos();
                getView().getMyFrame().getIp().getGp().setRbMove(getModel().getR1());
            }
            if(kk ==  ke.VK_UP) {
                getModel().rbYNeg();
                getView().getMyFrame().getIp().getGp().setRbMove(getModel().getR1());
            }
            if(kk ==  ke.VK_DOWN) {
                getModel().rbYPos();
                getView().getMyFrame().getIp().getGp().setRbMove(getModel().getR1());
            }
        }
    });
    }
    
    private void sliderListener(){
        getView().getMyFrame().getIp().getSp().getjS1().addChangeListener(sliderevent -> {
            getTim().setDelay(getView().getMyFrame().getIp().getSp().getjS1().getValue());
        });
    }
   
    
    /**
     * @return the model
     */
    public NavModel getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(NavModel model) {
        this.model = model;
    }

    /**
     * @return the view
     */
    public NavView getView() {
        return view;
    }

    /**
     * @param view the view to set
     */
    public void setView(NavView view) {
        this.view = view;
    }

    /**
     * @return the tim
     */
    public Timer getTim() {
        return tim;
    }

    /**
     * @param tim the tim to set
     */
    public void setTim(Timer tim) {
        this.tim = tim;
    }

    /**
     * @return the xx
     */
    public int getXx() {
        return xx;
    }

    /**
     * @param xx the xx to set
     */
    public void setXx(int xx) {
        this.xx = xx;
    }
    
}
