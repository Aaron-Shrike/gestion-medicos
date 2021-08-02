
package examenfinal;

import entidades.Medico;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ExamenFinal {
    public static List<Medico> medicos = new ArrayList<>();
    
    public static void main(String[] args) {
        int opcion;
        
        do{
            opcion = pedirOpcion();
            
            switch(opcion){
                case 1: registrarMedico(); break;
                case 2: buscarPorDNI(); break;
                case 3: buscarPorCMP(); break;
                case 4: listarSegunEspecialidad(); break;
            }
        }while(opcion < 5);
    }

    private static int pedirOpcion() {
        Scanner lector = new Scanner(System.in);
        int op;
        
        System.out.println("\n\n1----------- MENU DE OPCIONES ----------");
        System.out.println("1. Registrar Medico");
        System.out.println("2. Buscar medico por DNI");
        System.out.println("3. Buscar medico por CMP");
        System.out.println("4. Listar medicos segun su especialidad");
        System.out.println("5. Salir");
        System.out.print("  Opcion : ");
        op = lector.nextInt();
        
        return op;
    }

    private static void registrarMedico() {
        Medico medi = new Medico();
        
        System.out.println("");
        medi.leer();
        medicos.add(medi);
    }

    private static void buscarPorDNI() {
        Scanner lector = new Scanner(System.in);
        
        String auxDNI;
        Medico medi;      
        int flag = 0;
        
        System.out.print("\nIngrese DNI : ");
        auxDNI = lector.next();
        
        for(int i=0; i<medicos.size();i++){
            medi = medicos.get(i);
            
            if(medicos.get(i).getDni().equalsIgnoreCase(auxDNI)){
                System.out.println(" " + medi.getNombreCompleto() + " - " + medi.getCmp());
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("\t* Medico no encontrado ");
        }
    }

    private static void buscarPorCMP() {
        Scanner lector = new Scanner(System.in);
        
        String auxCMP;
        Medico medi;
        int flag = 0;
        
        System.out.print("\nIngrese CMP : ");
        auxCMP = lector.next();
        
        for(int i=0; i<medicos.size();i++){
            medi = medicos.get(i);
            
            if(medi.getCmp().equalsIgnoreCase(auxCMP)){
                System.out.println(" " + medi.getNombreCompleto() + " (" + medi.getDni() + ")");
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("\t* Medico no encontrado ");
        }
    }

    private static void listarSegunEspecialidad() {
        Scanner lector = new Scanner(System.in);
        
        int auxEspecialidad;
        int flag = 0;
        int n = 0;
        Medico medi;       
        
        System.out.println("\n 1. Medico General");
        System.out.println(" 2. Oftalmologo");
        System.out.println(" 3. Geriatra");
        System.out.println(" 4. Pediatra");
        System.out.print("Especialidad : ");
        auxEspecialidad = lector.nextInt();
        
        for(int i=0; i<medicos.size();i++){
            medi = medicos.get(i);
            
            if(medi.getEspecialidad() == auxEspecialidad){
                flag = 1;
                
                System.out.println(" " + (n+1) + ".- " + medi.getNombreCompleto() + " " 
                        + medi.getCmp() + " (" + medi.getDni() + ")");
                n++;
            }    
        }
        
        if(flag == 0){
            System.out.println("\t* No hay medicos registrados en esa especialidad");
        }
    }
    
}
