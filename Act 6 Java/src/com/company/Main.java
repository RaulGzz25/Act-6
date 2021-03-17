package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Inicializamos el atributo de Nombre
        String NombreAlumno;
        System.out.println("Introduzca Nombre del alumno: ");
        Scanner Nombre = new Scanner(System.in);
        NombreAlumno = Nombre.nextLine();

        //Obtener las calificaciones dentro de un array
        int[] Calificaciones = new int[5];
        int i = 0;
        Scanner teclado = new Scanner(System.in);
        for (i = 0; i < Calificaciones.length; i++) {
            System.out.printf("Introduzca Calificación: ");
            Calificaciones[i] = teclado.nextInt();

        }
        System.out.println();
        System.out.println("Nombre del alumno: \"" + NombreAlumno + "\"");
        double promedio=Promedio(Calificaciones);
        char letra =Letras(promedio);
        Imprimir(promedio,Calificaciones,letra);
    }

    //Sacar el promedio de las calificaciones
    public static double Promedio ( int Calificaciones[]) {

        double Promedio = 0;
        int Suma = 0;
        for ( int i = 0; i < Calificaciones.length; i++) {
            Suma += Calificaciones[i];
        }
        Promedio = Suma / Calificaciones.length;
        return Promedio;
    }

    //Comparar el promedio con un carácter
    public static char Letras (double Promedio){
        char letra;
        letra = 'N';
        if (Promedio <= 50) {
            return letra = 'F';
        } else if (Promedio < 60) {
            return letra = 'E';
        } else if (Promedio < 70) {
            return letra = 'D';
        } else if (Promedio < 80) {
            return letra = 'C';
        } else if (Promedio < 90) {
            return letra = 'B';
        } else if (Promedio <= 100) {
            return letra = 'A';
        }
        return letra;
    }

    public static void Imprimir(double Promedio, int Calificaciones[], char letra){

        int y = 1;
        System.out.println("Nombre del estudiante: \"" + Promedio + "\"");
        for (int i=0; i<Calificaciones.length; i++){
            System.out.println("Calificación " + y + ": \"" + Calificaciones[i] + "\"");
            y++;
        }
        System.out.println("Promedio: \"" + Promedio + "\"");
        System.out.println("Calificación: \"" + letra + "\"");

    }
}

