
package calificaciones;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */

/*
Algoritmo que calcula el número de alumnos aprobados, número de alumnos reprobados, el porcentaje de aprobados y reprobados
y la cantidad de alumnos cuya calificación es mayor o igual a 4
*/
public class Calificaciones {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner buscar = new Scanner(System.in);
        int i, aprobados = 0, reprobados = 0, porceAprovados = 0, porceReprovados = 0;
        int alumNotaMarorIgual4 = 0;
        double suma = 0, promedioGrupo = 0;
        System.out.println("ingrese el numero de alumnos");
        int alumnos = buscar.nextInt();
        double Notas[] = new double[alumnos];

        for (i = 0; i < alumnos; i++) {
            System.out.println("alumno" + (i + 1) + " nota final:");
            Notas[i] = buscar.nextDouble();

            suma = suma + Notas[i];
            promedioGrupo = suma / Notas.length;

        }
        System.out.println("la suma es:" + suma);
        System.out.println("el promedio del grupo es:" + promedioGrupo);
        for (i = 0; i < Notas.length; i++) {
            if (Notas[i] >= 3 && Notas[i] <= 5) {

                aprobados++;
                porceAprovados = (100 * aprobados) / alumnos;

            } else {
                if (Notas[i] >= 0 && Notas[i] < 3) {
                    reprobados++;
                    porceReprovados = (100 * reprobados) / alumnos;

                }
            }
            if (Notas[i] >= 4) {

                alumNotaMarorIgual4++;
            }
        }

        System.out.println("el numero de alumnos aprovados son:" + aprobados);
        System.out.println("el numero de alumnos reprobados es:" + reprobados);
        System.out.println("porcentaje alumnos aprobados:" + porceAprovados);
        System.out.println("porcentaje alumnos reprobados:" + porceReprovados);
        System.out.println("alumnos cuya calificacion es mayor e igual a 4 es:" + alumNotaMarorIgual4);
    }

}

