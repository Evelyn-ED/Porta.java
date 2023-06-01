public class Principal {
    public static void main(String[] args) {
        

        Casa casa = new Casa();
        casa.corCasa = "Verde";
        casa.num = "100";
        casa.portaDaFrente.cor = "Marrom";
        casa.portaDeFundo.cor = "Marrom";
        casa.responsavel.name = "Joanna";
        casa.responsavel.telefone = "52846388";

        Casa casa2_Primo = new Casa();
        casa2_Primo.corCasa = "Azul";
        casa2_Primo.num = "105A";
        casa2_Primo.portaDaFrente.cor = "Preta";
        casa2_Primo.portaDeFundo.cor = "Preta";
        casa2_Primo.responsavel.name = "Johanne";
        casa2_Primo.responsavel.telefone = "452864547";

        casa.pintarCasa();
        casa2_Primo.fecharCasa();
        casa.portaDaFrente.abrirPorta();
        casa2_Primo.fecharCasa();
        System.out.println("O meu número de telefone é:"+casa.responsavel.telefone);
        System.out.println("O número de telefone do meu primo é:"+casa2_Primo.responsavel.telefone);
        casa2_Primo.mudarResponsavel();


    }

    
}
