

public class CombateSamurai {
    public static final String VERMELHO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARELO = "\u001B[33m";
    public static final String RESET = "\u001B[0m";
    static int vidaMax1 = 1000;
    static int vidaAtual1 = 1000;

    static int vidaMax2 = 1000;
    static int vidaAtual2 = 1000; 

    void samurai() { // Imagem do samurai
        String[] appeh = {
            "\t    ▄█   ▄▄   ▄▀█ █▀█ █▀█ █▀▀ █░█\n" + //
            "\t    ░█   ░░   █▀█ █▀▀ █▀▀ ██▄ █▀█\n\n" +
            "                                           ██               \n" + //
            "                                           ░░░              \n" + //
            "                                           ▒▒░█             \n" + //
            "                  ▒▒░▒█            █░░     ▓█░█             \n" + //
            "                    ▓░░░█▒      ▒█░░░█     ▒█░█             \n" + //
            "                     █▒░░▒█     ▓▒▒░█      ░▓░█             \n" + //
            "                      █▒░▓█▒▒▒▓▓██▒░█      ▒░░              \n" + //
            "                     ▓ ██░▒█▓▓░░█▓░▒ ▓▒    █░░              \n" + //
            "                    ▒▒▒▒██▒░▒▒▒▒▒▒██▒▒▒█   ▒░░              \n" + //
            "                   ▒░▒▓▒▓████▓▓▒▓▓▓▓█▒▒░  █░░█              \n" + //
            "                    ██▓▒█▒▓▒█████▒░██▒█   ▓░░               \n" + //
            "                  ▒▒▒▒▓██▓▒▒▒░░░▒▒░▓▓▒▒  █░░█               \n" + //
            "                   ▓▒▒▒███████▓█▓███ ██ ▒▓▓▒                \n" + //
            "                     ███▒▒▓███▓███▒▒▒▒  ███▓▒▒              \n" + //
            "              ░░░░ █▓▓▒▒▓▒██▒▒▓▓▒▒▓████▓▒▒▒▒█               \n" + //
            "              █▒░░░█▓▒▒▓█▓█▓▒▒▒▒▒▒▒▓▒▒▒▓█▓▒▒                \n" + //
            "              ▒░░░░█▓▒▓▒██▓▓█▓▒▒▒▒▒▓█▓▒▓█▓▓                 \n" + //
            "             █░░▒░█ ▓▓▒▒▒▓▓██████▓█▓▓  ▒░▒                  \n" + //
            "             ▒░░▒░▓   ██▒▒▓▓▓███████▒▒▒                     \n" + //
            "             █▒▒░░░░▓▓▓██▓▓▒██▒▒▓▒▓▒▓█▒▒▒                   \n" + //
            "              ██▓███▒▒▒▒▒▒▓█▓█▓█▓▒▒▓▓▓▓▒▒                   \n" + //
            "             ▒░▒▓█▒▒▒▓█▓▓█▓▒▒▓▒░░▒▒█▓▒▒▒▒                   \n" + //
            "                      ▒▓█▓▒▒▓▓    █▓▒▒▓█                    \n" + //
            "                     ██▓▓▓▓         ▓▓▓▒▒▒                  \n" + //
            "                    ▒▒▒▒▒▓          ▒▓▒▒░░▒                 \n" + //
            "                    ▒▒▒▒▒                                   \n"};

        for (int i = 0; i < appeh.length; i++) {
            System.out.println(appeh[i]);
        }
    }

    public static int mostrarBarraP1() { // Metodo para mostrar a barra de vida quando o samurai for o player 1
        if (vidaAtual1 < 0) {
            vidaAtual1 = 0;
        } else if (vidaAtual1 >= vidaMax1) {
            vidaAtual1 = 1000;
        }
        int tamanhoBarra = 80;
        int preenchimento = (vidaAtual1 * tamanhoBarra) /vidaMax1;

        String cor;
        double porcentagemVida = (double) vidaAtual1 / vidaMax1;

        if (porcentagemVida >= 0.8) {
            cor = VERDE;
        } else if (porcentagemVida >= 0.4) {
            cor =AMARELO;
        } else {
            cor = VERMELHO;
        }

        System.out.print("Player 1:\tHP: [");

        for (int i = 0; i < tamanhoBarra; i++) {
            if (i < preenchimento) {
                System.out.print(cor + "█" + RESET);
            } else {
                System.out.print(" ");
            }
        }
        System.out.printf("] %d/%d\n", vidaAtual1, vidaMax1);

        return vidaAtual1;
    }

    public static int mostrarBarraP2() { // Metodo para mostrar a barra de vida quando o samurai for o player 2
        if (vidaAtual2 <= 0) {
            vidaAtual2 = 0;
        }
        int tamanhoBarra = 80;
        int preenchimento = (vidaAtual2 * tamanhoBarra) /vidaMax2;

        String cor;
        double porcentagemVida = (double) vidaAtual2 / vidaMax2;

        if (porcentagemVida >= 0.8) {
            cor = VERDE;
        } else if (porcentagemVida >= 0.4) {
            cor =AMARELO;
        } else {
            cor = VERMELHO;
        }

        System.out.print("Player 2:\tHP: [");

        for (int i = 0; i < tamanhoBarra; i++) {
            if (i < preenchimento) {
                System.out.print(cor + "█" + RESET);
            } else {
                System.out.print(" ");
            }
        }
        System.out.printf("] %d/%d\n", vidaAtual2, vidaMax2);

        return vidaAtual2;
    }

    public static void darDanoP2(int dano) { // Metodo para aplicar dano no player 2
        vidaAtual2 -= dano;

        mostrarBarraP2();
    }

    public static void darDanoP1(int danoP1) {
        vidaAtual1 -= danoP1;

        mostrarBarraP1();
    }

    public static void curarVidaP1() throws InterruptedException {
        vidaAtual1 += 230;

        mostrarBarraP1();
    }
}