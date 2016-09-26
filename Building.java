/**
 * Building --- class for rectangle-shaped building, to be called by SkylinePanel
 * @author      Kenta Medina
 * @version     1.0
 * @since       2016-09-22
*/

import java.awt.*;
import java.lang.*;

public class Building
{
   private int x, width, height;
   private int y; //380 is ideal
   private Color color;

   //-----------------------------------------------------------------
   //  Constructor: Sets up the building with the specified values.
   //-----------------------------------------------------------------
   public Building (int ix, int iy, Color shade, int iwidth, int iheight)
   {
      x = ix;
      y = iy;
      color = shade;
      width = iwidth;
      height = iheight;
   }

   //-----------------------------------------------------------------
   //  Draws the building in the specified graphics context.
   //-----------------------------------------------------------------
   public void draw (Graphics g)
   {
      g.setColor (color);
      g.fillRect (x, y-height, width, height);
      g.setColor (color.blue);
      for(int i = 1; i < width-6; i += 6){
         for(int z = 1; z < height-11; z += 11){
            if(Math.random() < 0.1)
            {
               int toRandom = (int)(Math.random()*10);
               switch (toRandom)
               {
                  case 0: g.setColor (color.cyan);
                  case 1: g.setColor (color.green);
                  case 2: g.setColor (color.yellow);
                  case 3: g.setColor (color.orange);
                  case 4: g.setColor (color.cyan);
                  case 5: g.setColor (color.orange);
                  case 6: g.setColor (color.pink);
                  case 7: g.setColor (color.red);
                  case 8: g.setColor (color.white);
                  case 9: g.setColor (color.blue);
               }
               g.fillRect (i + x, z + y-height, 5, 10);
               System.out.println("window printed");
            }
            //g.fillRect (i + x, z + y-height, 5, 10);
         }
      }
   }

   //-----------------------------------------------------------------
   //  x-value mutator.
   //-----------------------------------------------------------------
   public void setX (int iX)
   {
      x = iX;
   }

   //-----------------------------------------------------------------
   //  y-value mutator.
   //-----------------------------------------------------------------
   public void setY (int iY)
   {
      y = iY;
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
   //  y accessor.
   //-----------------------------------------------------------------
   public int getY ()
   {
      return y;
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

   //-----------------------------------------------------------------
   //  toString method.
   //-----------------------------------------------------------------
   public String toString(){
      return "x(" + x + ") width(" + width + ") height(" + height + ")";
   }
}
