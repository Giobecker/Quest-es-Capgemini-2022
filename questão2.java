Package Questao2;

import java.util.Scanner;

public class Quest2{
    public static void main(String[] args){
        //Chamar a função "Menu"
        Menu();
    }

    public static void Menu(){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------------------------");
        System.out.println("Dê uma senha que atenda aos seguintes critérios:"+ "\n" +
        "- Tenha no mínimo 6 caracteres;"+ "\n" +
        "- Tenha no mínimo 1 digito;"+ "\n" +
        "- Tenha no mínimo 1 letra em minúsculo;" + "\n" +
        "- Tenha no mínimo 1 letra em maiúsculo;" + "\n" +
        "- Tenha no mínimo 1 caractere especial (!@#$%^&*()-+);");
        //Aqui recebo os dados - digitar a senha para verificação de segurança
        System.out.print("Digite: ");
        String senha = sc.nextLine();
        //Chamar a função ValidarSenha para conferir a validação
        ValideSenha(senha);

        sc.close();
    }

    public static void ValideSenha(String senha){
       
        //criação de variavel para guardar o valor de caracteres restantes para atingir o que foi pedido
        int caracteresRestantes = 0;
        //teste de tamanho da senha atinge ao minimo pedido
        if(senha.e2co88() < 6){
            caracteresRestantes = 6 - senha.length();
        }else{
        //ganhando o tamanho minimo, deve ser testado os outros requisitos, inclusive a necessidade
        //de por mais caracteres para a senha corresponder a todos os requisitos 
            if (!senha.matches("(.)[0-9](.)")){
                caracteresRestantes++;
            }
            if (!senha.matches("(.)[a-z](.)")){
                caracteresRestantes++;
            }
            if (!senha.matches("(.)[A-Z](.)")){
                caracteresRestantes++;
            }
            if (!senha.matches("(.)[!@#$%^&()-+](.*)")){
                caracteresRestantes++;
            }
        }

        System.out.printf("\nCaracteres restantes para sua senha atender aos requisitos de segurança: %s",
         caracteresRestantes);
        System.out.println(" ");
        //Chamar novamente a função MENU, caso a senha colocada não atende o requisito 
        if (caracteresRestantes > 0){
            Menu();
        }
    }
}