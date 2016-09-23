/**
 * Building --- class for rectangle-shaped building, to be called by SkylinePanel
 * @author      Kenta Medina
 * @version     1.0
 * @since       2016-09-22
*/

import java.awt.*;

public class Building
{
   private int x, width, height;
   private int GROUND_LEVEL;
   private Color color;

   //-----------------------------------------------------------------
   //  Constructor: Sets up the building with the specified values.
   //-----------------------------------------------------------------
   public Building (int ix, Color shade, int iwidth, int iheight)
   {
      x = ix;
      color = shade;
      width = iwidth;
      height = iheight;
      GROUND_LEVEL = 280;
   }

   //-----------------------------------------------------------------
   //  Draws the building in the specified graphics context.
   //-----------------------------------------------------------------
   public void draw (Graphics g)
   {
      g.setColor (color);
      g.fillRect (x, GROUND_LEVEL-height, width, height);
   }

   //-----------------------------------------------------------------
   //  x-value mutator.
   //-----------------------------------------------------------------
   public void setX (int iX)
   {
      x = iX;
   }

   //-----------------------------------------------------------------
   //  Color mutator.
   //-----------------------------------------------------------------
   public void setColor (Color shade)
   {
      color = shade;
   }

   //-----------------------------------------------------------------
   //  width mutator.
   //-----------------------------------------------------------------
   public void setWidth (int iWidth)
   {
      width = iWidth;
   }


   //-----------------------------------------------------------------
   //  height mutator.
   //-----------------------------------------------------------------
   public void setHeight (int iHeight)
   {
      height = iHeight;
   }

   //-----------------------------------------------------------------
   //  x accessor.
   //-----------------------------------------------------------------
   public int getX ()
   {
      return x;
   }

   //-----------------------------------------------------------------
   //  Color accessor.
   //-----------------------------------------------------------------
   public Color getColor ()
   {
      return color;
   }

   //-----------------------------------------------------------------
   //  width accessor.
   //-----------------------------------------------------------------
   public int getWidth ()
   {
      return width;
   }

   //-----------------------------------------------------------------
   //  height accessor.
   //-----------------------------------------------------------------
   public int getHeight ()
   {
      return height;
   }
}
