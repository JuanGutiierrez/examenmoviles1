package org.example;

import org.example.clases.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaPorTeclado=new Scanner(System.in);
        Jugador objetoJugador = new Jugador();
        ArrayList<Jugador> jugadores=new ArrayList<Jugador>();



        int variableDeControl=0;
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|                      Seleccion Colombia"+"                       |");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("| 1. Agregar un jugador"+"                                         |");
        System.out.println("| 2. Buscar un jugador por numero"+"                               |");
        System.out.println("| 3. Editar informacion de un jugador por numero de camiseta"+"    |");
        System.out.println("| 4. Mostrar toda la convocatoria de jugadores"+"                  |");
        System.out.println("| 5. Salir"+"                                                      |");
        System.out.println("-----------------------------------------------------------------");

        do {
            System.out.print("\nDigita una opcion del menu: ");
            variableDeControl = entradaPorTeclado.nextInt();
            switch (variableDeControl) {
                case 1:
                    int convocados;
                    if(convocados>=1){

                        convocados(convocados-1);

                        //Si voy a guardar objetos de una clase CUALQUIERA
                        //en una arraylist primero debo crear un objeto
                        //de esa clase cualquiera
                        Jugador objetoJugador = new Jugador();

                        //LLENAR/PEDIR ALMACENAR/SETEAR/LLEVAR LOS ATRIBUTOS
                        //DEL OBJETO QUE ACABO DE CREAR
                        System.out.print("\nDigita el numero de la camiseta: ");
                        objetoJugador.setNumeroCamiseta(entradaPorTeclado.nextInt());
                        entradaPorTeclado.nextLine();
                        System.out.print("\nDigita el nombre del jugador: ");
                        objetoJugador.setNombre(entradaPorTeclado.nextLine());
                        System.out.print("\nDigita los apellidos del jugador: ");
                        objetoJugador.setApellidos(entradaPorTeclado.nextLine());

                        //Si ya tiene mi objeto entonces agregamos
                        //el objeto a la lista
                        jugadores.add(objetoJugador);

                    }else {

                        System.out.println("Aragan, no te entra mas gente ahi\n");

                    }

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case  4:
                    //23 JUGADORES
                    break;

                default:
                    System.out.println("Selecciona una opcion valida");
            }
        }while (variableDeControl != 5);


    }
}