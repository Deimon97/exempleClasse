/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;
import empresa.empresaClass;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * 
 * @author Kevin Casanova Armada
 * Is the corp of menu in the Principal, is formate for two optionc add and list all the employee and exit
 */
public class empresaPrincipal {
    public static Scanner scanner =new Scanner(System.in);
    public static ArrayList listaPersonal = new ArrayList();
 
    public static void main(String [] args ) 
	{
            int fin=0;
            while(fin!=3){
            menu();
            fin=scanner.nextInt();
            switch(fin)
            {
                case 1: 
                insertar();
		break;
                case 2:
		listar();
		break;
                case 3:
                System.out.println("Saliste");
                break;
                default :
                System.out.println("Error");
                break;
                }
        }
    
}   /**
 * Is a void the print a menu of the application
 */
    public static void menu(){
        empresaClass empr = new empresaClass();
	System.out.println("Menu de la empresa"+empr.nombre);
        System.out.println("1.Insertar empleado");
	System.out.println("2.Listar plantilla");
	System.out.println("3.Salir");
    }

    /**
     * 
     * insertar, inserta datos, contiene la variable comple que son los dineros del complemento
     * is a limitet for 10 employee
     */
    public static void insertar(){
        int comple,limit=0;
        if (limit<=10){
        empresaEmpleadoClass emple = new empresaEmpleadoClass();
            System.out.println("Nombre");
            emple.setNombre(scanner.next());
            System.out.println("Complemento");
            comple=scanner.nextInt();
            emple.setSueldo(emple.complemento(comple));
            listaPersonal.add(emple);
            limit++;
        }
        
    }
    
   /**
    * listar ,lista los datos
    */
    public static void listar(){
        for( int i=0;i<listaPersonal.size();i++)
            {
		empresaEmpleadoClass emple  = (empresaEmpleadoClass) listaPersonal.get(i);
		System.out.println("Nombre: "+emple.getNombre());
		System.out.println("Sueldo: "+emple.getSueldo());
            }
    }


}