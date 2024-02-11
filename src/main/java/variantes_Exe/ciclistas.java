package variantes_Exe;

public class ciclistas {
    public static void main(String[] args) throws InterruptedException {
        int alice = 2000;
        int eliana = 0;
        int segundos = 0;
        while (alice > eliana){
            segundos++;
            eliana = eliana + 20;
            alice = alice - 40;
            System.out.println("Tempo em segundos: " + segundos);
            System.out.println("Distância Eliana: " + eliana);
            System.out.println("Distância Alice: " + alice);
            System.out.println("");
            Thread.sleep(100);
        }
    } 
}
