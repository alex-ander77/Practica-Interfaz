# Practica-Interfaz

Proyecto: Sistema de Vehículos en Java
Descripción

Este proyecto implementa un sistema básico de vehículos utilizando los principios de la programación orientada a objetos en Java. Se modelan diferentes tipos de vehículos con una clase abstracta, herencia y una interfaz para vehículos eléctricos.
Estructura del proyecto
Clase abstracta Vehiculos

Define las características comunes de todos los vehículos:

marca
modelo
velocidad máxima

Incluye:

Constructor
Getters y setters
Método abstracto describir()
Clases hijas
Auto

Extiende Vehiculos e implementa la interfaz Electrico.

Atributos adicionales:

color

Métodos:

describir() (implementado)
cargarBateria(int porcentaje)
autonomiaKm(double porcentaje, int km)  
Moto

Extiende Vehiculos.

Atributos adicionales:

cilindraje

Métodos:

describir() (implementado)
Camion

Extiende Vehiculos.

Atributos adicionales:

llantas

Métodos:

describir() (implementado)

nterfaz Electrico

Define el comportamiento de los vehículos eléctricos:

cargarBateria(int porcentaje)
autonomiaKm(double porcentaje, int km)

Esta interfaz es implementada por las clases que representan vehículos eléctricos.

Clase Main

En la clase Main se crean instancias de los vehículos y se prueban sus métodos:

Se crea un Auto, se muestra su información, se carga batería y se calcula autonomía.
Se crea una Moto utilizando referencia del tipo Vehiculos y se ejecuta su método describir().

Conceptos aplicados
Programación orientada a objetos
Herencia
Clases abstractas
Interfaces
Polimorfismo
Sobrescritura de métodos (@Override)

Ejecución

El programa se ejecuta desde la clase Main, donde se instancian los objetos y se llaman sus métodos correspondientes.
