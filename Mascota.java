public class Mascota {
    // Atributos
    private String nombre;
    private int edad;

    // Constructor
    public Mascota (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter
    public String getNombre() {
        return this.nombre;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        System.out.println("Este es " + this.nombre + " y tiene " +this.edad +" añitos");
}
}
