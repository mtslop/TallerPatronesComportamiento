package co.uniquindio.edu.poo.PublicadorAcademico;

public interface Observador {

    /**
     * Metodo que Actualiza al observador con el mensaje recibido del sujeto
     * @param mensaje El contenido del mensaje recibido
     */
    void actualizar(String mensaje);
}
