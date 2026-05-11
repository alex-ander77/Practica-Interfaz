package Practica;

public class Auto extends Vehiculos implements Electrico{
    private String color;

    public Auto(String marca, String modelo, double velocidadMaxima, String color){
        super(marca, modelo, velocidadMaxima);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void describir(){
        System.out.println("marca: " + getMarca());
        System.out.println("modelo: " + getModelo());
        System.out.println("Velocidad Maxima: " + getVelocidadMaxima());
        System.out.println("Color: " + getColor());
    }

    @Override
    public void cargarBateria(int porcentaje) {
        System.out.println("Cargando: " + porcentaje);
    }

    @Override
    public void autonomiaKm(double porcentaje, int km) {
        System.out.println("Su autonomia: " + (porcentaje * km) + "km" );
    }
}
