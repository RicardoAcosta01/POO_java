public class HolaMundo { 
        public static void main() { 
        
        System.out.println("Numero de mascotas: " + Mascota.getContadorMascotas());
        
        Mascota m1 = new Mascota("lucas");
        Mascota m2 = new Mascota("Firu", 3  , "Cafe");
        
        System.out.println("Numero de mascotas: " + Mascota.getContadorMascotas());
        m1.presentar();
        // m2.presentar();
    }
}