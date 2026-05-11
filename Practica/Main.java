package Practica;

public class Main {
    public static void main(String[]args){
        Auto a1 = new Auto("Toyota", "Yaris", 115, "Amarrilo");
        a1.describir();
        a1.cargarBateria(80);
        a1.autonomiaKm(0.80, 5);

        Vehiculos m1 = new Moto("tuko", "cr3", 100, 200);
        m1.describir();
    }
}
