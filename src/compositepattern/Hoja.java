
package compositepattern;

public class Hoja extends Composite{
    // Se realiza la simulacion de que se trata de un Archivo con una extension
    // Ejemplo     B2.pdf
    
    String NombreArchivo;
    
    Hoja(String Nombre){
        this.Tipo="Hoja";
        this.NombreArchivo=Nombre;
    }
    
    @Override
    void DeleteAll(){
        NombreArchivo="XX";
    }
}