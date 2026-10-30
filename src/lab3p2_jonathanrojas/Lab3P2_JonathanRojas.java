/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_jonathanrojas;
import java.util.Scanner;
import java.util.ArrayList;
public class Lab3P2_JonathanRojas {
    static Scanner entrada=new Scanner(System.in);
    static ArrayList<Pokemon>pokemons=new ArrayList<Pokemon>();
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
    public static void registrarPoke(){
        System.out.println("Ingrese el numero de la pokedex(>0): ");
        int numero=entrada.nextInt();
        boolean existe=false;
        for (int i = 0; i < pokemons.size(); i++) {
            if (pokemons.get(i).getNumeroPokedex() == numero) {
                existe=true;
            }
        }
        if(numero<=0){
            System.out.println("El numero de la pokedex debe ser mayor a 0");
        }
        if(existe){
            System.out.println("El numero de pokemon ya existe");
        }
        entrada.nextLine();
        System.out.println("Ingrese el nombre del pokemon ");
        String nombre=entrada.nextLine();
        System.out.println("Ingrese el tipo de el pokemon");
        String tipo=entrada.nextLine();
        System.out.println("Ingrese el nivel de el pokemon(1 al 100): ");
        int nivel=entrada.nextInt();
        while(nivel<=0||nivel>=100){
            System.out.println("Ingrese un nivel valido");
            nivel=entrada.nextInt();
        }
        System.out.println("Ingrese los puntos de salid de el pokemon(>0)");
        double puntosSalud=entrada.nextDouble();
        while(puntosSalud<=0){
            System.out.println("Ingrese unos puntos de salud validos");
            puntosSalud=entrada.nextDouble();
        }
        System.out.println("El pokemon ya fue capturado?(1. si/2. no");
        int opcion=entrada.nextInt();
    }
}
