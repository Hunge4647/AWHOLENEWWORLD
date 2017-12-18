import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class progui8 implements ActionListener, MouseListener, MouseMotionListener{
  //properties
  JFrame theframe;
  animationpanel8 thepanel;
  Timer thetimer;
  
  //methods
  public void actionPerformed(ActionEvent evt){
    if(evt.getSource() == thetimer){
      thepanel.repaint();
    }
  }
  public void mouseExited(MouseEvent evt){
    System.out.println("Mouse Exited");
  }
  public void mouseEntered(MouseEvent evt){
    System.out.println("Mouse Entered");
  }
  public void mouseReleased(MouseEvent evt){
  }
  public void mousePressed(MouseEvent evt){
  //  System.out.println(evt.getButton());
    if(evt.getButton() ==1){
      thepanel.theColor = Color.RED;
    }else if(evt.getButton() == 3){
      thepanel.theColor = Color.WHITE;
    }
  }
  public void mouseClicked(MouseEvent evt){
    
  }
  public void mouseMoved(MouseEvent evt){
    //System.out.println(evt.getLocationOnScreen());
    thepanel.theColor = Color.WHITE;
    thepanel.intBX = evt.getX() - 25;
    thepanel.intBY = evt.getY() - 25;
  }
  public void mouseDragged(MouseEvent evt){
    thepanel.intBX = evt.getX() - 25;
    thepanel.intBY = evt.getY() - 25;
    thepanel.theColor = Color.RED;
  }
  //contructor
  public progui8(){
    thepanel = new animationpanel8();
    thepanel.setLayout(null);
    thepanel.setPreferredSize(new Dimension (720, 480));
    thepanel.addMouseListener(this);
    thepanel.addMouseMotionListener(this);
    
    theframe = new JFrame("Progui 8");
    theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theframe.setContentPane(thepanel);
    theframe.pack();
    theframe.setVisible(true);
    
    thetimer = new Timer(1000/60,this);
    thetimer.start();
  }
  public static void main(String[] args){
    new progui8();
  }
}