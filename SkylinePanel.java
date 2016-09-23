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
       building1= new Building ();
       building2= new Building ();
       building3= new Building ();
       building4= new Building ();
       building5= new Building ();

      setPreferredSize (new Dimension(600, 400));
      setBackground (Color.cyan);
   }
   //-------------------------------------------------
   //   Draws the Panel
   //-------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent(page);
  
      
      
      
   }
}
