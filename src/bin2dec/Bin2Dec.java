/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin2dec;

/**
 *
 * @author admin
 */
public class Bin2Dec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       DigitConverter dc = new DigitConverter("97", false);
       dc.convert();
       DigitConverter dc1 = new DigitConverter("97", true);
       dc1.convert();
        // TODO code application logic here
    }
    
}
