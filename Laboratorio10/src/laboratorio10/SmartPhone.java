  package laboratorio10;

import java.util.List;
import java.util.Scanner;

public class SmartPhone implements Camara,NavegadorDeInternet,ReproductorDeMusica
{

    private String Modelo;
    private String Marca;
    private String Usuario;
    private List<String> Musicas;
    private List<String> Paginas;
    private List<String> PaginasFavoritas;
    Scanner scanner = new Scanner(System.in);
    
    public SmartPhone()
    {}

    public SmartPhone(String Marca,String Modelo) {
        this.Modelo = Modelo;
        this.Marca = Marca;
    }
    
    
    //Sobreescribir metodos camara
    @Override
    public void tomarfoto()
    {
        System.out.println("Tomando Foto: Guardando ");
    }
    @Override
    public void grabarvideo()
    {
        System.out.println("Grabando Video: Guardando ");
    }
    @Override
    public void zoom()
    {
        System.out.println("ACERCAR : ALEJAR");
    }
    @Override
    public void efecto()
    {
        System.out.println("BRILLO 100% CONSTRASTE 50 % SATURACION 50% ");
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
    //Sobreescribir metodos de Navegador de internet
    @Override
    public void buscar()
    {
        String Busqueda = scanner.next();
        System.out.println("Buscando : "+Busqueda);
        System.out.println("Resultado ___________");
    }
    @Override
    public void favoritos()
    {
        //Metodo no Creado ----AñadirFavorito();----
        //Metodo no Creado ----EliminarFavorito();----
        //Metodo no Creado ----PaginasFavoritos es una sub lista filtrada();--
        System.out.println("Mostrar Favoritos " +PaginasFavoritas);
    }
    @Override
    public void historial()
    {
        System.out.println("Mostrar Historial " +Paginas);
    }
    @Override
    public void recargarpagina()
    {
        System.out.println(" F5 xD");
    }
    
       public String getModelo() {
        return Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public String getUsuario() {
        return Usuario;
    }

    public List<String> getMusicas() {
        return Musicas;
    }

    public List<String> getPaginas() {
        return Paginas;
    }

    public List<String> getPaginasFavoritas() {
        return PaginasFavoritas;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setMusicas(List<String> Musicas) {
        this.Musicas = Musicas;
    }

    public void setPaginas(List<String> Paginas) {
        this.Paginas = Paginas;
    }

    public void setPaginasFavoritas(List<String> PaginasFavoritas) {
        this.PaginasFavoritas = PaginasFavoritas;
    }
}
