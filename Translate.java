import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Translate
{
   public static void main(String[] args)
   {
      // Construct a frame and show it
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      // Your work goes here: Construct a rectangle and set the frame bounds
      Rectangle rec = new Rectangle (100,100,100,100);
      frame.setBounds(rec);
      JOptionPane.showMessageDialog(frame, "Click OK to continue");
      // Your work goes here: Move the rectangle and set the frame bounds again
      rec.translate(100,100);
      frame.setBounds(rec);
   }
}