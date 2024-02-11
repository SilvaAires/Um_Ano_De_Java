package algoritmo_Lista09_laço_while;

/*
4. Anacleto mede 150cm e cresce 2cm por ano, enquanto Felisberto tem 110cm e cresce 3cm por ano.
Escreva uma classe em Java que calcule e imprima quantos anos serão necessários para que Felisberto
seja maior que Anacleto. 
*/

public class exe04 {
    public static void main(String[] args) {
        int anacleto = 150;
        int felisberto = 110;
        int anos = 0;
        while (felisberto <= anacleto){
            anacleto = anacleto + 2;
            felisberto = felisberto + 3;
            anos++;
        }
        System.out.println("Anacleto: " + anacleto);
        System.out.println("Feliberto: " + felisberto);
        System.out.println("Quant. de anos: " + anos);
    }
}
