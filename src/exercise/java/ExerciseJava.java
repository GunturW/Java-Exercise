/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.java;

/**
 *
 * @author 247
 */
import java.util.Arrays;
public class ExerciseJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] komposit = {4,6,8,9,10,12,14,15,16,18};
        for(int i = 0; i <= (komposit.length-1); i++){
            if(i % 2 == 0){
                System.out.print(komposit[i]+" "); //Output: 4,8,10,14,16
                
            }
        }
        System.out.println();
        int[] number = {1,2,3,4,6,7,8,9,10,11,13,14,16,20};
        for(int j = 0; j <= (number.length - 1); j++){
            if(number[j] % 2 == 0){
                System.out.print(number[j]+" "); //Output; 2 4 6 8 10 14 16 20
            }
                
        }
       
    }
}   
