package prog_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
3. Leia e armazene num vetor de 10 posições o nome dos
alunos aprovados no processo seletivo para ADS em
2022. A seguir, leia um nome de entrada e verifique se
este aluno consta na listagem dos aprovados e mostre
sua classificação (ordem de aprovação, representada
pelo índice do vetor +1). Caso o nome informado não
exista na lista dos aprovados, mostre uma mensagem
‘Nome informado não consta na lista dos aprovados’.
*/

public class exe03 {
    public static void main(String []args) throws IOException{
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        String vetor[] = new String[1];
        for(int i = 0; i<vetor.length;i++){
            System.out.println("Digite o nome do aluno(a) "+(i+1)+": ");
            vetor[i] = e.readLine();
        }
        for(int i = 0; i<vetor.length;i++){
            System.out.println("Posição "+(i+1)+" ["+vetor[i]+"]");
        }
        System.out.print("Digite o nome que queira pesquisar: ");
        String nome = e.readLine();
        for(int i = 0; i<vetor.length;i++){
            if (nome.equals(vetor[i])){
                System.out.print("O aluno esta lista "+vetor[i]);
            }else{
                System.out.print("Nome informado não consta na lista dos aprovados");
            }
        }
    }
}