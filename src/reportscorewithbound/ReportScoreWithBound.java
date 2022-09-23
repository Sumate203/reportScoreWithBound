/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportscorewithbound;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ReportScoreWithBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Source s = new Source();
      Thai th = new Thai();
      Uae uae  = new Uae();
      s.addPropertyChangeListener(th);
      s.addPropertyChangeListener(uae);
       int a = 0;
        Scanner inp = new Scanner(System.in);
        while(a == 0){
        System.out.print("Enter Score");
        String result = inp.nextLine();
         if(result.equals("")){
             a = 1;
         } 
        if(!result.equals("")){
         s.setSomeDataProperty(result);
         }
       }
    }
    
}
