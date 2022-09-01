
package compositepattern;

import java.util.ArrayList;


public abstract class Composite {
    String Tipo;
    
    Composite(){
        
    }
    
    void DeleteAll(){
        
    }
    
    void PrintAll(Lista A){
        System.out.println("*************************************");
        System.out.println("Directorio: " + A.NombreDirectorio );
        for(int i=0 ; i<A.Objetos.size() ; i++){
            if("Hoja".equals(A.Objetos.get(i).Tipo)){
                Hoja aux = (Hoja) A.Objetos.get(i);
                System.out.println("Tipo de objeto nodo "+ i + ": "+ A.Objetos.get(i).Tipo + " --- Nombre de Archivo: " + aux.NombreArchivo);
            }else{
                Lista aux = (Lista) A.Objetos.get(i);
                System.out.println("Tipo de objeto nodo "+ i + ": "+ A.Objetos.get(i).Tipo + " --- Nombre de Directorio: " + aux.NombreDirectorio);
            }
            
        }
        System.out.println("*************************************");
    }
    
    void PrintAllDirec(Lista A){
        ArrayList <Integer> Index_Directorios = new ArrayList<Integer>(); 
        System.out.println("Directorio: " + A.NombreDirectorio );
        for(int i=0 ; i<A.Objetos.size() ; i++){
            if("Hoja".equals(A.Objetos.get(i).Tipo)){
                Hoja aux = (Hoja) A.Objetos.get(i);
                System.out.println("Tipo de objeto nodo "+ i + ": "+ A.Objetos.get(i).Tipo + " --- Nombre de Archivo: " + aux.NombreArchivo);
            }else{
                Index_Directorios.add(i);
                Lista aux = (Lista) A.Objetos.get(i);
                System.out.println("Tipo de objeto nodo "+ i + ": "+ A.Objetos.get(i).Tipo + " --- Nombre de Directorio: " + aux.NombreDirectorio);
            }
            
        }
        
        if(!Index_Directorios.isEmpty()){
            for (int i=0 ; i<Index_Directorios.size() ; i++){
                Lista aux = (Lista) A.Objetos.get(Index_Directorios.get(i));
                PrintAllDirec(aux);
            }
        }
    }
    
}
