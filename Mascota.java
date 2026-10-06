public class Mascota {
    // Atributos
    private String nombre;
    private int edad;
    private String color;

    // Creando Atributo static
    private static int contadorMascotas = 0;

    // Constructor
    public Mascota (String nombre, int edad, String color) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setColor(color);

        contadorMascotas++;
    }

    // Sobrecarga
    public Mascota(String nombre, int edad) {
        this(nombre, edad, "blanco");
    }
    public Mascota(String nombre) {
        this(nombre, 0, "blanco");
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

    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public static int getContadorMascotas() {
        return contadorMascotas;
    }

    // Metodos
    public void presentar() {
        System.out.println("Este es " + getNombre() + " tiene " +getEdad()+" añitos y es color "+getColor());
    }
}
