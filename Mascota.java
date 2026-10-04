public class Mascota {
    // Atributos
    String nombre;
    int edad;

    // Constructor
    public Mascota (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodos
    public void presentar() {
        System.out.println("Este es " + nombre + " y tiene " +edad +" añitos");
    }

}
