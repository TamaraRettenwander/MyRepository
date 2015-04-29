
package at.ac.fh_kufstein2;


public class Fahrzeug
{
        private short reifen;
        private color farbe;
        private short ps;
        private short tueren;
        private boolean gestartet;
        private short geschwindigkeit;
        public static int anzahl;
        
        public enum color
        {
            silver,red,black,blue,white; 
        }
        
    public static void starten(boolean gestartet)
    {
        gestartet = true;
    }

    public Fahrzeug(short reifen, color farbe, short ps, short tueren) {
        this.reifen = reifen;
        this.farbe = color.blue;
        this.ps = ps;
        this.tueren = tueren;
        this.gestartet = gestartet;
        gestartet = false;
        this.geschwindigkeit = geschwindigkeit;
        geschwindigkeit = 0;
    }
    
    public static void stoppen(boolean gestartet)
    {
        gestartet = false;
    }
    
     public  void beschleunigen(short geschwindigkeit)
    {
        if (gestartet = true)
        {
           
                    if ( this.geschwindigkeit + geschwindigkeit <= 250)
                    {
                        this.geschwindigkeit += geschwindigkeit;
                    }
                    else 
                    {
                        this.geschwindigkeit = 250;
                    }
        }
    }
     
      public void bremsen(short geschwindigkeit)
    {
      if (gestartet = true)
        {
           
                    if ( this.geschwindigkeit + geschwindigkeit >= 0)
                    {
                        this.geschwindigkeit -= geschwindigkeit;
                    }
                    else 
                    {
                        this.geschwindigkeit = 0;
                    }
        }
        }

    public short getReifen() {
        return reifen;
    }

    public void setReifen(short reifen) {
        this.reifen = reifen;
    }

    public color getFarbe() {
        return farbe;
    }

    public void setFarbe(color farbe) {
        this.farbe = farbe;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getTueren() {
        return tueren;
    }

    public void setTueren(short tueren) {
        this.tueren = tueren;
    }

    public boolean isGestartet() {
        return gestartet;
    }

    public void setGestartet(boolean gestartet) {
        this.gestartet = gestartet;
    }

    public short getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(short geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public static int getAnzahl() {
        return anzahl;
    }

    public static void setAnzahl(int anzahl) {
        Fahrzeug.anzahl = anzahl;
    }
    
    
      
      
    }   

