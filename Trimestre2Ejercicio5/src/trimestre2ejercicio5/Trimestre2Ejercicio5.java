/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trimestre2ejercicio5;

/**
 *
 * @author Usuario DAM 1
 */
public class Trimestre2Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pizza  p1 = new Pizza("margarina", "mediana");
       Pizza  p2 = new Pizza("","");
       Pizza  p3 = new Pizza("cuatro quesos", "medianas");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p1.sirve();
        System.out.println(p1);
        p1.sirve();
        System.out.println("servidas: "+ Pizza.getTotalServidas());
        System.out.println("pedidas: "+ Pizza.getTotalPedidas());
    }
    
}
