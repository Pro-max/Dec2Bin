/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin2dec;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
  class DigitConverter {
    String number = null;
    boolean decimal = true;
    
    DigitConverter(String num , boolean decimal)
    {
        number = num;
        this.decimal = decimal;
    }
    
    public void convert()
    {
        if (decimal)
        {
    ArrayList<Integer> a = new ArrayList();
    int  whole_num = Integer.parseInt(number);
    int biggestbit = -1;
    int size_num = 0;
    while (whole_num != 0 )
    {
        
        biggestbit = (int) 
                (Math.log10(whole_num)/Math.log10(2));
        
        
        a.add(biggestbit);
        whole_num = whole_num - (int) Math.pow(2, biggestbit);
    }
   //System.out.println("All the bits are" + a );
    int sum = 0;
    for (int i:a)
    {
        sum = (int) (sum + Math.pow(10,i));
    }
    System.out.println("Binary number is:" + sum );
   
    
        }
        else
        {
            int bitnum = 0;
            int sum = 0;
            int temp_bit = 0;
            for (int i =number.trim().length()-1 ; i >=0  ; i--)
            {
                temp_bit = Integer.parseInt(number.charAt(i)+"");
                sum = (int) (sum + temp_bit * Math.pow(2, bitnum));
                //System.out.println("Bit " + bitnum + "is :" + number.charAt(i));
                bitnum ++;
            }
            System.out.println("Decimal: " + sum );

            
        }
    }
    
    
    
    
}
