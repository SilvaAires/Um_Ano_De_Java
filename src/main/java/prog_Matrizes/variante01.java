package prog_Matrizes;

public class variante01 {
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3},
                    {5, 6, 7},
                    {9, 10, 11},
                    };
        int tam = 3;
        for (int l = 0; l<m.length;l++){
            for (int c = 0; c<m[0].length;c++){
                if (c <= 1 - l ){
                    System.out.print(m[l][c]+" ");
                }
                else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int l = 0; l<m.length;l++){
            for (int c = 0; c<m[0].length;c++){
                if (c >= tam - l ){
                    System.out.print(m[l][c]+" ");
                }
                else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int l = 0; l<m.length;l++){
            for (int c = 0; c<m[0].length;c++){
                if (l < c ){
                    System.out.print(m[l][c]+" ");
                }
                else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int l = 0; l<m.length;l++){
            for (int c = 0; c<m[0].length;c++){
                if (l > c ){
                    System.out.print(m[l][c]+" ");
                }
                else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int l = 0; l<m.length;l++){
            for (int c = 0; c<m[0].length;c++){
                if (l == c ){
                    System.out.print(m[l][c]+" ");
                }
                else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int l = 0; l<m.length;l++){
            for (int c = 0; c<m[0].length;c++){
                if (l+c == 2 ){
                    System.out.print(m[l][c]+" ");
                }
                else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println(" ");
        }
    }
}

