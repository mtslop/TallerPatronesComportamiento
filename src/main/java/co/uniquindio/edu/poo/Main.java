package co.uniquindio.edu.poo;

import co.uniquindio.edu.poo.PublicadorAcademico.Estudiante;
import co.uniquindio.edu.poo.PublicadorAcademico.PublicadorAcademico;

public class Main {

    public static void main(String[] args) {
        PublicadorAcademico publicador = new PublicadorAcademico();

        Estudiante estudiante1 = new Estudiante("Nicolás");
        Estudiante estudiante2 = new Estudiante("Matias");

        publicador.suscribir(estudiante1);
        publicador.suscribir(estudiante2);

        publicador.publicarAviso("Se han publicado las notas del tercer corte.");

        publicador.cancelarSuscripcion(estudiante1);

        publicador.publicarAviso("Recordatorio: Mañana hay clase presencial.");
    }
}
