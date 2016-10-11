/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa2;

/**
 *
 * @author dawbio
 */

/**
 * 
 * @author dawbio
 * Is the class the afect a empleado in the empresa, the Atribute are nombre 
 * and sueldo ,are private
 * And the constructor
 */
public class empresa2EmpleadoClass {

    private String nombre;
     private int sueldo;
     
   public empresa2EmpleadoClass()
   {
   }
   /**
    * 
    * @param nombre is the name of employee
    * @param sueldo  is the salary of the employee
    */  
    public empresa2EmpleadoClass(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo= sueldo;
    }
     
    /**
     * 
     * @return a name for look in the Principal
     */
    public String getNombre() {
        return nombre;
    }
/**
 * 
 * @param nombre name of the employee
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * 
 * @return the salary for use in princiapl
 */
    public int getSueldo() {
        return sueldo;
    }
/**
 * 
 * @param sueldo is a salary of the employee 
 */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
   /**
    * 
    * @param comple is the complement a sum in the salary
    * @return the sum a salary and complement
    */
    public int complemento (int comple)
    {
        return comple+800;
    }
          
    
}
