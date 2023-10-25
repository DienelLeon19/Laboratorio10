package laboratorio10;
import java.util.List;

public class Mp3 implements ReproductorDeMusica
{
   
    private String Modelo;
    private String Marca;
    private List<String> Musicas;

    public Mp3() {
    }

    public Mp3(String Modelo, String Marca)
    {
        this.Modelo = Modelo;
        this.Marca = Marca;
    }
    
    
     //Sobreescribir metodos de reproducor de musica
    @Override
    public void reproducir()
    {
        System.out.println("Reproduciendo Musica :"+Musicas);
    }
    @Override
    public void retroceder()
    {
        System.out.println(" - 5 SEGUNDOS");
    }
    @Override
    public void adelantar()
    {
        System.out.println(" - 5 SEGUNDOS");
    }
    @Override
    public void pause()
    {
        System.out.println("Páusando Musica :"+Musicas);
    }
     public String getModelo() {
        return Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public List<String> getMusicas() {
        return Musicas;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setMusicas(List<String> Musicas) {
        this.Musicas = Musicas;
    }
}
