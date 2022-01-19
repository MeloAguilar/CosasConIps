package Ejercicio1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

import static java.net.InetAddress.getLocalHost;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        InetAddress n = obtenerHost(sc);

        System.out.println(n.getHostAddress()); }


private static InetAddress obtenerHost(Scanner sc)
 {

     InetAddress add = null;
     try{
         add = InetAddress.getByName(nombreHost(sc)) ;
     }catch(UnknownHostException e){

         System.out.println("Direccion no encontrada");;
     }
     return add;
 }





















 private static String nombreHost(Scanner sc){
     System.out.println("Escribe el nombre del host");
     return sc.nextLine();
 }
}