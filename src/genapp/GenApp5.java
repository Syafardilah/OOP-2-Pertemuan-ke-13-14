/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genapp;

public class GenApp5 {
    
    private static <L> void printArray(L[] a)
    {
        for (Object p : a) {
            System.out.println(p);
        }
    }
    
    public static void main(String[] args) {
        Integer cArr[] = new Integer[3];
        cArr[0] = 10;
        cArr[1] = 20;
        cArr[2] = 30;
        printArray(cArr);
        String dArr[] = new String[3];
        dArr[0] = "sepuluh";
        dArr[1] = "dua puluh";
        dArr[2] = "tiga puluh"; 
        printArray(dArr);
        
        public static void main(String[] args) {
        GenericTwoTypes<Character, Integer>
                genCharInt = new GenericTwoTypes<>();
                genCharInt.setType(1);
                System.out.println(genCharInt.getType());
    }
    
}

