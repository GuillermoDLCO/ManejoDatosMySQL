package manejopersonas;

import datos.PersonasJDBC;
import domain.Persona;
import java.util.List;

public class ManejoPersonas {

    public static void main(String[] args) {
        PersonasJDBC personasJDBC = new PersonasJDBC();
        
        //personasJDBC.insert("Guillermo", "De La Cruz");
        //personasJDBC.update(2, "Loca", "Imbechil");
        //personasJDBC.delete(2);
        List<Persona> personas = personasJDBC.select();
        for (Persona persona : personas){
            System.out.println(persona);
            System.out.println("");
        }
    }
    
}
