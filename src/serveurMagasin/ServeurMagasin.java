package serveurMagasin;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServeurMagasin {
    
    public static void main(String args[]) { 
        try { 
   
            IGestion g= (IGestion)new GestionImpl();
            LocateRegistry.createRegistry(1801); 
            
            Naming.rebind("rmi://localhost:1801/gestion", g);
            System.err.println("Server ready"); 
            
        } catch (Exception e) { 
           System.err.println("Server exception: " + e.toString()); 
           e.printStackTrace(); 
        }
     }

}
