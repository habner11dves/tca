
import java.util.Scanner;

public class TCA {
    final static Scanner LER = new Scanner(System.in);
    final static NumeroInvalido invalido = new NumeroInvalido();
    final static CombateSamurai samuraiCombate = new CombateSamurai();
    final static CombateMago magoCombate = new CombateMago();
    final static CombateCavaleiro cavaleiroCombate = new CombateCavaleiro();
    final static CombateBarbaro barbaroCombate = new CombateBarbaro();
    final static Historia modoHis = new Historia();

    public static boolean confirmarEscolha() throws InterruptedException{ // Metodo para confimar a escolha
        int confirmar;

        while (true) {
            System.out.println("... 1 - Confirmar ...");
            System.out.println("... 2 - Cancelar ...");

            confirmar = LER.nextInt();
            if (confirmar == 1) {
                return true;
            } else if (confirmar == 2) {
                 return false;
            } else {
                invalido.invalidarNumero();
                Thread.sleep(1000);
                limparTela();
                escolherPersonagemP1();
            }
        }
    }

    public static void escolherPersonagemP1() throws InterruptedException { // Metodo para escolher o personagem do player 1
        boolean confirmar = false;
        int player1;

        while (true) {
            limparTela();
            samuraiCombate.samurai(); // Imprime a imagem do samurai
            Thread.sleep(1500);
            magoCombate.mago(); // Imprime a imagem do mago
            Thread.sleep(1500);
            cavaleiroCombate.cavaleiro(); // Imprime a imagem do cavaleiro
            Thread.sleep(1500);
            barbaroCombate.barbaro(); // Imprime a imagem do barbaro
            Thread.sleep(1500);
            System.out.println("... Escolha O Personagem Do Player 1 ...");

            player1 = LER.nextInt();

            if (player1 > 0 && player1 < 5) {
                switch (player1) {
                    case 1:
                        limparTela();
                        samuraiCombate.samurai(); // Imprime a imagem do samurai
                        confirmar = confirmarEscolha(); // Chama o metodo confimar escolha
                        if (confirmar == true) {
                            limparTela();
                            Samurai samurai = new Samurai();
                            samurai.main(null, player1); // Chama o main da class Samurai
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        limparTela();
                        magoCombate.mago(); // Imprime a imagem do mago
                        confirmar = confirmarEscolha();  // Chama o metodo confimar escolha
                        if (confirmar == true) {
                            limparTela();
                            Mago mago = new Mago();
                            mago.main(null, player1); // Chama o main da class Mago
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        limparTela();
                        cavaleiroCombate.cavaleiro(); // Imprime a imagem do cavaleiro
                        confirmar = confirmarEscolha(); // Chama o metodo confimar escolha
                        if (confirmar == true) {
                            limparTela();
                            Cavaleiro cavaleiro = new Cavaleiro();
                            cavaleiro.main(null, player1); // Chama o main da class Cavaleiro
                            break;
                        } else {
                        continue;
                        }
                    case 4:
                        limparTela();
                        barbaroCombate.barbaro(); // Imprime a imagem do barbaro
                        confirmar = confirmarEscolha(); // Chama o metodo confimar escolha
                        if (confirmar == true) {
                            limparTela();
                            Barbaro barbaro = new Barbaro();
                            barbaro.main(null, player1); // Chama o main da class Barbaro
                            break;
                        } else {
                            continue;
                        }
                }
            } else {
                invalido.invalidarNumero();
                Thread.sleep(1000);
                limparTela();
                continue;
            }
            break;
        }
        System.out.println("... O Modo Combate Chegou Ao Fim! ...");        
    }

    public static void jogar() throws InterruptedException { // Metodo para imprimir a tela com os botões modo historia e modo batalha amistosa
        int modoJogo;

        while (true) {
            System.out.println(
                "\t\t\t\t\t\t ██╗              ███╗   ███╗ ██████╗ ██████╗  ██████╗  \n" + //
                "\t\t\t\t\t\t███║              ████╗ ████║██╔═══██╗██╔══██╗██╔═══██╗ \n" + //
                "\t\t\t\t\t\t╚██║    █████╗    ██╔████╔██║██║   ██║██║  ██║██║   ██║ \n" + //
                "\t\t\t\t\t\t ██║    ╚════╝    ██║╚██╔╝██║██║   ██║██║  ██║██║   ██║ \n" + //
                "\t\t\t\t\t\t ██║              ██║ ╚═╝ ██║╚██████╔╝██████╔╝╚██████╔╝ \n" + //
                "\t\t\t\t\t\t ╚═╝              ╚═╝     ╚═╝ ╚═════╝ ╚═════╝  ╚═════╝  \n" + //
                "                                                                    \n" + //
                "\t\t\t\t\t\t██╗  ██╗██╗███████╗████████╗ ██████╗ ██████╗ ██╗ █████╗ \n" + //
                "\t\t\t\t\t\t██║  ██║██║██╔════╝╚══██╔══╝██╔═══██╗██╔══██╗██║██╔══██╗\n" + //
                "\t\t\t\t\t\t███████║██║███████╗   ██║   ██║   ██║██████╔╝██║███████║\n" + //
                "\t\t\t\t\t\t██╔══██║██║╚════██║   ██║   ██║   ██║██╔══██╗██║██╔══██║\n" + //
                "\t\t\t\t\t\t██║  ██║██║███████║   ██║   ╚██████╔╝██║  ██║██║██║  ██║\n" + //
                "\t\t\t\t\t\t╚═╝  ╚═╝╚═╝╚══════╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚═╝╚═╝  ╚═╝");

            System.out.println(
                "\t\t\t\t\t\t██████╗               ██████╗  █████╗ ████████╗ █████╗ ██╗     ██╗  ██╗ █████╗ \n" + //
                "\t\t\t\t\t\t╚════██╗              ██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗██║     ██║  ██║██╔══██╗\n" + //
                "\t\t\t\t\t\t █████╔╝    █████╗    ██████╔╝███████║   ██║   ███████║██║     ███████║███████║\n" + //
                "\t\t\t\t\t\t██╔═══╝     ╚════╝    ██╔══██╗██╔══██║   ██║   ██╔══██║██║     ██╔══██║██╔══██║\n" + //
                "\t\t\t\t\t\t███████╗              ██████╔╝██║  ██║   ██║   ██║  ██║███████╗██║  ██║██║  ██║\n" + //
                "\t\t\t\t\t\t╚══════╝              ╚═════╝ ╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝\n" +
                "                                                                                           \n" + //
                "\t\t\t\t\t\t █████╗ ███╗   ███╗██╗███████╗████████╗ ██████╗ ███████╗ █████╗                \n" + //
                "\t\t\t\t\t\t██╔══██╗████╗ ████║██║██╔════╝╚══██╔══╝██╔═══██╗██╔════╝██╔══██╗               \n" + //
                "\t\t\t\t\t\t███████║██╔████╔██║██║███████╗   ██║   ██║   ██║███████╗███████║               \n" + //
                "\t\t\t\t\t\t██╔══██║██║╚██╔╝██║██║╚════██║   ██║   ██║   ██║╚════██║██╔══██║               \n" + //
                "\t\t\t\t\t\t██║  ██║██║ ╚═╝ ██║██║███████║   ██║   ╚██████╔╝███████║██║  ██║               \n" + //
                "\t\t\t\t\t\t╚═╝  ╚═╝╚═╝     ╚═╝╚═╝╚══════╝   ╚═╝    ╚═════╝ ╚══════╝╚═╝  ╚═╝               ");

            System.out.println(
                "\t\t\t\t\t\t██████╗               ██╗   ██╗ ██████╗ ██╗  ████████╗ █████╗ ██████╗ \n" + //
                "\t\t\t\t\t\t╚════██╗              ██║   ██║██╔═══██╗██║  ╚══██╔══╝██╔══██╗██╔══██╗\n" + //
                "\t\t\t\t\t\t █████╔╝    █████╗    ██║   ██║██║   ██║██║     ██║   ███████║██████╔╝\n" + //
                "\t\t\t\t\t\t ╚═══██╗    ╚════╝    ╚██╗ ██╔╝██║   ██║██║     ██║   ██╔══██║██╔══██╗\n" + //
                "\t\t\t\t\t\t██████╔╝               ╚████╔╝ ╚██████╔╝███████╗██║   ██║  ██║██║  ██║\n" + //
                "\t\t\t\t\t\t╚═════╝                 ╚═══╝   ╚═════╝ ╚══════╝╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝");

            modoJogo = LER.nextInt();

            if (modoJogo == 1) {
                Historia.main(null);
                break;
            } else if (modoJogo == 2) {
                limparTela();
                escolherPersonagemP1();
                break;
            } else if (modoJogo == 3) {
                limparTela();
                jogarAjuda();
            } else {
                invalido.invalidarNumero();
                Thread.sleep(1000);
                limparTela();
            }
        }
    }

   

    public static void jogarAjuda() throws InterruptedException { // Metodo para imprimir a tela com os botões jogar e ajuda
        int iniciar;

        while (true) {
            System.out.println(
                "\t\t\t\t\t\t ██╗                   ██╗ ██████╗  ██████╗  █████╗ ██████╗ \n" + //
                "\t\t\t\t\t\t███║                   ██║██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗\n" + //
                "\t\t\t\t\t\t╚██║    █████╗         ██║██║   ██║██║  ███╗███████║██████╔╝\n" + //
                "\t\t\t\t\t\t ██║    ╚════╝    ██   ██║██║   ██║██║   ██║██╔══██║██╔══██╗\n" + //
                "\t\t\t\t\t\t ██║              ╚█████╔╝╚██████╔╝╚██████╔╝██║  ██║██║  ██║\n" + //
                "\t\t\t\t\t\t ╚═╝               ╚════╝  ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝");

            iniciar = LER.nextInt();

            if (iniciar == 1) {
                limparTela();
                jogar();
                break;
            } else {
                invalido.invalidarNumero();
                Thread.sleep(1000);
                limparTela();
            }
        }
    }

    public static void limparTela() { // Metodo para limpar o terminal
        for (int i = 0; i < 40; ++i) {
            System.out.println();
        }
        System.out.print("\033\143");
    }
    public static void main(String[] args) throws InterruptedException {
        limparTela();
        Tela1 primeiraTela = new Tela1(); 
        primeiraTela.telaInicial(); // Chama a class Tela1
        Thread.sleep(3500);
        limparTela();
        jogarAjuda();
    }
}