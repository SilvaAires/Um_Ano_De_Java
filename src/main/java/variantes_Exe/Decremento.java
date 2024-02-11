package variantes_Exe;

import java.util.Scanner;

public class Decremento {
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        for(int i = 10; i >= 1; i--){
            System.out.println(i);
            Thread.sleep(2000);
        }
    }
}
