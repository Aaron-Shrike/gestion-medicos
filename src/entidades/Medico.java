
package entidades;

import java.util.Scanner;


public class Medico extends Persona{
    private String cmp;
    private int especialidad;

    public String getCmp() {
        return cmp;
    }

    public void setCmp(String cmp) {
        this.cmp = cmp;
    }

    public int getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(int especialidad) {
        this.especialidad = especialidad;
    }
    
    @Override
    public void leer() {
        Scanner lector = new Scanner(System.in);
        
        super.leer();
        
        System.out.print("CMP : ");
        this.cmp = lector.next();
        
        System.out.println(" 1. Medico General");
        System.out.println(" 2. Oftalmologo");
        System.out.println(" 3. Geriatra");
        System.out.println(" 4. Pediatra");
        System.out.print("Especialidad : ");
        this.especialidad = lector.nextInt();
       
    }
}
