public class Mascota {
    // Atributos
    private String nombre;
    private int edad;

    // Constructor
    public Mascota (String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    // Getter & Setters
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return this.edad;
    }
    

    public void setEdad(int edad) {
        if (edad >=0) {
            this.edad = edad;
        } else {
            System.out.println("Error: la edad no puede ser negativa");
        } 
    }

    // Metodos
    public void presentar() {
        System.out.println("Este es " + getNombre() + " y tiene " +getEdad()+" añitos");
    }
}
