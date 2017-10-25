/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brend
 */
public class NavView {
    private InitialFrame myFrame;
    private NavModel model;
    
    public NavView(NavModel m){
        this.model = m;
        myFrame = new InitialFrame();
    }

    /**
     * @return the myFrame
     */
    public InitialFrame getMyFrame() {
        return myFrame;
    }

    /**
     * @param myFrame the myFrame to set
     */
    public void setMyFrame(InitialFrame myFrame) {
        this.myFrame = myFrame;
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
    
}
