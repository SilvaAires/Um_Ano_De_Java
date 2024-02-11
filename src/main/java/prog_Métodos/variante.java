package prog_Métodos;

public class variante {
    public static int a = 5;

    public static void imprimir(int a, int[] vetor) {
        System.out.println();
        for(int i =0; i<vetor.length; i++) {
            System.out.print("["+vetor[i]+"] ");
        }
        System.out.println();
    }

    public static int[] exibe(int s, int v) {
        int b = 10 + s;
        int c = 25 + v;
        System.out.println(a);

        int retornoTeste = teste(s,v);
        System.out.println(retornoTeste);

        return new int[] {b, c};
    }

    public static int teste(int s, int v) {
        int b = 10 + s;
        int c = 25 + v;		
        return b;		
    }

    public static void main(String[] args) {

        imprimir(8, new int[] {2, 3, 4, 5});

        System.out.println("Sou a Main.");
        System.out.println("Sou o A: " + a);
        a = 3;
        int valor = 7;
        int aux[] = exibe(4, valor);

        System.out.println("Sou o B: ");
        System.out.println(aux[0]);
        System.out.println("Sou o C: ");
        System.out.println(aux[1]);
    }
}  

