public class HolaMundo { 
        public static void main() { 
        Mascota miMascota = new Mascota("Lucas", 2); 
        Mascota m2 = new Mascota("Firu", -1);

        // Intentamos asignar una edad inválida para probar el Setter 
        miMascota.setEdad(-5);

        miMascota.presentar();
        m2.presentar();
    } 
}