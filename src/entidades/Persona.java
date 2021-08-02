
package entidades;

import java.util.Scanner;

    
public class Persona {
    private String dni;
    private String nombres;
    private String apellidos;
    private String sexo;
    
    public String getNombreCompleto(){
        return this.apellidos +  " "
                + this.nombres;
    }

    public String getDni() {
        return dni;
    }
    
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void leer() {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("DNI : ");
        this.dni = lector.next();
        
        System.out.print("Nombres : ");
        this.nombres = lector.next();

        System.out.print("Apellidos : ");
        this.apellidos = lector.next();
        
        System.out.print("Sexo : ");
        this.sexo = lector.next();
       
    }
}
