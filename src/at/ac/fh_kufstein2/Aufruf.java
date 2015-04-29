
package at.ac.fh_kufstein2;

import at.ac.fh_kufstein2.Fahrzeug.color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Aufruf
{
    public static void main(String[] args)
    {

      Auto bmw = new Auto((short)4,color.silver,(short) 220,(short) 5 ,(short) 4);
      Auto audi = new Auto((short)4,color.black,(short) 180,(short) 5 ,(short) 8);
      Auto audi2 = new Auto((short)4,color.blue,(short) 105,(short) 3 ,(short) 8);
      Auto audi3 = new Auto((short)4,color.red,(short) 480,(short) 5 ,(short) 4);
      Auto audi4 = new Auto((short)4,color.white,(short) 70,(short) 5 ,(short) 8);
      
            
      List<Auto> liste = new ArrayList<Auto>();
      liste.add(bmw);
      liste.add(audi);
      liste.add(audi4);
      liste.add(audi2);
      liste.add(audi3);
      
      Collections.sort(liste);

      for (Auto x : liste)
      {
          System.out.println(x.toString());
      }
          
  
       
    }
       
    
}
