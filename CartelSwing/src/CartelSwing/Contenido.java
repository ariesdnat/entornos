package CartelSwing;


public abstract class Contenido implements Reproducible {
 protected String titulo;
 protected int duracion;

 public Contenido(String titulo, int duracion) {
     this.titulo = titulo;
     this.duracion = duracion;
 }

 public String getTitulo() {
     return titulo;
 }

 public void setTitulo(String titulo) {
     this.titulo = titulo;
 }

 public int getDuracion() {
     return duracion;
 }

 public void setDuracion(int duracion) {
     this.duracion = duracion;
 }

 public String toString() {
     return titulo + " - " + duracion;
 }
}
