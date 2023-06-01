import java.util.Scanner;
public class Casa {
    
    String corCasa ;
    String num;
    Porta portaDaFrente = new Porta();
    Porta portaDeFundo = new Porta();
    Responsavel responsavel = new Responsavel();

    Scanner sc3 = new Scanner (System . in);


    void estaAberta(){
        if(portaDaFrente.estado && portaDeFundo.estado == true);
        System.out.println("As portas da casa estão abertas");
    }

    void pintarCasa(){
        System.out.println("Qual a cor que você deseja pintar a sua casa?");
        corCasa = sc3.next();
        System.out.println("Sua casa foi pintada de "+corCasa+"");
        }

    void fecharCasa(){
        if(portaDaFrente.estado && portaDeFundo.estado == true);
            portaDaFrente.fecharPorta();
            portaDeFundo.fecharPorta();
            System.out.println("As portas da casa estão fechadas");
        }

    void exibirResponsavel(){
        System.out.println("O nome do responsável desta casa é:" + responsavel.name);
    }

    void exibirDados(){
        System.out.println("A cor da sua casa é:"+corCasa);
        System.out.println("O número da sua casa é:"+num);
    }

    void mudarResponsavel(){
        System.out.println("Qual o novo nome do responsável pela casa:");
        responsavel.name = sc3.nextLine();
        System.out.println("O novo nome do responsável agora é:"+responsavel.name);
    }

}

