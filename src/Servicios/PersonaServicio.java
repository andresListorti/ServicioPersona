package Servicios;

import java.util.Scanner;

import Entidades.Persona;

public class PersonaServicio {
    Scanner leer = new Scanner(System.in);

    public boolean esMayorDeEdad(Persona persona) {
        boolean esMayor = false;
        if (persona.getEdad() > 18) {
            esMayor = true;
        } else {
            esMayor = false;
        }
        return esMayor;
    }

    public Persona crearPersona() {
        String nombre;
        int edad;
        String sexo = "";
        String respuestaSexo;
        double peso;
        double altura;
        boolean condition = true;
        System.out.println("Creando Persona===============================");
        System.out.println("Ingrese El nombre de la nueva persona a crear: ");
        nombre = leer.next();
        System.out.println("Ingrese la edad: ");
        edad = leer.nextInt();
        do {

            System.out.println("Ingrese Sexo. Solo 'H' para Hombre, 'M' para Mujer u 'O' para Otro: ");
            respuestaSexo = leer.next();
            respuestaSexo.toUpperCase();
            if (respuestaSexo.equals("H") || respuestaSexo.equals("M") || respuestaSexo.equals("O")) {
                sexo = respuestaSexo;
                condition = false;
            } else {
                System.out.println("Error solo H, M u O================================");
            }
        } while (condition);
        System.out.println("Ingrese Peso en Kilos: ");
        peso = leer.nextDouble();
        System.out.println("Ingrese altura en Metros: ");
        altura = leer.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona persona) {
        int salida = 33;
        double IMC = persona.getPeso() / (Math.pow(persona.getAltura(), 2));
        if (IMC < 20) {
            salida = -1;
        }
        if (IMC >= 20 && IMC <= 25) {
            salida = 0;
        }
        if (IMC > 25) {
            salida = 1;
        }

        return salida;
    }
}
