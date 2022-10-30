/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

/**
 *
 * @author mariangel17
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solución a la problemática
         
        //Aqui se realiza la definición y asignación de valores a las variables que son enteras
        int variable1 = 1;
        int variable2 = 2;
        int variable3 = 4;
        int variable4 = 3;
        int variable5 = 5;
        int variable6 = 81; // valor de imagen dice 81 se asigna ese valor (valor codigo 80 )

        System.out.println("-------Solución a problema------------------");
        // Math.sqrt me permite obtener la raíz cuadrada de un número
        //Se realiza la operación indicada suma de las variables 1 a la 4 divido para var5 mas la raiz de la var 6
        double resultado = (variable1 + variable2 + variable3 + variable4) / 
                variable5 + Math.sqrt(variable6);
        
        
        
        System.out.println(resultado);

    }

}

