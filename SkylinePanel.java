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
   private Building building1, building2, building3, building4, building5;

   //-------------------------------------------------
   //   Default Constructor: Sets up the Panel
   //-------------------------------------------------
   public SkylinePanel()
   {  
      building1 = new Building(10, Color.black, 100, 100);
      building2 = new Building(120, Color.black, 50, 150);
      building3 = new Building(230, Color.black, 70, 300);
      building4 = new Building(340, Color.black, 45, 200);
      building5 = new Building(400, Color.black, 100, 370);

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
   }
}
