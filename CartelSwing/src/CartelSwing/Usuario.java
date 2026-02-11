package CartelSwing;

//clase usuario
import java.util.ArrayList;

public class Usuario {

 private String email;
 private String plan;
 private ArrayList<Perfil> perfiles;

 public Usuario(String email, String plan) {
     this.email = email;
     this.plan = plan;
     this.perfiles = new ArrayList<>();
 }

 public void agregarPerfil(Perfil p) {
     perfiles.add(p);
 }

 public String getEmail() {
     return email;
 }

 public void setEmail(String email) {
     this.email = email;
 }

 public String getPlan() {
     return plan;
 }

 public void setPlan(String plan) {
     this.plan = plan;
 }
}
