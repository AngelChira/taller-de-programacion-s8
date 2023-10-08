package semana08;

import java.util.Scanner;

public class Semana08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nota=0, notaMenor=20, notaMayor=0, notaBaja=20, promedio=0;
        int numeroAprobados=0, numeroDesaprobados=0;
        for (int i=1; i<=5; i++){
            System.out.println("Notas del alumno "+i);
            for (int j=1; j<=4; j++){
                while (nota>=0||nota<=20){
                    System.out.print("Ingrese la nota "+j+": ");
                    nota = teclado.nextFloat();
                    if (nota<0||nota>20){
                        System.out.println("Error, al ingresar la nota.");
                    }else{
                        break;
                    }
                }
                if (nota>notaMayor){
                    notaMayor = nota;
                }
                if (nota<notaMenor){
                    notaMenor = nota;
                }
                if (nota<notaBaja){
                    notaBaja = nota;
                }
                promedio = promedio + nota;
            }
            promedio = (promedio - notaBaja)/3.0f;
            notaBaja = 20;
            System.out.printf("El promedio del alumno %d es %.2f %n",i,promedio);
            if(promedio>11.6){
                numeroAprobados++;
            } else {
                numeroDesaprobados++;
            }
            promedio=0;
        }
        System.out.println("El numero de aprobados es "+numeroAprobados);
        System.out.println("El numero de desaprobados es "+numeroDesaprobados);
        System.out.printf("La nota Maxima ingresada es %.2f %n",notaMayor);
        System.out.printf("La nota Minima ingresada es %.2f %n",notaMenor);
    }
    
}