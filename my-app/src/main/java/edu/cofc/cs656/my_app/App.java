package edu.cofc.cs656.my_app;


import edu.cofc.cs656.models.Renter;
import edu.cofc.cs656.models.Juicer;
import edu.cofc.cs656.services.SignUpServices;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Renter r = new Renter();
        r.SetName("Bill");
        System.out.println( r.GetName() );
        
        Juicer j = new Juicer();
        j.SetName("Frank");
        System.out.println( j.GetName() );
        
        SignUpServices sns = new SignUpServices();
        sns.CreateUser(1);
        System.out.println( sns.toString() );
        
        
    }
}
