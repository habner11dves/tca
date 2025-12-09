

import java.util.Scanner;

public class Cavaleiro {
    final static Scanner LER = new Scanner(System.in);
    final static NumeroInvalido invalido = new NumeroInvalido();
    final static CombateSamurai samuraiCombate = new CombateSamurai();
    final static CombateMago magoCombate = new CombateMago();
    final static CombateCavaleiro cavaleiroCombate = new CombateCavaleiro();
    final static CombateBarbaro barbaroCombate = new CombateBarbaro();
    final static Botoes botao = new Botoes();
    final static Vida personagemVida = new Vida();
    
    public static void main(String[] args, int player1) throws InterruptedException {
        int player2 = cavaleiroVs(); // Recebe o Personagem escolhido do player 2

        personagemVida.main(args, player1, player2); // Chama o main da class Vida
    }

    public static int cavaleiroVs() throws InterruptedException { // Metodo para escolher o personagem da CPU
        boolean confirmar = false;
        int player2;

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
            System.out.println("... Escolha O Personagem Do Player 2 ...");

            player2 = LER.nextInt();

            if (player2 > 0 && player2 < 5) {
                switch (player2) {
                    case 1:
                        limparTela();
                        samuraiCombate.samurai(); // Imprime a imagem do samurai
                        confirmar = confirmarEscolha(); // Chama o metodo confimar escolha
                        if (confirmar == true) {
                            limparTela();
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        limparTela();
                        magoCombate.mago(); // Imprime a imagem do mago
                        confirmar = confirmarEscolha(); // Chama o metodo confimar escolha
                        if (confirmar == true) {
                            limparTela();
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
        return player2;
    }

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
                cavaleiroVs();
            }
        }
    }

    public static void limparTela() { // Metodo para limpar o terminal
        for (int i = 0; i < 40; ++i) {
            System.out.println();
        }
        System.out.print("\033\143");

    }

    public static void cavaleiroCavaleiro() { // Metodo com a imagem do Cavaleiro VS Cavaleiro
        String[] cavaleiroCavaleiro = {
        "                     ▒███░                                                                    ░███▓                     \n" + //
        "                   ▓▓▓▒▓▓▓▓▓                                                                ▓▓▓▓▓▒▒▒▓                   \n" + //
        "                  ▓▒▓█████████             █░░▒                          ▓░░▓             ████████▓▓▒▓                  \n" + //
        "                  ▓▓▓███▓▒░▒░░░▓          █░░░█                          █░░░█          █░░░▒░▒▓▓███▓▓▓                 \n" + //
        "               ▒▒▓▓▓▓▒▓▓▒██▓▓▒▒░░░        █░░░█                           ▒░░█        ░░░░▓▒▓██▓▒▓▓█▓▓▓▒▒               \n" + //
        "                      ███▒▒▓▓▓▓▒███      █▓░░▓                            █░░▒█      ███▒▓▓▓▓▒▒▓██                      \n" + //
        "                      ███▓█▒▒▒█▒█▒█      █░░▒█                            █▓░░█      █▓█▒█▒▒▒█▓███                      \n" + //
        "                  ▒▒▒░░░░█▓▓▒▓█▒█▓░░▒   █░░░█                              █░░░█   ▒░░▓█░█▓▒▓▓█▒░░░▒▒▒                  \n" + //
        "                 █████▓░░▒████████▒░▒▓  ▒░░██                              ██░░▒  ▒░░░████████▓░░▓█████                 \n" + //
        "              ▒▒░░░░░░░███▒░░░░░░░███  █▒░▒█                                ██░▒█  ███▒░░░░░░▒███░░░░░░░▒▒              \n" + //
        "              ▓██▓█████░██▓▓▓▒▒▒▒██░░░▓▒▒▒██▓                              ▓██▒▒▒▓░░░██▓▒▒▒▓▓▓██░█████▓██▒              \n" + //
        "              ▒██▒▓▓▓▓█░████▓█▓████▒▒█▓▓█▓▒▒▒                              ▒▒▒▒█▓▒█▒▒████▓▓▓████░██▓▓▓▒██▒              \n" + //
        "              ▓██▓▓▒▒▓█░████████▒░████████                                    ████████░▒████████░█▓▒▒▓▓██▒              \n" + //
        "              ▒▒██▓▓▓██▓█▒██▒▓▓▓█▒▓██▓▓▒▒▒                                     ▒▒▓▓██▓▒█▓▓▓▒██▒██▓█▓▓▓██▒▒              \n" + //
        "               █▒░▓█▓░█▓░███▓▒▒███░░░▓                                            ▒░░░███▒▒▓███░▓█░▓██▒▒█               \n" + //
        "                 ▒██████▓███████▓▒███▓                                            ▒███▒▓███████▓██████▓                 \n" + //
        "                   ████▒▒▓     ▒█▒▒░▓▒                                            ▓▓▒▒▒█▒     ▓▒▒██▓█                   \n" + //
        "                  ▓█░░░▒█      ░▓█▒▒░░░█                                        ▓░░░▒▒█▓░      █▒░░░█▓                  \n" + //
        "                   ▓███                                                                            █▓                   \n"};

        for (int i = 0; i < cavaleiroCavaleiro.length; i++) {
            System.out.println(cavaleiroCavaleiro[i]);
        }
    }

    public static void cavaleiroSamurai() { // Metodo com a imagem do Cavaleiro VS Samurai
        String[] cavaleiroSamurai = {
        "                                                                            █                                           \n" +
        "                                                                          ░░░                                           \n" +
        "                                                                         █░▒▒                                           \n" +
        "                                                                         █░█▒     ▒░█             ▒░░▒                  \n" +
        "                                                                         █░█▒     █░░░█▒      ▒█░░░▓                    \n" +
        "                                                                         █░▓░      █░░▒▒     █▒░░▒█                     \n" +
        "                                                                          ░░▒      █░░██▓▓▓▒▓█▓░▒█                      \n" +
        "                     ▒███░                                                ▒░▓    ▒▓ ▒░▓█░░▓▓█▒░██ ▓                     \n" + //
        "                   ▓▓▓▒▓▓▓▓▓                                              ░░▒   █▒▒▒██▒▒▒▒▒▒░▒██▒▒▒▒                    \n" + //
        "                  ▓▒▓█████████             █░░▒                           █░░█  ▒▒▒▓▓▓▓▓▒▓▓████▓▒▓▒░▒                   \n" + //
        "                  ▓▓▓███▓▒░▒░░░▓          █░░░█                            ░░▓   █▓██▒▒█████░█▒█▒▒██                    \n" + //
        "               ▒▒▓▓▓▓▒▓▓▒██▓▓▒▒░░░        █░░░█                            █░░█  ▒▒██░░▒░░░▒▒▒▓██▓▒▒▒▒                  \n" + //
        "                      ███▒▒▓▓▓▓▒███      █▓░░▓                              ▒▓▓▒ ██ ███▓█▓███████▓▒▒▓                   \n" + //
        "                      ███▓█▒▒▒█▒█▒█      █░░▒█                            ▒▒▒███  ▒▒▒▒███▓███▓▒▒███                     \n" + //
        "                  ▒▒▒░░░░█▓▓▒▓█▒█▓░░▒   █░░░█                              █▒▒▒▒▓████▓▒▒▓▓▒▒██▒▓▒▒▓▓█ ▒░░░              \n" + //
        "                 █████▓░░▒████████▒░▒▓  ▒░░██                               ░▒▒█▓▒▒▒▓▒▒▒▒▒▒▒▓█▓█▓▒▒▓█░░░░█              \n" + //
        "              ▒▒░░░░░░░███▒░░░░░░░███  █▒░▒█                                  ▓█▓▓██▓▒▒▒▒▒▓█▓▓██▒▓▒██░░░░▒              \n" + //
        "              ▓██▓█████░██▓▓▓▒▒▒▒██░░░▓▒▒▒██▓                                 ▒▒▒  █▓█▓██████▓▓▒▒▒▓▒ ▓░░░░█             \n" + //
        "              ▒██▒▓▓▓▓█░████▓█▓████▒▒█▓▓█▓▒▒▒                                    ▓▓▓███████▓▓▓▒▒██   ▓░▒░░▒             \n" + //
        "              ▓██▓▓▒▒▓█░████████▒░████████                                     ▒▒▒▓▓▒▓▒▓▒▒██▒▓▓██▓▓▓░░░░▒▒█             \n" + //
        "              ▒▒██▓▓▓██▓█▒██▒▓▓▓█▒▓██▓▓▒▒▒                                     ▒▒▓▓▓▓▒▒▓█▓█▓█▓▒▒▒▒▒▒███▓██              \n" + //
        "               █▒░▓█▓░█▓░███▓▒▒███░░░▓                                         ▒▓▒▒▓█▓▒░░▒▓▒▒▓█▓▓█▓▒▒▒█▓▒░▒             \n" + //
        "                 ▒██████▓███████▓▒███▓                                          █▓▒▒▓█    ▓▓▓▒▓█▓▒█                     \n" + //
        "                   ████▒▒▓     ▒█▒▒░▓▒                                        ▒▒▒▓▓▓▓        ▒▓▓▓█▓                     \n" + //
        "                  ▓█░░░▒█      ░▓█▒▒░░░█                                     ▒░░▒▒▒▒          ▓▒▒▒▒▒                    \n" + //
        "                   ▓███                                                                        ▒▒▒▒▒                    \n"};

        for (int i = 0; i < cavaleiroSamurai.length; i++) {
            System.out.println(cavaleiroSamurai[i]);
        }
    }

    public static void cavaleiroMago() { // Metodo com a imagem do Cavaleiro VS Mago
        String[] cavaleiroMago = {
        "                                                                            ▒▒▒                                         \n" +
        "                                                                           ░▓▓▓▒                                        \n" +
        "                                                                          ░▓▓▒▒▓░                                       \n" +
        "                     ▒███░                                                ░▒▓▒▓▒                                        \n" + //
        "                   ▓▓▓▒▓▓▓▓▓                                               █████       ███████                          \n" + //
        "                  ▓▒▓█████████             █░░▒                           ▒░░░░░█    ▓▒▒▒▓▓▓▓▒▒▒█▓                      \n" + //
        "                  ▓▓▓███▓▒░▒░░░▓          █░░░█                          █▒█░███░█ █▓▓█████▓▓██▓▓▓▓▓                    \n" + //
        "               ▒▒▓▓▓▓▒▓▓▒██▓▓▒▒░░░        █░░░█                           ▓░░░░▓█ █▓▒▒▒▒▒▒▓██▓████▓▒█                   \n" + //
        "                      ███▒▒▓▓▓▓▒███      █▓░░▓                             ████████▓███████▓█▓▓▓██ ██                   \n" + //
        "                      ███▓█▒▒▒█▒█▒█      █░░▒█                              █▒▓██▓▒█▒▒████▒██▒▓▓█▓█                     \n" + //
        "                  ▒▒▒░░░░█▓▓▒▓█▒█▓░░▒   █░░░█                                █▒██▒███▒▓██▒▒███▓▓▓▓█                     \n" + //
        "                 █████▓░░▒████████▒░▒▓  ▒░░██                                █▒███▒██████████▒▓████                     \n" + //
        "              ▒▒░░░░░░░███▒░░░░░░░███  █▒░▒█                                  ██  █▓██████▓███▓▓███                     \n" + //
        "              ▓██▓█████░██▓▓▓▒▒▒▒██░░░▓▒▒▒██▓                               █▓▓█▓█▓██▓▓▓▓▓▓▓█████▓██                    \n" + //
        "              ▒██▒▓▓▓▓█░████▓█▓████▒▒█▓▓█▓▒▒▒                               █▒▒██▓█▓█▓██████▒██▓▓▓███                   \n" + //
        "              ▓██▓▓▒▒▓█░████████▒░████████                                   ▓███▓█▓██▓▒▒██████▓▓▓▓███                  \n" + //
        "              ▒▒██▓▓▓██▓█▒██▒▓▓▓█▒▓██▓▓▒▒▒                                    ▓▒█▓███▓▓█▓▒▓▓▓██▓▓▓▓▓▓█                  \n" + //
        "               █▒░▓█▓░█▓░███▓▒▒███░░░▓                                        █▓█▓██▓███████████▓███▓▓                  \n" + //
        "                 ▒██████▓███████▓▒███▓                                        ██████▓█▓▓▓▓▓▓▓▓██████                    \n" + //
        "                   ████▒▒▓     ▒█▒▒░▓▒                                        █▒▓█▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▒█                     \n" + //
        "                  ▓█░░░▒█      ░▓█▒▒░░░█                                       ██ ████████▓▓███████                     \n" + //
        "                   ▓███                                                          █▓▓▓█▓█▓   █▓▓▓▓▓▓                     \n"};

        for (int i = 0; i < cavaleiroMago.length; i++) {
            System.out.println(cavaleiroMago[i]);
        }
    }

    public static void cavaleiroBarbaro() { // Metodo com a imagem do Cavaleiro VS Barbaro
        String[] cavaleiroBarbaro = {
        "                                                                               ███               ███                    \n" +
        "                     ▒███░                                                    █▒▒█               ██▒▒▓█                 \n" + //
        "                   ▓▓▓▒▓▓▓▓▓                                                  █▒▒▒██ ██▓▒▒▒▒███ ██▒▒▒██                 \n" + //
        "                  ▓▒▓█████████             █░░▒                               ▓█▒▒▒▒█▓▒▒▒▒▓▓▓▓█▒▒▒▒▒█▓                  \n" + //
        "                  ▓▓▓███▓▒░▒░░░▓          █░░░█                                 ████▓▒█████████▒▒▒██                    \n" + //
        "               ▒▒▓▓▓▓▒▓▓▒██▓▓▒▒░░░        █░░░█                           █▓▒░░█  ████▓▒▒▓▓▓▓██████                     \n" + //
        "                      ███▒▒▓▓▓▓▒███      █▓░░▓                          ▓▒░░░░▒█  ██▒██▒▒▓██▒█▓▓▓████                   \n" + //
        "                      ███▓█▒▒▒█▒█▒█      █░░▒█                          █░░█▓▒█▓▒███▒░▓███▓░▒█▒▓███▒▒▒██▓               \n" + //
        "                  ▒▒▒░░░░█▓▓▒▓█▒█▓░░▒   █░░░█                           █░░█▓▓▒░░███▓█▓▓▓▓██▒████▒▒▒▒▓▓▓██              \n" + //
        "                 █████▓░░▒████████▒░▒▓  ▒░░██                           █░░█▓▓█████▓██▓▓▓▓▓███▓█▒▒▒█▓██▓██              \n" + //
        "              ▒▒░░░░░░░███▒░░░░░░░███  █▒░▒█                             █▒░▒██▒█ ██▒███████████████▒▒▒▒▒▓▓█            \n" + //
        "              ▓██▓█████░██▓▓▓▒▒▒▒██░░░▓▒▒▒██▓                              ███████▒▒▒▒█▒▒▒▒▒▒▓▓▒▓▓██▒▒▒▒▒▒██            \n" + //
        "              ▒██▒▓▓▓▓█░████▓█▓████▒▒█▓▓█▓▒▒▒                               █░░▒█░███▒██████████████████████            \n" + //
        "              ▓██▓▓▒▒▓█░████████▒░████████                                  █░▒▒█▒█▓█████▒▒█▒▓▓▒▓▓▓█░▒██████            \n" + //
        "              ▒▒██▓▓▓██▓█▒██▒▓▓▓█▒▓██▓▓▒▒▒                                  ██████████▓██████████████▒▒▒░▒▒█            \n" + //
        "               █▒░▓█▓░█▓░███▓▒▒███░░░▓                                        █▒▒███▓▓██▓▒▒▒▒▓██▓█████████              \n" + //
        "                 ▒██████▓███████▓▒███▓                                        ███████▓█████▓████▓▓▓████                 \n" + //
        "                   ████▒▒▓     ▒█▒▒░▓▒                                            ██████▓███   █████▓██                 \n" + //
        "                  ▓█░░░▒█      ░▓█▒▒░░░█                                         ▓▓▓▓▓▓███▓     ▓▓▓▓▓▓█                 \n" + //
        "                   ▓███                                                            ████▓▓        ▓███▓▓                 \n"};

        for (int i = 0; i < cavaleiroBarbaro.length; i++) {
            System.out.println(cavaleiroBarbaro[i]);
        }
     }
}