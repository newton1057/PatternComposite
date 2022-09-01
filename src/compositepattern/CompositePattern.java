
package compositepattern;

public class CompositePattern {

    public static void main(String[] args) {
        
        //Nivel 0
        Lista Arbol = new Lista("/Documentos");
        
        //Nivel 1
        Arbol.Add(new Hoja("nuevo.txt"));
        Arbol.Add(new Hoja("playa.png"));
        Lista Arbol2 = new Lista("/Casa"); //Metodo 1
        Arbol.Add(Arbol2); //Metodo1
        Arbol.Add(new Lista("/Trabajo")); //Metodo 2
        
        //Nivel 2
        Arbol2.Add(new Hoja("FacturaTerreno.pdf"));//Metodo 1
        Arbol2.Add(new Hoja("EscrituraCasa.pdf"));//Metodo 1
        Arbol2.Add(new Hoja("cartapoder.docx"));//Metodo 1
        Arbol.get(3).Add(new Hoja("PermisoVentas.pdf"));//Metodo 2
        
        
        
        Lista Arbol3 = new Lista("/Permisos"); 
        Arbol.get(3).Add(Arbol3);
        Arbol3.Add(new Hoja("key.py"));
        
        
        //Impresion Individual
        Arbol.PrintAll(Arbol);
        Arbol.PrintAll(Arbol2);
        Arbol.PrintAll(Arbol.get(3));
        
        
        //Impresion General
        System.out.println("*************************************");
        Arbol.PrintAllDirec(Arbol);
        
        
    }
    
}
