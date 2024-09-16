package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private List<Barco> colaBarcos;
    private List<Camion> colaCamiones;

    public Puerto() {
        this.colaBarcos = new ArrayList<>();
        this.colaCamiones = new ArrayList<>();;
    }

    public void addBarco(Barco barco){

        //Si no hay elementos en la cola, lo agrego
        if (colaBarcos.size()>0){
            colaBarcos.add(barco);
            //Sino voy comparando uno por uno hasta ingresarlo ordenado
        }else{
            int lugar = 0;
            while (lugar < colaBarcos.size() && compareBarcos(colaBarcos.get(lugar), barco)) {
                lugar++;
            }
            if (lugar < colaBarcos.size()) {
                colaBarcos.add(lugar, barco);
            } else {
                colaBarcos.add(barco);
            }

        }

    }
    public boolean compareBarcos (Barco b1, Barco b2){
        return b1.getCapacidad() > b2.getCapacidad();
    }


    public void addCamion(Camion camion){
        if (colaCamiones.size()>0){
            colaCamiones.add(camion);
        }else{
            int lugar = 0;

            while (lugar < colaCamiones.size() && compareCamiones(colaCamiones.get(lugar), camion)) {
                lugar++;
            }
            if (lugar < colaCamiones.size()) {
                colaCamiones.add(lugar, camion);
            } else {
                colaCamiones.add(camion);
            }

        }

    }
    public boolean compareCamiones (Camion c1, Camion c2){
        return c1.getFechaLlegada().isBefore(c2.getFechaLlegada());
    }

    public void descargarCamion() {
        if (colaCamiones.size()>0) {
            System.out.println(colaCamiones.get(0).getPatente() + " ha descargado con exito");
            colaCamiones.remove(0); //remueve el primer camión
        } else {
            System.out.println("No hay camiones en espera.");

        }
    }
    // Cargar el barco con mayor capacidad
    public void cargarBarco() {
        if (!colaBarcos.isEmpty()) {
            System.out.println(colaBarcos.get(0).getNombre() + "ha cargado con exito");
            colaBarcos.remove(0); // remueve el barco de mayor capacidad
        } else {
            System.out.println("No hay barcos en espera.");

        }
    }
    public boolean tieneBarcos(){
        return colaBarcos.size()>0;
    }
}
