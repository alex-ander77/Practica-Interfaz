package Practica;

public class Camion extends Vehiculos{
    private int llantas;

    public Camion(String marca, String modelo, double velocidadMaxima, int llantas){
        super(marca, modelo, velocidadMaxima);
        this.llantas = llantas;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }
    @Override
    public void describir(){
        System.out.println("marca: " + getMarca());
        System.out.println("modelo: " + getModelo());
        System.out.println("Velocidad Maxima: " + getVelocidadMaxima());
        System.out.println("Llantas: " + getLlantas());
    }











}
