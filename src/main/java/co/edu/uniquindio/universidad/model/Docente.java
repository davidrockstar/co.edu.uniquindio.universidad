package co.edu.uniquindio.universidad.model;

public class Docente {

    String nombre;
    String apellido;
    String email;
    String identificacion;
    int edad;
    Universidad ownedByUniversidad;

    public Docente() {}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getIdentificacion() {return identificacion;}
    public void setIdentificacion(String identificacion) {this.identificacion = identificacion;}
    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
    public Universidad getOwnedByUniversidad() {return ownedByUniversidad;}

    @Override
    public String toString() {
        String nom = nombre != null ? nombre : "(sin nombre)";
        String ape = apellido != null ? apellido : "(sin apellido)";
        String mail = email != null ? email : "(sin email)";
        return String.format("- %s %s | Email: %s | Edad: %d", nom, ape, mail, edad);
    }
}
