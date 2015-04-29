

package at.ac.fh_kufstein2;


public class Auto extends Fahrzeug implements Comparable<Auto>
{
    
   private boolean klimaanlage;
   private short Airbags;
   
   
   
    public Auto(short reifen, color farbe, short ps, short tueren,short Airbags)
      {
       super(reifen, farbe, ps, tueren);
       this.klimaanlage = klimaanlage;
       klimaanlage = false;
       
       this.Airbags = Airbags;
       anzahl++;
      }
 
    
 public void klimaanlageAn(boolean klimaanlage)
{
    if (klimaanlage = false)
    {
        klimaanlage = true;
    }
    else
    { 
        System.out.println("Die Klimaanlage läuft bereits!");
    }
}   

 public void klimaanlageAus(boolean klimaanlage)
 {
         if (klimaanlage = true)
    {
        klimaanlage = false;
    }
    else
    { 
        System.out.println("Die Klimaanlage ist bereits aus!");
    }
 }

  
    public boolean isKlimaanlage() {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public short getAribags() {
        return Airbags;
    }

    public void setAribags(short Aribags) {
        this.Airbags = Aribags;
    }

    @Override
    public String toString()
    {
       return "Mein Auto hat " + getPs() + " PS und fährt mit " + getGeschwindigkeit()+ "km/h";
    }

    @Override
    public int compareTo(Auto a)
    
    {
        if(this.getPs() < a.getPs())
        {
            return -1;
        }
        else if (this.getPs() > a.getPs())
        {
            return 1;
        }
        else
        {
            return 0;
        }
      
    }
    
    
    
 
    
}


