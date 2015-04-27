
package at.ac.fh_kufstein;


abstract class Saeugetier {
    
    String name;
    int alter;
    String geschlecht;
    
        public Saeugetier(String name, int alter, String geschlecht)
        {
         this.alter =alter;
         this.geschlecht = geschlecht;
         this.name = name;
        }
 public abstract String printAll();


    
}
