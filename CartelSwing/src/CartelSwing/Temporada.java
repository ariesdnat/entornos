package CartelSwing;

//clase temporada
import java.util.ArrayList;

public class Temporada {
 private int numero;
 private ArrayList<Capitulo> capitulos = new ArrayList<>();

 public Temporada(int numero) {
     this.numero = numero;
 }

 public void agregarCapitulo(Capitulo c) {
     capitulos.add(c);
 }

 public int getNumero() {
     return numero;
 }

 public void setNumero(int numero) {
     this.numero = numero;
 }
}
