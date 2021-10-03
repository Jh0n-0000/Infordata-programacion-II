package pojos;

import java.util.Date;

public class DiscoSolido extends Tecnologico{
    private int capacidad;

    public DiscoSolido(String codigo, String modelo, String paisOrigen, Date fechaFabricaion, Empresa fabricante, int capacidad){
        super(codigo, modelo, paisOrigen, fechaFabricaion, fabricante);

        this.setCapacidad(capacidad);
    }


    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
