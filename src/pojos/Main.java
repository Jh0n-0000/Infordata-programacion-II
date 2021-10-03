package pojos;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //producto
        Producto producto = new Producto("C001", "Teclado retroiluminado");
        System.out.println(producto);

        //Alquilable
        Alquilable alquilable = new Alquilable("A005", "Monitor 19",10.5);
        System.out.println(alquilable);

        //Tecnologico
        Empresa empresa = new Empresa("DELL", "Av. Principal #35", 2000);
        Tecnologico tecnologico = new Tecnologico("T100", "Vostro 100", "Suiza", Calendar.getInstance().getTime(), empresa);
        System.out.println(tecnologico);

        //Monitor
        Monitor monitor = new Monitor("M111", "Monitor 21", 12.5, "FULL HD");
        System.out.println(monitor);

        // CPU
        Empresa MSI = new Empresa("MSI", "Av. America #35", 3000);
        Cpu cpu = new Cpu("Z123", "MSI", "China",Calendar.getInstance().getTime(), MSI, 16);
        System.out.println(cpu);
    }
}
