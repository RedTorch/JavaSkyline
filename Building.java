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
      g.setColor (color.yellow);
      for(int i = 1; i < width-6; i += 6){
         for(int z = 1; z < height-11; z += 11){
            if(Math.random() < 0.1)
            {
               int toRandom = (int)(Math.random()*10);
               System.out.println("toRandom:" + toRandom);
               // switch (toRandom)
               // {
               //    case 0: g.setColor (color.cyan); System.out.println("case tripped "+ toRandom);
               //    case 1: g.setColor (color.green); System.out.println("case tripped "+ toRandom);
               //    case 2: g.setColor (color.yellow); System.out.println("case tripped "+ toRandom);
               //    case 3: g.setColor (color.orange); System.out.println("case tripped "+ toRandom);
               //    case 4: g.setColor (color.cyan); System.out.println("case tripped "+ toRandom);
               //    case 5: g.setColor (color.orange); System.out.println("case tripped "+ toRandom);
               //    case 6: g.setColor (color.pink); System.out.println("case tripped "+ toRandom);
               //    case 7: g.setColor (color.red); System.out.println("case tripped "+ toRandom);
               //    case 8: g.setColor (color.white); System.out.println("case tripped "+ toRandom);
               //    case 9: g.setColor (color.green); System.out.println("case tripped "+ toRandom);
               // }
               if(toRandom == 0){g.setColor (Color.blue);}
               if(toRandom == 1){g.setColor (Color.green);}
               if(toRandom == 2){g.setColor (Color.yellow);}
               if(toRandom == 3){g.setColor (Color.orange);}
               if(toRandom == 4){g.setColor (Color.cyan);}
               if(toRandom == 5){g.setColor (Color.pink);}
               if(toRandom == 6){g.setColor (Color.red);}
               if(toRandom == 7){g.setColor (Color.white);}
               if(toRandom == 8){g.setColor (Color.magenta);}
               if(toRandom == 9){g.setColor (Color.lightGray);}
               g.fillRect (i + x, z + y-height, 5, 10);
               System.out.println("window printed" + toRandom);
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
