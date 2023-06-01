import java.util.Scanner;
public class Responsavel {
    
    String name;
    String telefone;
    String sexo;

    void exibirDados(){
        System.out.println("O nome do responsável pela casa é:"+ name);
        System.out.println("O telefone do resposável pela casa é:"+ telefone);
        System.out.println("O sexo do responsável pela casa é:"+ sexo);
    }

    void ler(){

        Scanner sc2 = new Scanner (System . in);

        System.out.println("Digite o nome do responsável pela casa:");
        name = sc2.next();

        System.out.println("Digite o número de celular do responsável pela casa:");
        telefone = sc2.next();

        System.out.println("Digite o sexo do responsável pela casa:");
        sexo = sc2.next();
    }

}
