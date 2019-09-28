/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mouse;
 
/**
 *
 * @author Jin Toples
 */
import java.awt.*;
import javax.swing.*;
public class gridlayoTest extends JFrame {
public gridlayoTest(  ) {
createUserInterface();
}
private void createUserInterface(){
JPanel panel1 = new JPanel();
panel1.setLayout(new GridLayout(3, 2));
panel1.add(new JButton("One"));
panel1.add(new JButton("Two"));
panel1.add(new JButton("Three"));
panel1.add(new JButton("Four"));
panel1.add(new JButton("Five"));
JButton b1=new JButton("posisi 1");
JButton b2=new JButton("posisi 2");
JButton b3=new JButton("posisi 3");
JButton b4=new JButton("posisi 4");
JButton b5=new JButton("posisi 5");
this.add(panel1);
this.setTitle("Grid");
this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
this.setSize(200, 200);
this.setLocation(200, 200);
this.setVisible(true);
}
public static void main(String[] args) {
gridlayouttest app = new gridlayouttest();
}

    private static class gridlayouttest {

        public gridlayouttest() {
        }
    }
}