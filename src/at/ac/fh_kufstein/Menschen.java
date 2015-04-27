
package at.ac.fh_kufstein;

public class Menschen {
    
    String vorname;
    String nachname;
    int alter;
    
    
    public Menschen(String vorname, String nachname, int alter)
    {
        this.alter = alter;
        this.nachname = nachname;
        this.vorname = vorname;
    }
 
    public void Status()
    {
        System.out.println("Es handelt sich um einen Mensch. " + vorname + " "+ nachname+ " " + alter);
    }
    
}
