package co.uniquindio.edu.poo.PublicadorAcademico;

public interface Sujeto {

    /**
     * Metodo que Suscribe a un observador para que comience a recibir notificaciones
     * @param observador El observador que se desea suscribir
     */
    void suscribir(Observador observador);

    /**
     * Metodo que Cancela la suscripción de un observador existente
     * @param observador El observador que se desea remover
     */
    void cancelarSuscripcion(Observador observador);

    /**
     * Metodo que Notifica un mensaje a todos los observadores registrados
     * @param mensaje El mensaje que será enviado
     */
    void notificar(String mensaje);
}