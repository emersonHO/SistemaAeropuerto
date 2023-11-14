
package modelo;

public class Usuario {
    private String user;
    private String pass;
    private String clase;
    private String nombres;
    private String apellidos;
    private String dni;
    private String correo;

    public Usuario(String user, String pass, String clase, String nombres, String apellidos, String dni, String correo) {
        this.user = user;
        this.pass = pass;
        this.clase = clase;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.correo = correo;
    }
    public Usuario( String pass, String clase, String nombres, String apellidos, String dni, String correo) {
        this.user = nombres;
        this.pass = pass;
        this.clase = clase;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.correo = correo;
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean ingresarSistema(String usuario, String clave, String tipoEmpleado){
        boolean resultado = false;
        if(this.user.equalsIgnoreCase(usuario) &&
                this.pass.equals(clave)){
            resultado = true;
        }
        return resultado;
    }
    public boolean validarDatos(Usuario user){
        return !user.pass.isEmpty() && !user.clase.isEmpty() && !user.nombres.isEmpty() && !user.apellidos.isEmpty() && !user.dni.isEmpty() && !user.correo.isEmpty();
    }
}
