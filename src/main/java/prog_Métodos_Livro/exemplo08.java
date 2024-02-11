package prog_Métodos_Livro;

/**
 *
 * @author Silva
 */
public class exemplo08 {
    public static int divisivel(int x, int y){
        int n1 = 0;
        int r = x % y;
        while (r == 0){
            n1 ++;
            x = x / y;
            r = x % y; 

        }
        return n1;
    }
    public static void main(String[]args){
        int x = 100;
        int y = 2;
        System.out.println(divisivel(x, y));
    }
}
