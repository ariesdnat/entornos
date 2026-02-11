package CartelSwing;


public class Main {

 public static void main(String[] args) {

     Usuario usuario = new Usuario("ana@mail.com", "premium");

     Perfil perfil = new Perfil("ana");
     usuario.agregarPerfil(perfil);

     Pelicula pelicula = new Pelicula("inception", 140, "nolan");
     Serie serie = new Serie("stranger things", 50, "ciencia ficcion");

     perfil.agregarVerMasTarde(pelicula);
     perfil.agregarVerMasTarde(serie);

     Plataforma plataforma = new Plataforma();

     plataforma.reproducirDesdePerfil(perfil, pelicula);
     plataforma.reproducirDesdePerfil(perfil, serie);
 }
}

