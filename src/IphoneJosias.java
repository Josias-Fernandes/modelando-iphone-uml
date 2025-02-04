import iphone.Iphone;
import iphone.interfaces.AparelhoTelefonico;
import iphone.interfaces.NavegadorNaInternet;
import iphone.interfaces.ReprodutorMusical;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class IphoneJosias {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        Iphone iphone15 = new Iphone();
        int opcaoSelecionada;
        System.out.println("Opções do menu do Iphone:");
        System.out.println(" 1 - iTunnes");
        System.out.println(" 2 - Telefone");
        System.out.println(" 3 - Internet");
        System.out.println(" 0 - Desligar o aparelho");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        opcaoSelecionada = scanner.nextInt();
        switch (opcaoSelecionada) {
            case 1:
                System.out.println("Musicas do iTunnes: ");
                ReprodutorMusical iTunnes = iphone15;
                iTunnes.selecionarMusica();
                break;
            case 2:
                AparelhoTelefonico telefone = iphone15;
                String contatos[] = {"Joana", "Fernanda", "Leo", "Selma", "Ryan", "Cida", "Maria"};
                System.out.println();
                System.out.println("Opções do menu Telefone: ");
                System.out.println(" 1 - Ligar");
                System.out.println(" 2 - Atender");
                System.out.println(" 3 - Correio de Voz");
                System.out.println();
                System.out.println("Digite a opção desejada do menu Telefone:");
                int opcaoSelecionadaTelefone = scanner.nextInt();
                if (opcaoSelecionadaTelefone == 1) {
                    System.out.println("Escolha um contato para ligar:");
                    for (int i = 0; i < contatos.length; i++) {
                        System.out.println(i+1 + " - " + contatos[i]);
                    }
                    int numeroOpcaoContato;
                    do{
                        System.out.print("Digite a opção do número do nome do contato para ligar: ");
                        scanner.nextLine();
                        numeroOpcaoContato = scanner.nextInt();
                    }while (numeroOpcaoContato<=0 ||numeroOpcaoContato>7);

                    String contato = null;
                    for (int i = 0; i <contatos.length;i++){
                        if ((numeroOpcaoContato -1) == i){
                            contato = contatos[i];
                        }
                    }

                    telefone.ligar(contato);
                } else if (opcaoSelecionadaTelefone == 2) {
                    telefone.atender();
                } else if (opcaoSelecionadaTelefone == 3) {
                    telefone.iniciarCorreioVoz();
                }
                break;

            case 3:
                NavegadorNaInternet firefox = iphone15;
                scanner.nextLine();
                System.out.println("Digite endereço da página para navegar: ");
                String nomeDaPagina = scanner.nextLine();
                firefox.exibirPagina(nomeDaPagina);
                break;

            case 0:
                System.out.println("Desligando !");
                return;

        }
        scanner.close();
    }
}