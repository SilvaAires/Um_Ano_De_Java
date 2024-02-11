package Formatação_de_variaveis;

public class exe01 {
    public static void main(String []args){
        /*
        charAt (int indice), retorna um char;
        length(), retorna um intriro;
        equals (String s2), retorna um boolean;
        equalsIgnoreCase (String s2), retorna boolean;
        startsWith (String inicio), retorna boolean;
        endsWith (String fim), retorna boolean;
        indexOf (String texto), retorna um inteiro;
        lastIndexOf (String texto), retorna um inteiro;
        substring (int indice, int qtd), retorna uma String;
        replace (String orig, String subst), retorna uma String;
        trim(), retorna uma String;
        toUpperCase(), retorna uma String;
        toLowerCase(), retorna uma String;
        split (String divisor), retorna um String[];
        */
        System.out.println("charAt(int indice): retorna o “char” que está presente no índice informado.");
        System.out.println();
        String nome = "Thiago Ryan";
        System.out.println("O char é: " + nome.charAt(4));
        
        System.out.println();
        System.out.println("length(): retorna um inteiro indicando a quantidade de caracteres da String.");
        System.out.println();
        System.out.println("O tamanho é: " + nome.length());
        
        System.out.println();
        System.out.println("equals(String texto): retorna um booleano como resultado da comparação.");
        System.out.println();
        String nome1 = "Thiago";
        String sobre = "Ryan";
        System.out.println("O nome é igual: " + nome1.equals("Ryan"));
        if (sobre.equals("Ryan")){
            System.out.println("Ta certo");
        }
        
        System.out.println();
        System.out.println("equalsIgnoreCase(String texto): retorna um booleano como resultado da comparação. Ignora maiúsculas e minúsculas!");
        System.out.println();
        System.out.println("O nome é igual: " + nome.equals("gustavo"));
        System.out.println("O nome é igual: " + nome.equalsIgnoreCase("THIAGO"));

        System.out.println();
        System.out.println("startsWith(String texto): retorna um booleano (true) se a String iniciar como conteúdo de texto.");
        System.out.println();
        System.out.println("O nome inicia com Th: " + nome.startsWith("Th"));
        System.out.println("O nome inicia com an: " + nome.startsWith("an"));

        System.out.println();
        System.out.println("endsWith(String texto): retorna um booleano (true) se a String finalizar com o conteúdo de texto.");
        System.out.println();
        System.out.println("O nome finaliza com an: " + nome.endsWith("an"));
        System.out.println("O nome finaliza com am: " + nome.endsWith("am"));
        
        System.out.println();
        System.out.println("indexOf(String texto): retorna um inteiro com o número do índice que o conteúdo de texto está na String.");
        System.out.println();
        System.out.println("O indice que Thiago esta: " + nome.indexOf("Thiago"));
        System.out.println("O indice que ryan esta: " + nome.indexOf("Ryan"));
        
        System.out.println();
        System.out.println("lastIndexOf(String texto): retorna um inteiro com o número do último índice que o conteúdo de texto está na String.");
        System.out.println();
        String texto = "Thiago ryan e tecnico em agri ryan";
        System.out.println("O ultimo indice que ryan estal: " + texto.lastIndexOf("ryan"));
        
        System.out.println();
        System.out.println("substring(int inicio, int quantidade): retorna uma String (parte da original) como conteúdo a partir do índice de  inicio até a quantidade de caracteres.");
        System.out.println();
        System.out.println("O trecho selecionado foi: " + texto.substring(0,6));
        System.out.println("O trecho selecionado foi: " + texto.substring(12));
    
        System.out.println();
        System.out.println("replace(String texto, String subst): retorna uma String substituindo o conteúdo presente em texto pelo conteúdo de subst.");
        System.out.println();
        String ad = "#thiago#Ryan#";
        System.out.println("O trecho substituido foi: " + ad.replace("#", " "));
        
        System.out.println();
        System.out.println("trim(): retorna uma String removendo todos os espaços em branco antes e depois da String original.");
        System.out.println();
        String adc = "           thiago Ryan                ";
        System.out.println("Tamanho original: " +adc.length());
        adc = adc.trim();
        System.out.println("Tamanho com trim: " +adc.length()+ "\nEla editada: " + adc);
        
        System.out.println();
        System.out.println("•toUpperCase(): retorna uma String alterando todos os caracteres para maiúsculos. •toLowerCase(): retorna uma String alterando todos os caracteres para minúsculos.");
        System.out.println();
        String add = "Thiago Ryan";
        System.out.println("Maiusculo: " + add.toUpperCase());
        System.out.println("Minusculo: " + add.toLowerCase());
        
        System.out.println();
        System.out.println("split(String marcador): retorna um Vetor de Strings (String[]) separando cada String entre os marcadores encontrados na String original.");
        System.out.println();
        String addc = "Thiago Ryan iffar svs";
        String vetor [] = addc.split(" ");
        System.out.println("Tamanho do vetor: " + vetor.length);
        for (String parte : vetor){
            System.out.println(parte+" "); 
        }
        String nstring = "";
        for (String parte : vetor){
            nstring +=parte + "#"; 
        }
        System.out.println("\nNova String: "+nstring);
        
        System.out.println("\n");
        double n = 5.2;
        double n1 = 5.8;
        System.out.println("Maximo: "+Math.max(n, n1));
        System.out.println("Minimo: "+Math.min(n, n1));
        System.out.println("\n");
        
        String x = "3";
        int y = Integer.parseInt(x);
        
        String xx = "3,55";
        double yy = Double.parseDouble(xx);
        
        int r = 3;
        String kk = String.valueOf(r);
        
        double rr = 3;
        String kkk = String.valueOf(r);
        
        //* CONVERTE CHAR EM STRING !!!!
        char[] a = {'m','n','x'};
        String b = String.copyValueOf(a);
        System.out.println(b);
        System.out.println("\nVetor");
        for (int i = 0; i<3; i++ ){
            System.out.println("["+a[i]+"]");
        }
        
       
        
    }
}
