package tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Hello world!
 *
 */
public class T
{
    public static void main( String[] args )
{
    Frame f= new Frame();
    f.setSize(800,600);
    f.setResizable(false);
    f.setTitle("坦克大战");
    f.setVisible(true);
    f.addWindowListener(new WindowAdapter() {

        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });
}


}
