package org.example.clases;

public class Jugador {

    private int numeroCamiseta;
    private String nombre;
    private String apellidos;
    private String posicion;
    private int edad;
    private String equipoDondeJuega;

    public Jugador() {
    }

    public Jugador(int numeroCamiseta, String nombre, String apellidos, String posicion, int edad, String equipoDondeJuega) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.posicion = posicion;
        this.edad = edad;
        this.equipoDondeJuega = equipoDondeJuega;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEquipoDondeJuega() {
        return equipoDondeJuega;
    }

    public void setEquipoDondeJuega(String equipoDondeJuega) {
        this.equipoDondeJuega = equipoDondeJuega;
    }
}
 //NUMERO CAMISETA, NOMBRE,
//APELLIDOS, POSICION, EDAD Y EQUIPO DONDE JUEGA)