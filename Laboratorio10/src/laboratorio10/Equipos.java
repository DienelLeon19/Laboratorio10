package laboratorio10;
import java.util.ArrayList;
import java.util.List;

public class Equipos {
    
    List<Camara> camera = new ArrayList<>();
    List<NavegadorDeInternet> navegadores = new ArrayList<>();
    List<ReproductorDeMusica> reproductor = new ArrayList<>();  
    
    public void agregarcamera(Camara cam)
    {
        camera.add(cam);
    }
    public void agregarNavegadorDeInternet(NavegadorDeInternet nav)
    {
        navegadores.add(nav);
    }
    public void agregarReproductorDeMusica(ReproductorDeMusica rep)
    {
        reproductor.add(rep);
    } 
    
    
    
    
    
    
    
    
    
    
}

