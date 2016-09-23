/**
 * Skyline --- program to display a pretty skyline
 * @author     Lewis/Loftus
 * @version    1.0
 * @since      2016-09-22
*/

import javax.swing.*;
import java.awt.*;

public class Skyline
{
   //displays the skyline in a JFrame
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Skyline");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new SkylinePanel());

      frame.pack();
      frame.setVisible(true);
   }
}
