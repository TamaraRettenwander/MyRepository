
package at.ac.fh_kufstein;


public class Mensch extends Saeugetier
{
    public Mensch(String name, int alter, String geschlecht)
    {
        super(name,alter,geschlecht);
    }

    public String printAll()
    {
        return name+ " # "+ alter+" # "+ geschlecht; 
    }
    
    public static void main(String[] args) 
    {
     Mensch m = new Mensch ("Tamara", 20, "weiblich");
        System.out.println(m.printAll());
        
    }
}
