
package clasesejemplo1;

import java.util.ArrayList;


import java.util.ArrayList;
import java.util.Collection;
public class ClasesEjemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
        Collection listaMarcasCoches = new ArrayList<String>();
        listaMarcasCoches.add("Audi");
        listaMarcasCoches.add("Porsche");
        listaMarcasCoches.add("Aston Martin");
        listaMarcasCoches.add("Ferrari");
        listaMarcasCoches.add("Mercedes");
        listaMarcasCoches.add("Seat");
        System.out.println("Número de los elementos antes de eliminar: " + listaMarcasCoches.size() ) ;
        System.out.println (listaMarcasCoches.toString() ) ;
        listaMarcasCoches.remove ("Seat");
        listaMarcasCoches.remove ("Mercedes");
                System.out.println("Número elementos después de eliminar Seat y Mercedes:" + listaMarcasCoches.size() ) ;
        System.out.println(listaMarcasCoches.toString () );
    }
}
 
