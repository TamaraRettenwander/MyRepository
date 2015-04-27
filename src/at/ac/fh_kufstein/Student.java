
package at.ac.fh_kufstein;


public class Student extends Menschen
{
    
 int matrikelnummer;
 String studiengang;
   
public Student(String vorname, String nachname, int alter, int matrikelnummer, String studiengang)
{
    super(vorname,nachname,alter);
    this.matrikelnummer = matrikelnummer;
    this.studiengang = studiengang;
}

    @Override
    public void Status()
    {
        System.out.println("Es handelt sich um einen Studenten. " + vorname + " "+ nachname+ " " + alter +" "+ matrikelnummer + " "+ studiengang); 
    }

public static void main(String[] args) 
    {
     Menschen t = new Menschen ("Tamara", "Rettenwander", 20);
     t.Status();
     
     t = new Student("Tamara", "Rettenwander", 20, 1410653529, "Web.vzB14");
     t.Status();
     
     
       
        
    }
    
}
