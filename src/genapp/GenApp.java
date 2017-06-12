package genapp;

public class GenApp {
    
    private static <T> void printArray(T[] a)
    {
        for (Object o : a) {
            System.out.println(o);
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
        Double dArr[] = new Double[3];
        dArr[0] = 10.1;
        dArr[1] = 20.2;
        dArr[2] = 30.3;
        printArray(dArr);
        Character cArr[] = new Character[3];
        cArr[0] = '1';
        cArr[1] = '2';
        cArr[2] = '3';
        printArray(cArr);
        
    }
}
