# try-with-resources
Se muestra un ejemplo de escritura en un fichero que no tiene porque existir con la captura de errores tradicional (try-catch) haciendo incapie en cerrar el objeto creado
de java y luego se muestra el uso de try-with-resources, nuevo a partir de java 7!!


try-with-resources -> Es una estructura introducida en Java 7 que permite declarar recursos 
dentro de los paréntesis del try (como tu FileWriter).

Un recurso es cualquier objeto que implemente la interfaz AutoCloseable 
(como FileWriter, BufferedReader, Scanner, Connection de JDBC, etc.). */
