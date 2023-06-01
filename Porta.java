import java.util.Scanner;

public class Porta{

    // Atributos
    
    String cor;
    float largura;
    float altura;
    boolean estado;

    // Métodos

    void abrirPorta(){
        estado = true ;
            System.out.println("A porta está aberta! Pode entrar!");
        }

    void fecharPorta(){
        estado = false;
            System.out.println("A porta está fechada");
        }

    void ler(){

        Scanner sc = new Scanner (System . in);

        System.out.println("Digite a cor da sua porta:");
        cor = sc.next();

        System.out.println("Qual a largura da sua porta?");
        largura = sc.nextFloat();

        System.out.println("Qual a altura da sua porta?");
        altura = sc.nextFloat();

        if(estado == true){
            System.out.println("A porta está aberta! Pode entrar!");

        }else{
            System.out.println("A porta está fechada!");
        }

    }

}
