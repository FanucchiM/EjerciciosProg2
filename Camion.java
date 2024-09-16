package Ejercicio3;

import java.time.LocalDate;

public class Camion {
    private String patente;
    private LocalDate fechaLlegada;

    public Camion(String patente, LocalDate fechaLlegada) {
        this.patente = patente;
        this.fechaLlegada = fechaLlegada;
    }

    public String getPatente() {
        return patente;
    }

    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }
}
