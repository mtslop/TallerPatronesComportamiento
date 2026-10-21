package co.uniquindio.edu.poo.PublicadorAcademico;

import java.util.ArrayList;
import java.util.List;

public class PublicadorAcademico implements Sujeto {
    private List<Observador> observadores;

    /**
     * Constructor por defecto que inicializa la lista de observadores
     */
    public PublicadorAcademico() {
        this.observadores = new ArrayList<>();
    }

    /**
     * Metodo que Suscribe un nuevo observador a la lista del publicador
     * @param observador El observador a añadir
     */
    @Override
    public void suscribir(Observador observador) {
        if (!observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    /**
     * Metodo que Cancela la suscripción de un observador de la lista[cite: 1].
     * @param observador El observador a remover[cite: 1].
     */
    @Override
    public void cancelarSuscripcion(Observador observador) {
        observadores.remove(observador);
    }

    /**
     * Metodo que Notifica a todos los observadores registrados invocando el metodo de actualizacion
     * @param mensaje El mensaje a distribuir
     */
    @Override
    public void notificar(String mensaje) {
        for (Observador observador : observadores) {
            observador.actualizar(mensaje);
        }
    }

    /**
     * Metodo que sirve para publicar un aviso academico y disparar las notificaciones
     * @param mensaje El texto del aviso académico
     */
    public void publicarAviso(String mensaje) {
        System.out.println("--- Publicando nuevo aviso académico ---");
        notificar(mensaje);
    }

    public List<Observador> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<Observador> observadores) {
        this.observadores = observadores;
    }

    @Override
    public String toString() {
        return "PublicadorAcademico{observadoresCount=" + observadores.size() + "}";
    }
}
