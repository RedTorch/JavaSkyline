/**
 * SkylinePanel --- program to draw buildings
 * @author          Lewis/Loftus, modified by David Ye Luo
 * @version         1.0
 * @since           2016-09-22
*/

import javax.swing.*;
import java.awt.*;

public class SkylinePanel extends JPanel
{
   private Building building1, building2, building3, building4, building5, building6;

   //-------------------------------------------------
   //   Default Constructor: Sets up the Panel
   //-------------------------------------------------
   public SkylinePanel()
   {  
      building1 = new Building(10, 380, Color.black, 100, 100);
      building2 = new Building(120, 380, Color.black, 50, 150);
      building3 = new Building(230, 380, Color.black, 70, 300);
      building4 = new Building(340, 380, Color.black, 45, 200);
      building5 = new Building(400, 380, Color.black, 100, 370);
      building6 = new Building(510, 380, Color.black, 80, 130);
      
      System.out.println(building1);
      setPreferredSize (new Dimension(600, 400));
      setBackground (Color.cyan);
   }
   //-------------------------------------------------
   //   Draws the Panel
   //-------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent(page);
      building1.draw(page);
      building2.draw(page);
      building3.draw(page);
      building4.draw(page);
      building5.draw(page);
      //building6.draw(page);  //the 6th building had to be removed, per assignment restrictions. *weep weep*
      page.setColor (Color.black);
      page.drawString("Dkaevnitda Y Mee Lduiona's Skyline", 30, 30); //by the way, this is a hash of both of our names
   }
}
