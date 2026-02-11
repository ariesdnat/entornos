package CartelSwing;

//clase pelicula
public class Pelicula extends Contenido {
 private String director;

 public Pelicula(String titulo, int duracion, String director) {
     super(titulo, duracion);
     this.director = director;
 }

 public String getDirector() {
     return director;
 }

 public void setDirector(String director) {
     this.director = director;
 }

 public void reproducir() {
     System.out.println("reproduciendo pelicula " + titulo);
 }
}
