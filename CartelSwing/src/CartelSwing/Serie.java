package CartelSwing;

//clase serie
import java.util.ArrayList;

public class Serie extends Contenido {
 private String genero;
 private ArrayList<Temporada> temporadas = new ArrayList<>();

 public Serie(String titulo, int duracion, String genero) {
     super(titulo, duracion);
     this.genero = genero;
 }

 public void agregarTemporada(Temporada t) {
     temporadas.add(t);
 }

 public String getGenero() {
     return genero;
 }

 public void setGenero(String genero) {
     this.genero = genero;
 }

 public void reproducir() {
     System.out.println("reproduciendo serie " + titulo);
 }
}
