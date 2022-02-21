package questao1;

import java.util.Scanner;

public class Quest1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //Aqui entram os  dados do tamanho da "escada"
        System.out.print("Digite o tamanho desejado da escada: ");
        int n = sc.nextInt();

        //Criado um var que guarda uma string de espaços, depois de uma array de char
        String espaco = new String(new char[n]).replace("\0", " ");
       
        for(int i = 1; i <= n; i++)
        {
            // Criando variavel asteristico, depois de uma array de char, que será melhorada pelo 'for'
            String asteristico = new String(new char[i]).replace("\0", "*");
            //Assim manipula a string espaço através da substring, e assim concatena com a var asteristico, assim temos o resultado esperado
            System.out.println(espaco.substring(0,espaco.length()-i) + asteristico);
        }
        
        sc.close();
    }
}