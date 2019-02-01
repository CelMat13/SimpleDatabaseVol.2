
package bdatabas;
import java.io.*;
/**
 * @author Mateusz
 */

class osoba
{
    String nazw;
    String imie;
    String nr_alb;
    
    public void inicjuj()
            throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Wprowadz dane.");
        System.out.println("Podaj imie ");
        imie = br.readLine();
        System.out.println("podaj nazwisko");
        nazw = br.readLine();
        System.out.println("Podaj nr albumu");
        nr_alb = br.readLine();
        
        System.out.println();
    }
    
    public void drukuj()
    {
        System.out.println("Wyświetlanie danych.");
        System.out.println("=======================");
        System.out.println("Imie: "+imie);
        System.out.println("Nazwisko: "+nazw);
        System.out.println("Nr albumu: "+nr_alb);
    }
}


public class BDataBas 
{
    
    public static void main(String[] args)
          throws IOException
            
    {
        osoba student = new osoba();
        
        student.inicjuj();
        student.drukuj();
        
    }
    
}
