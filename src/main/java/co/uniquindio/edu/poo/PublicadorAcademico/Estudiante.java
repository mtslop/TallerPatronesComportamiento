package co.uniquindio.edu.poo.PublicadorAcademico;

public class Estudiante implements Observador {
    private String nombre;

    /**
     * Constructor para inicializar el estudiante con su nombre
     * @param nombre Nombre del estudiante
     */
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que procesa y actualiza la informacion recibida
     * @param mensaje El mensaje de la notificación
     */
    @Override
    public void actualizar(String mensaje) {
        System.out.println("Estudiante " + nombre + " ha recibido el aviso: " + mensaje);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{nombre='" + nombre + "'}";
    }

}
