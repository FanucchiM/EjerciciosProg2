package Ejercicio3;

import java.time.LocalDate;

public class Ejercicio3Main {
    public static void main(String[] args) {

        Barco b1 = new Barco("Perla Negra", 100);
        Barco b2 = new Barco("El holandes", 50);
        Camion c1 = new Camion("AF234WS", LocalDate.of(2024, 9, 21));
        Camion c2 = new Camion("AD441HY", LocalDate.of(2024, 12, 17));
        Puerto p1 = new Puerto();
        p1.addBarco(b1);
        p1.addCamion(c1);
        p1.descargarCamion();
        p1.cargarBarco();

    }
}
