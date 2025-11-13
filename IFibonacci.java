/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P12112025;

/**
 *
 * @author THADAKAMALLA
 */

abstract class fibnocci {
    public abstract void displayinformation();
}
public class IFibonacci extends fibnocci
{
    int a =0 , b=1;
    int n = 8;
    @Override
    public void displayinformation(){
       for(int i = 0 ; i<=n ; i++)
       {
          System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
       }
       
    }
   
    public static void main(String[] args) {
        IFibonacci f = new IFibonacci();
        f.displayinformation();
           
    }
}
