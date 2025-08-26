/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author UFG
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ingresar_datos();
        
    }
    
    public static void ingresar_datos(){
    
        //inicializacion de la clase scanner
        Scanner scanner = new Scanner(System.in);
        
        //declaracion de variables a usar
        int[] edades = new int[10];
        
        int suma = 0;
        int total_pares = 0;
        int total_impares = 0;
        
        //mensaje al usuario
        System.out.println("Ingrese "+edades.length+" edades");
        
        //se recorre el arreglo para asignar valor a cada elemento        
        for(int i = 0; i < edades.length; i++){
            //se solicita al usuario el ingreso de un valor            
            System.out.println("Edad "+i+" ");
            
            //se lee desde teclado el valor digitado por el usuario
            //y se asigna a la variable de edad que corresponde segun
            //la posicion en la iteracion
            edades[i] = scanner.nextInt();
            
            //para calcular el promedio, se requiere sumar todas las
            //edades registradas en cada elemento
            suma+= edades[i];
            
            //establecer si el valor digitado es par o impar
            if( (edades[i] % 2) == 0){
                //es par
                //se incrementa la variable acumuladora
                total_pares++;
            }else{
            //es impar
            //se incrementa la variable acumuladora
            total_impares++;
            
            }
        }
        
        
        //se calcula el promedio de las edades
        double promedio = (double) suma/edades.length;
    
        //se imprime la salida
        System.out.println("Usted a ingresado: "+edades.length+" edades");
        System.out.println("El promedio de las edades ingresadas es: "+promedio);
        System.out.println("Ingresó: "+total_pares+" edades pares y "+total_impares+" edades impares");
        
        //se cierra el objeto de tipo *scanner* porque ya no habra mas lecturas
        
    }
    
}
