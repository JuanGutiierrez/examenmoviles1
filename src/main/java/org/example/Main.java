package org.example;

import org.example.clases.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaPorTeclado=new Scanner(System.in);
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
                    Jugador objetoJugador = new Jugador();

                    System.out.print("\nIngresa el numero de la camiseta: ");
                    objetoJugador.setNumeroCamiseta(entradaPorTeclado.nextInt());
                    entradaPorTeclado.nextLine();
                    System.out.print("Ingresa el nombre del jugador: ");
                    objetoJugador.setNombre(entradaPorTeclado.nextLine());
                    System.out.print("Ingresa los apellidos del jugador: ");
                    objetoJugador.setApellidos(entradaPorTeclado.nextLine());
                    System.out.print("Ingresa la posicion en la que juega el jugador \n(Delantero, defensa, mediocampista): ");
                    objetoJugador.setPosicion(entradaPorTeclado.nextLine());
                    System.out.print("Ingresa la edad del jugador: ");
                    objetoJugador.setEdad(entradaPorTeclado.nextInt());
                    entradaPorTeclado.nextLine();
                    System.out.print("Ingresa el equipo en donde juega el jugador: ");
                    objetoJugador.setEquipoDondeJuega(entradaPorTeclado.nextLine());

                    jugadores.add(objetoJugador);
                    break;
                case 2:
                    System.out.print("Ingresa el numero del jugador que desea buscar: ");
                    int buscarCamiseta = entradaPorTeclado.nextInt();
                    for (Jugador jugador: jugadores) {
                        if (buscarCamiseta==jugador.getNumeroCamiseta()) {
                            System.out.print("\nEl jugador buscado es: \n" + "Numero Camiseta: " + jugador.getNumeroCamiseta() + "\n" + "Nombre: " + jugador.getNombre() + "\n" +
                                    "Apellido: " + jugador.getApellidos() + "\n" + "Posicion: " + jugador.getPosicion() + "\n"
                                    + "Edad: " + jugador.getEdad() + "\n" + "Equipo: " + jugador.getEquipoDondeJuega() + "\n");

                        }else {
                            System.out.println("El jugador que desea buscar no se encuentra en la convocatoria.");
                        }
                    }
                    break;
                case 3:
                    boolean i = false;
                    System.out.print("\nDigite el numero de camiseta del jugador a editar: ");
                    int numeroCamiseta = entradaPorTeclado.nextInt();
                    for (Jugador jugador: jugadores) {
                        if (numeroCamiseta==jugador.getNumeroCamiseta()) {
                            i = true;
                            System.out.print("\nIngresa el nuevo numero de la camiseta: ");
                            jugador.setNumeroCamiseta(entradaPorTeclado.nextInt());
                            entradaPorTeclado.nextLine();
                            System.out.print("Ingresa la posicion a la que desea cambiar \n(Delantero, defensa, mediocampista): ");
                            jugador.setPosicion(entradaPorTeclado.nextLine());
                            System.out.print("Ingresa el equipo en donde juega el jugador: ");
                            jugador.setEquipoDondeJuega(entradaPorTeclado.nextLine());
                        } else{
                            i = false;
                        }
                    }

                    if (i==false){
                        System.out.println("El numero de camiseta que busca no se encuentra en la convocatoria");
                    }

                    break;
                case  4:
                    for (Jugador jugador:jugadores){
                        System.out.println("\nN° de la camiseta: "+jugador.getNumeroCamiseta()+"\n"+"Nombre: "+jugador.getNombre()+"\n"+"Apellidos: "+jugador.getApellidos()+"\n"+
                                "Posicion en la que juega: "+jugador.getPosicion()+"\n"+"Edad: "+jugador.getEdad()+"\n"+
                                "Equipo al que pertenece: "+jugador.getEquipoDondeJuega()+"\n");
                    }
                    break;

                default:
                    System.out.println("Selecciona una opcion valida");
            }
        }while (variableDeControl != 5);


    }
}