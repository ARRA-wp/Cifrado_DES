package Archivos;
import java.io.*;

/**
 *
 * @author Rafael
 */

public class GestionA {
    
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
    
    public GestionA(){}  
    
    //MEtodo para leer el archivo 
    
    public String AbrirATexto(File archivo){
        
        String contenido="";
        try{
            entrada = new FileInputStream(archivo);
            int m;
            while((m = entrada.read()) != -1){
                char caracter = (char)m;
                contenido += caracter;
            }
        }catch(Exception e){}
        return contenido;
        
    }
    
    //Guardamos el archivo en bites
    public String GuardarATexto(File archivo, String contenido){
        
        String respuesta = null;
        try{
            salida = new FileOutputStream(archivo);
            byte[] bytestTxt = contenido.getBytes();
            salida.write(bytestTxt);
            respuesta = "El archivo se guardo exitosamente";
        }catch(Exception e){}
        return respuesta;
        
    }
    
    
    
}
