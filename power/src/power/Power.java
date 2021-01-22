/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power;
import java.io.InputStream;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Power {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
          System.out.println("Nhap so mu: "); 
        int n = sc.nextInt();
        System.out.println("2^" +n+" là " + power(n)); 
    }
    public static int power(int n){
        if(n==0){
            return 1;
        }      
        if(n==1) {
            return 2;
        }
        else{
            return 2*power(n-1); 
        }
    }
}
