//********************************************************************
//  Circle.java       Author: Lewis/Loftus
//
//  Represents a circle with a particular position, size, and color.
//********************************************************************

import java.awt.*;

public class Building
{
   private int x, width, height;
   private final int GROUND_LEVEL;
   private Color color;

   //-----------------------------------------------------------------
   //  Constructor: Sets up this circle with the specified values.
   //-----------------------------------------------------------------
   public Building (int ix, Color shade, int iwidth, int iheight)
   {
      x = ix;
      color = shade;
      width = iwidth;
      height = iheight;
   }

   //-----------------------------------------------------------------
   //  Draws this circle in the specified graphics context.
   //-----------------------------------------------------------------
   public void draw (Graphics page)
   {
      page.setColor (color);
      page.fillRect (x, GROUND_LEVEL-height, width, height);
   }

   //-----------------------------------------------------------------
   //  Diameter mutator.
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
   //  X mutator.
   //-----------------------------------------------------------------
   public void setWidth (int iWidth)
   {
      width = iWidth;
   }


   //-----------------------------------------------------------------
   //  Y mutator.
   //-----------------------------------------------------------------
   public void setHeight (int iHeight)
   {
      height = iHeight;
   }

   //-----------------------------------------------------------------
   //  Diameter accessor.
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
   //  X accessor.
   //-----------------------------------------------------------------
   public int getWidth ()
   {
      return width;
   }

   //-----------------------------------------------------------------
   //  Y accessor.
   //-----------------------------------------------------------------
   public int getHeight ()
   {
      return height;
   }
}
