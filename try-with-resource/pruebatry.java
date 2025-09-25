import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class pruebatry {
    public static void main(String[] args) {
        File file=new File("./ficherocaracteres.txt");
        try {
            FileWriter fileWriter= new FileWriter(file);
            fileWriter.write("Hola mundo!!");
            fileWriter.close();
            System.out.println("Fichero creado con éxito " + file.getName());
        } catch (IOException e) {
            System.err.println("Error de apertura/escritura" + file.getName());
        }


        /* try-with-resources:
        Es una estructura introducida en Java 7 que permite declarar recursos 
        dentro de los paréntesis del try (como tu FileWriter).
        Un recurso es cualquier objeto que implemente la interfaz AutoCloseable 
        (como FileWriter, BufferedReader, Scanner, Connection de JDBC, etc.). */
        File file1=new File("./ficherocaracteres1.txt");
        try (FileWriter fileWriter= new FileWriter(file1);){
           fileWriter.write("Probando a cerrar recurso con try with resources. ");
           System.out.println("Fichero creado con éxito " + file1.getName());
        } catch (IOException e) {
            System.err.println("Error de apertura/escritura" + file1.getName());
        }
    }
}
