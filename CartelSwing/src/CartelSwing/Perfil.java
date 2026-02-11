package CartelSwing;


import java.util.ArrayList;

public class Perfil {

 private String nombre;
 private ArrayList<Contenido> verMasTarde;

 public Perfil(String nombre) {
     this.nombre = nombre;
     this.verMasTarde = new ArrayList<>();
 }

 public void agregarVerMasTarde(Contenido c) {
     verMasTarde.add(c);
 }

 public void reproducirContenido(Contenido c) {
     c.reproducir();
 }

 public String getNombre() {
     return nombre;
 }
}

