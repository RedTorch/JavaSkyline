/**
 * Skyline --- program to display a pretty skyline
 * @author     Lewis/Loftus, modified by David Ye Luo, Kenta Medina
 * @version    1.0
 * @since      2016-09-26
*/

//  ALGORITHM:
//  1) Draw moon
//  2) Draw background
//  3) Draw buildings #1-5

import javax.swing.*;
import java.awt.*;

public class Skyline
{
   /**
   * displays the skyline in a JFrame
   * @param arg A string array containing 
   * the command line arguments.
   * @exception Any exception
   * @return No return value.
   */ 

   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Skyline");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new SkylinePanel());

      frame.pack();
      frame.setVisible(true);
   }
}
