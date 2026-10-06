public class HolaMundo { 
        public static void main() { 
        Mascota m1 = new Mascota("lucas");
        Mascota m2 = new Mascota("Firu", 3  , "Cafe");
            
        m2.setEdad(-2);

        m1.presentar();
        m2.presentar();
    }
}