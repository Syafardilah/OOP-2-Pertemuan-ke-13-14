
package genapp;


public class GenApp4 {
    
    private static <T> void printArray(T[] a)
    {
        for (Object o : a) {
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Integer iArr[] = new Integer[3];
        iArr[0] = 10;
        iArr[1] = 20;
        iArr[2] = 30;
        printArray(iArr);
        String sArr[] = new String[3];
        sArr[0] = "sepuluh";
        sArr[1] = "dua puluh";
        sArr[2] = "tiga puluh"; 
        printArray(sArr);
}
}
