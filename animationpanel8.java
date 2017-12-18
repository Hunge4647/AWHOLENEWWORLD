import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class animationpanel8 extends JPanel{
  //properties
  int intBX = 200;
  int intBY = 200;
  Color theColor = Color.WHITE;
  //methods
  //Override how a JPanel draws
  public void paintComponent(Graphics g){
    g.setColor(Color.BLACK);
    g.fillRect(0,0,720,480);
    g.setColor(theColor);
    g.fillOval(intBX, intBY, 50,50);
  }
    //constructor
    public animationpanel8(){
      super();
    }
  
}