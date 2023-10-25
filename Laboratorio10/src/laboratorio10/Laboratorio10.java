package laboratorio10;
public class Laboratorio10 {
    public static void main(String[] args) {
        Equipos lab = new Equipos();
        SmartPhone celu = new SmartPhone("Xiaomi","MI 11 lite 5G");    
        Mp3 mp = new Mp3("G5 pro","SanDisk");
        lab.agregarcamera(celu);
        lab.agregarReproductorDeMusica(celu);
        lab.agregarNavegadorDeInternet(celu);
        lab.agregarReproductorDeMusica(mp);
      
    }
}
