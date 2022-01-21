package Ejercicio1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

import static java.net.InetAddress.getLocalHost;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        InetAddress e = obtenerHost(sc);
        System.out.println(e.getHostAddress());
    }


    /**
     * Método que, con una cadena recogida mediante escaner
     * llama al método nombreHost, para comprobar que este no
     * devuelva ninguna excepción, de esta misma clase y al método
     * estático "getByName" de la clase "InetAddress" para que devuelva
     * un objeto "InetAddress".
     * @param sc
     * @return InetAddress -> address
     */
    private static InetAddress obtenerHost(Scanner sc)
 {

     InetAddress address = null;
     try{
         address = InetAddress.getByName(nombreHost(sc)) ;
     }catch(UnknownHostException e){
         System.out.println("Direccion no encontrada");

     }
     return address;
 }


    /**
     * Método estático que comprueba que exista el nombre de un host
     * mediante el método estático "comprobarHost".
     * si existe el host devuelve un String, que contendrá el nombre del host,
     * si no es así se mantendrá en bucle hasta que se dé un String válido
     * @param sc
     * @return String host
     */
 private static String nombreHost(Scanner sc){
        String host = "";
        do
        {
            System.out.println("Escribe el nombre del host");
            host = sc.nextLine();
        }while(!comprobarHost(host));

     return host;
 }

    /**
     * Método que comprueba que un String, que debe ser
     * el nombre de un host, pueda ser usado como cadena
     * equivalente al nombre de un host.
     * @param host
     * @return boolean correcto
     *          false ->
     */
 private static boolean comprobarHost(String host)
 {
     boolean correcto = false;
     try {
         if ((InetAddress.getByName(host)) != null){
             correcto = true;
         }
     }catch(UnknownHostException f){
         System.out.println("Direccion no encontrada");;
     }
     return correcto;

 }
}