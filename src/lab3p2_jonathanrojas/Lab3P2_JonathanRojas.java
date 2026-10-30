/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_jonathanrojas;
import java.util.Scanner;
public class Lab3P2_JonathanRojas {
    static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("Pokedex ");
            System.out.println("1. Registrar pokemon");
            System.out.println("2. Mostrar pokedex completa ");
            System.out.println("3. Buscar pokemon");
            System.out.println("4. Entrenar pokemon ");
            System.out.println("5. marcar como Capturado ");
            System.out.println("6. Reporte del profesor espinal ");
            System.out.println("7. salir ");
            opcion=entrada.nextInt();
            switch(opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Saliendo de el programa ");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta ");
            }
        }while(opcion!=7);
    }
}
