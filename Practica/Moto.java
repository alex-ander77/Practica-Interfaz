package Practica;

public class Moto extends Vehiculos{
    private double cilindraje;

    public Moto(String marca, String modelo, double velocidadMaxima, double cilindraje){
        super(marca, modelo, velocidadMaxima);
        this.cilindraje = cilindraje;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }
    @Override
    public void describir(){
        System.out.println("marca: " + getMarca());
        System.out.println("modelo: " + getModelo());
        System.out.println("Velocidad Maxima: " + getVelocidadMaxima());
        System.out.println("Cilindraje: " + getCilindraje());
    }
}
