/*
 * Establezca aleatoriamente contraseña de Usuario Administrador
 * Guardar contraseña en un archivo de texto
 * Metodo para ingresar contraseña de Usuario Administrador
 * Metodo para comparar contraseña de Usuario Administrador con la contraseña guardada en el archivo de texto
 */
package sistemainventarios.USUARIOS;
import java.util.Random;
import java.util.Scanner;

/**
 * @author AYALA
 * @author DIAZ
 * @author VELANDIA
 */
public class Admin {
    private String Usuario;
    private String Contraseña;

    public Admin(String Usuario, String Contraseñan) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    public String GenerarContraseña(){
        String Contraseña = "";
        Random r = new Random();
        for (int i = 0; i < 8; i++) {
            Contraseña += r.nextInt(9);
        }
        return Contraseña;
    }

    public String IngresarContraseñaAdmin(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la contraseña de Usuario Administrador");
        String Contraseña = in.nextLine();
        return Contraseña;
    }

    public boolean CompararContraseñaAdmin(String Contraseña){
        if (Contraseña.equals(this.Contraseña)) {
            return true;
        }else{
            return false;
        }
    }


}
