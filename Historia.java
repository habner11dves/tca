
import java.util.Random;
import java.util.Scanner;

public class Historia {

    final static Scanner LER = new Scanner(System.in);
    final static char PERSONAGEM = '⛨';
    final static char MAGO = 'M';
    final static char CAVALEIRO = 'C';
    final static char BARBARO = 'B';
    static String letrasColetadas = "";
    static int qtdOcoletado = 0;

    public static void main(String[] args) throws InterruptedException {
        modoHistoria();
    }

    // MENU PRINCIPAL
    public static int modoHistoria() throws InterruptedException {
        animacaoChamas();
        introPyra();

        setCor256(46);
        System.out.println(" APÓS A LEITURA DAS INSTRUCÕES DIGITE:\n 1 - CONTINUAR\n 2 - PARA VOLTAR AO MENU PRINCIPAL!");
        resetColor();
        int continuarOuMenu = LER.nextInt();
        LER.nextLine();

        while (true) {

            if (continuarOuMenu == 1) {
                limparTela();

                char[][] mapa = mapareinoPyra(letrasColetadas);
                movimentarPersonagemPyra(mapa);
                return 1;
            } else {
                System.out.println("Número ÍNVALIDO!\n Digite novamente: ");

            }

        }

    }

// [ INTRODUÇÃO DOS MAPAS ]
    // METODO EMPRESTADO (ANIMAÇÃO CHAMAS) UTILIZADO NA INTRODUÇÃO DO REINO DE PYRA NO MODO HISTORIA 
    public static void animacaoChamas() throws InterruptedException {
        String[] quadros = {
            "        (  .      )\n"
            + "      )     )        (     \n"
            + "         )   (    )     *\n"
            + "   (    )\\ )  )\\ ) (      \n"
            + "   )\\  (()/( (()/( )\\  (  \n"
            + " (((_)  /(_)) /(_)((_) )\\ \n",
            "        (   )   .   )\n"
            + "    (      )       (     *\n"
            + "       *   (    )       )\n"
            + "   (    )\\ ) (   )\\ )    \n"
            + "   )\\  (()/(  )\\ (()/( ( \n"
            + " (((_)  /(_)((( ) /(_)) )\\\n",
            "         .   (    .   )\n"
            + "   *  )      )      (      \n"
            + "      (    *   (     )\n"
            + "   (  )\\ ) )\\ )  ( (   \n"
            + "   )\\ (()/( (()/( )\\ )\\ \n"
            + " (((_) /(_)) /(_)((_) ((_) \n"
        };

        for (int i = 0; i < 12; i++) {
            limparTela();
            setCor256(196); // Vermelho fogo
            System.out.println(quadros[i % quadros.length]);
            resetColor();
            Thread.sleep(120);
        }

    }

    public static void introPyra() throws InterruptedException {
        limparTela();
        System.out.println();

        // Vermelho forte do fogo
        setCor256(196);
        System.out.println("██████╗ ██╗   ██╗██████╗  █████╗ ");
        System.out.println("██╔══██╗██║   ██║██╔══██╗██╔══██╗");
        System.out.println("██████╔╝██║   ██║██████╔╝███████║");
        System.out.println("██╔══   ╚██████═╝██╔══██╗██╔══██║");
        System.out.println("██║        ██║   ██║  ██║██║  ██║");
        System.out.println("╚═╝      ╚════╝  ╚═╝  ╚═╝╚═╝  ╚═╝                              ");
        System.out.println("                                   ");

        resetColor();
        Thread.sleep(600);

        // Laranja quente
        setCor256(202);
        System.out.println("\n🔥 Você chegou ao Reino de PYRA 🔥");
        resetColor();
        Thread.sleep(100);

        // Narrativa
        setCor256(208);
        System.out.println("O PRIMEIRO REINO, onde o fogo nunca se apaga...");
        Thread.sleep(900);
        System.out.println("Montanhas ardentes iluminam o céu vermelho...");
        Thread.sleep(900);
        System.out.println("E apenas os guerreiros pacientes resistem ao calor eterno.\n");
        Thread.sleep(900);
        System.out.println(
                "Agora que você está no Reino de PYRA, pequeno padawan,\n"
                + "deverá passar por um desafio que provará se você é digno de controlar a chama eterna:\n"
                + "a temida CHAMA PURIFICADORA!");
        Thread.sleep(600);

        resetColor();

        setCor256(226);
        System.out.println("🔥 DESAFIO DO REINO DE PYRA 🔥\n");
        Thread.sleep(200);
        resetColor();
        setCor256(220);
        System.out.println("Uma PALAVRA SECRETA protege o portal deste reino.\n");
        Thread.sleep(100);
        System.out.println("Ela é formada por 4 LETRAS escondidas pelo mapa.\n");
        Thread.sleep(200);
        System.out.println(" A cada 20 segundos, uma letra surgirá em algum ponto do reino.\n");
        Thread.sleep(200);
        System.out.println(" Para coletá-la, você deve ir ATÉ O LOCAL onde ela apareceu.\n");
        Thread.sleep(200);
        System.out.println("Ao ENCOSTAR NELA, a letra será registrada automaticamente.\n");
        Thread.sleep(200);
        System.out.println("📜 As letras coletadas serão exibidas no CANTO ESQUERDO da tela.\n");
        Thread.sleep(200);
        System.out.println(" Quando tiver as 4 letras, você deverá DECIFRAR a palavra que elas formam.\n");
        Thread.sleep(200);
        System.out.println(" Após descobrir a palavra, vá até o PORTAL e digite sua resposta.\n");
        Thread.sleep(200);
        System.out.println("Se estiver correta, o caminho até o Guardião do Fogo será liberado.\n");
        Thread.sleep(200);
        System.out.println("Prepare-se, guerreiro, e com você SAMURAI. O verdadeiro teste aqui é sua PACIÊNCIA!.\n");
        resetColor();
        Thread.sleep(900);

    }

    // METODO EMPRESTADO (ANIMAÇÃO DO REINO DE AQUALIS)
    public static void animacaoOndas() throws InterruptedException {
        String[] quadros = {
            "      ~     ~~        ~\n"
            + "   ~~      ~    ~~      ~\n"
            + "      ~~   ~   ~~   ~\n"
            + "  ~~~    ~~~~     ~~\n",
            "   ~   ~~~      ~~\n"
            + "      ~     ~~     ~~\n"
            + "  ~~   ~~~~    ~\n"
            + "    ~~     ~~~\n",
            " ~~       ~     ~~\n"
            + "   ~~    ~~~~      ~\n"
            + "     ~    ~~   ~~~\n"
            + "  ~~~      ~~~~\n"
        };

        for (int i = 0; i < 10; i++) {
            limparTela();
            setCor256(38); // Azul oceânico
            System.out.println(quadros[i % quadros.length]);
            resetColor();
            Thread.sleep(130);
        }
    }

    // METODO EMPRESTADO, TAMBÉM METODO DE INTRO DO REINO DE AQUALIS
    public static void introAqualis() throws InterruptedException {
        limparTela();

        animacaoOndas();
        Thread.sleep(300);

        // ASCII ART AQUALIS
        setCor256(39);
        System.out.println(" █████╗  ██████╗ ██╗   ██╗ █████╗ ██╗     ██╗███████╗");
        System.out.println("██╔══██╗██╔════╝ ██║   ██║██╔══██╗██║     ██║██╔════╝");
        System.out.println("███████║██║  ███╗██║   ██║███████║██║     ██║█████╗  ");
        System.out.println("██╔══██║██║   ██║██║   ██║██╔══██║██║     ██║██╔══╝  ");
        System.out.println("██║  ██║╚██████╔╝╚██████╔╝██║  ██║███████╗██║███████╗");
        System.out.println("╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝╚══════╝");
        resetColor();
        Thread.sleep(1200);

        // Título
        setCor256(45);
        System.out.println("\n🌊 Você chegou ao Reino de AQUALIS 🌊");
        resetColor();
        Thread.sleep(400);

        // Narrativa
        setCor256(38);
        System.out.println("O SEGUNDO REINO, onde a água flui eterna e infinita...");
        Thread.sleep(900);
        System.out.println("O som das marés ecoa por cavernas de cristal azul...");
        Thread.sleep(900);
        System.out.println("E apenas aqueles com alma tranquila conseguem atravessar suas profundezas.\n");
        Thread.sleep(900);

        System.out.println(
                "Agora que você chegou ao Reino de AQUALIS, jovem Padawan,\n"
                + "seu próximo desafio será enfrentar O LABIRINTO DA MARÉ SOMBRIA.\n"
                + "Ele muda a cada maré, confundindo até mesmo os espíritos aquáticos.\n");
        Thread.sleep(1000);

        resetColor();

        setCor256(39);
        System.out.println("\n🌊 DESAFIO DO REINO DE AQUALIS 🌊\n");
        resetColor();

        Thread.sleep(200);
        setCor256(45);
        System.out.println("Você deverá navegar por um labirinto traiçoeiro feito de água viva.\n");
        Thread.sleep(600);
        System.out.println("As paredes mudam lentamente... a maré respira... e observa.\n");
        Thread.sleep(600);
        System.out.println("Seu objetivo é encontrar o PORTAL DE CORRENTEZA, marcado por 'P'.\n");
        Thread.sleep(600);
        System.out.println("Somente aqueles que mantêm a calma sobrevivem às profundezas.\n");
        resetColor();

    }

    public static void introSylvra() throws InterruptedException {
        limparTela();
        System.out.println();

        // Verde forte da floresta
        setCor256(34);
        System.out.println("███████╗██╗   ██╗██╗     ███████╗");
        System.out.println("██╔════╝██║   ██║██║     ██╔════╝");
        System.out.println("███████╗██║   ██║██║     █████╗  ");
        System.out.println("╚════██║██║   ██║██║     ██╔══╝  ");
        System.out.println("███████║╚██████╔╝███████╗███████╗");
        System.out.println("╚══════╝ ╚═════╝ ╚══════╝╚══════╝");
        System.out.println();

        resetColor();
        Thread.sleep(600);

        // Verde natureza
        setCor256(28);
        System.out.println("\n🌿 Você chegou ao Reino de SYLVRA 🌿");
        resetColor();
        Thread.sleep(900);

        // Narrativa
        setCor256(34);
        System.out.println("O REINO DA TERRA, lar de florestas densas e montanhas antigas...");
        Thread.sleep(900);
        System.out.println("A vida aqui é abundante, mas somente guerreiros sábios e pacientes\n"
                + "conseguem superar seus desafios.\n");
        Thread.sleep(900);

        System.out.println(
                "Seu objetivo é percorrer o LABIRINTO DE SYLVRA,\n"
                + "onde obstáculos naturais testarão sua habilidade e resistência.\n"
                + "No final, você encontrará a ESSÊNCIA DA TERRA, a mais poderosa recompensa do reino.\n");
        Thread.sleep(900);

        resetColor();
        setCor256(82);
        System.out.println("🌱 DESAFIO DO LABIRINTO DE SYLVRA 🌱\n");
        Thread.sleep(200);
        resetColor();
        setCor256(118);
        System.out.println("Caminhe pelo labirinto com atenção e cuidado.\n");
        Thread.sleep(200);
        System.out.println("Alguns caminhos exigem que você desvie ou supere obstáculos naturais.\n");
        Thread.sleep(200);
        System.out.println("Ao alcançar a ESSÊNCIA DA TERRA, você terá cumprido o desafio.\n");
        Thread.sleep(200);
        System.out.println("Depois, leve-a de volta aos aldeões para restaurar a harmonia do reino.\n");
        Thread.sleep(200);
        System.out.println("Lembre-se, guerreiro: paciência, estratégia e respeito à terra serão suas maiores armas!\n");
        resetColor();
        Thread.sleep(1050);
    }

    // [ MAPAS ] 
    // REINO PYRA
    public static char[][] mapareinoPyra(String letrasColetadas) {

        String[] reinoFogo = {
            "                                                                                                           ",
            "                                                                             ███████████████                              ",
            "                                                                        ██████████████████████████                                                ",
            "                                                               ████████████████████████████████████████████         ",
            "                                                            ████████████████████████████████████████████████",
            "                                                   ██████████████████████████████████████████████████████████████████",
            "                                              ████████████████████████████████████████████████████████████████████████",
            "                                             █████████████████████████████████████████████████████████████████████████",
            "                                            █████████████████████████~~~~~~~~~~~~~~~~~██████████████████████████████████",
            "                                          ███████████████████~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~███████████████████████████",
            "                                          ██████████████████~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~████████████████████████",
            "                                          █████████████████~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~█████████████████████",
            "                                          ███████████████~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~██████████████████████",
            "                                           ███████████████~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~██████████████████████",
            "                                           █████████████████~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~██████████████████████",
            "                                            █████████████████~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~█████████████████████",
            "                                             ██████████████████~~~~~~~~~~~~~~~~~~~~~~~~~~~██████████████████████████",
            "                                              ███████████████████~~~~~~~~~~~~~~~~~~~~~~~~███████████████████████",
            "                                               █████████████████████████~~~~~~~~~██████████████████████████████",
            "                                                █████████████████████████████████████████████████████████",
            "                                                  ██████████████████████████████████████████████████",
            "                                                         ███████████████████████████████████████████",
            "                                                           ████████████████████████████████████████ ",
            "                                                                 █████████████████████████"};

        char[][] mapaF = new char[reinoFogo.length][];
        for (int i = 0; i < reinoFogo.length; i++) {
            mapaF[i] = reinoFogo[i].toCharArray();

        }

        return mapaF;
    }

    // LABIRINTO DE SYLDRA
    public static char[][] labirintoSylvra() {
        String[] labirinto = {
            "████████████████████████████████████████████████████████████ ",
            "█ENTRADA|...█........█............█.....................█  █ ",
            "█ █████████.█.██████.█.███████████.███████████████████.█.███",
            "█ █.......█........█.█........█...█...............█...█.█.█  ",
            "█ █.█████.█.██████.█.███████.█.█████.███████████.█.███.█.█   ",
            "█ █....█...█........█...............█..........█.█....█...█  ",
            "█ ████.█.████████.█.█████.███.█.███.█.███████.█.█████.███.█  ",
            "█....█.█........█.█........█...█.....█.......█.█.....█....█  ",
            "████.█.████████.█.██████.█.█████.█.█.█.████████.███████████  ",
            "█....█........█.█......█.█.....█.█.█.█........█.█.......█    ",
            "█.█████████.█.████████..████.█.█.█.█.█████████.█.█████.█     ",
            "█.█.......█.█........█......█.█.█.█.........█.█.█.....█.█    ",
            "█.█.█████.█.████████.██████.█.█.█.█.███████.█.███.███.███.█  ",
            "█.█.█....█.█........█........█.█.█.█..................█....█ ",
            "█.█.█.██.█.████████.████.█.█.█.█.████.█.█.███████████..██.█  ",
            "█.█.█..█.█...........█...█.█.█.█.█.....█.............█....█  ",
            "█.█.███.█████████████.███.█.█.█.██████.█.██████████.████.█.█ ",
            "█.█.....█............█....█.█.█......█.█..............█...█  ",
            "█.███████.██████████.█████.█.█.█████.█.███████████████.█.███ ",
            "█........█..........█......█.█......█................█.....S ",
            "████████████████████████████████████████████████████████████ "
        };

        char[][] mapaLabirinto = new char[labirinto.length][];
        for (int i = 0; i < labirinto.length; i++) {
            mapaLabirinto[i] = labirinto[i].toCharArray();
        }
        return mapaLabirinto;
    }

    // Aqualis
    public static boolean atravessarRioPerguntas() throws InterruptedException {
        introAqualis();

        Thread.sleep(1000);

        System.out.println("PRONTO PARAR COMEÇAR:\n 1 - SIM\n 2 - NÃO ");
        int resp = LER.nextInt();
        LER.nextLine();
        limparTela();
        if (resp == 1) {
            String[] perguntas = {
                // Fáceis
                "1) A água é essencial para a vida. Devemos beber água diariamente para manter nosso corpo saudável?\nA) Sim\nB) Não\nC) Só às vezes",
                "2) Devemos fechar a torneira enquanto escovamos os dentes para economizar água?\nA) Sim\nB) Não\nC) Só às vezes",
                // Médias
                "3) Jogar lixo nos rios pode prejudicar:\nA) Peixes e plantas\nB) Só pessoas\nC) Nada acontece",
                "4) Proteger os oceanos é importante porque:\nA) Mantém o equilíbrio da vida marinha\nB) Só para turistas\nC) Não faz diferença",
                // Difícil
                "5) Para reduzir a poluição da água, podemos:\nA) Reduzir uso de produtos químicos, descartar lixo corretamente e economizar água\nB) Jogar produtos químicos nos rios\nC) Ignorar o problema"
            };

            char[] respostasCorretas = {'A', 'A', 'A', 'A', 'A'};

            int vidas = 2;
            int perguntaAtual = 0;
            int numAcertos = 0;

            while (perguntaAtual < perguntas.length) {
                setCor256(21); // exemplo: azul forte
                System.out.println(perguntas[perguntaAtual]);
                resetColor();
                System.out.println("A AFIRMATIVA CORRETA É: ");

                resetColor();
                setCor256(36);
                String entrada = LER.nextLine().trim().toUpperCase();

                if (entrada.isEmpty()) {
                    continue;
                }

                char resposta = entrada.charAt(0);

                if (resposta == respostasCorretas[perguntaAtual]) {
                    resetColor();
                    setCor256(46);
                    System.out.println("MUITO BEM GURREIRO, ACERTOUU!!");

                    numAcertos++;
                    perguntaAtual++;
                    resetColor();
                    Thread.sleep(1000);
                } else {
                    setCor256(196);
                    vidas--;
                    if (vidas > 0) {
                        System.out.println("Opa guerreiro, infelizmente você ERROU! Mais você tem mais uma chancee!");
                    } else {
                        System.out.println("Infelizmente mano tu foi de VASCO!! Mas não desista, volte ao inicio e tente novamente");
                        Thread.sleep(1500);
                        vidas = 2;
                        perguntaAtual = 0;
                        numAcertos = 0;

                        break;
                    }
                }
            }

            if (numAcertos == perguntas.length) {
                resetColor();
                setCor256(51);
                System.out.println("GUARDIÃO - Parabéns, Mago de Aqualis! Pela sua coragem e sabedoria,\n você salvou rios, oceanos e mares, garantindo a vida que flui por todo o reino.\n Como recompensa, você recebe a MAGIA DA PURIFICAÇÃO, símbolo do poder e da harmonia das águas,\n e o respeito de todos os seres aquáticos!");
                System.out.println("GUARDIÃO - E com isso enviarei você agora para o reino de Sylvra");
                Thread.sleep(1500);
                char[][] mapaAqualis = labirintoSylvra(); // ou outro método que retorne um labirinto
                movimentarPersonagemLabirinto(mapaAqualis);

            }
        }

        return true;
    }

    // METODO ONDE OCORRE A VERIFICAÇÃO SE A PALAVRA SECRETA ESTÁ CORRETA PYRA PORTAL
    public static void portalPyra() throws InterruptedException {

        limparTela();

        String digSecreta = "";
        String palavraSecreta = "FOGO";

        setCor256(34);
        System.out.println("\n--- GUARDIÃO DO PORTAL 🔥 ---\n");
        Thread.sleep(100);

        setCor256(33);
        System.out.println("GUARDIÃO: Então você finalmente chegou até aqui...");
        Thread.sleep(1200);

        System.out.println("GUARDIÃO: Não foi fácil, não é mesmo?");
        Thread.sleep(1200);

        System.out.println("GUARDIÃO: Vi sua jornada... sua coragem... sua determinação.");
        Thread.sleep(1200);

        System.out.println("GUARDIÃO: E agora, você traz consigo as quatro letras sagradas.");
        Thread.sleep(1500);

        System.out.println("\nGUARDIÃO: Parabéns, pequeno padawan!");
        Thread.sleep(900);

        System.out.println("GUARDIÃO: Você provou paciência, honra e espírito de guerreiro.");
        Thread.sleep(1200);

        System.out.println("GUARDIÃO: Apenas aqueles dignos conseguem chegar até este portal.");
        Thread.sleep(1200);

        resetColor();

        setCor256(51);
        System.out.println("\nGUARDIÃO: Diga a palavra secreta... \n"
                + "Somente aqueles de coragem verdadeira merecem a CHAMA PURIFICADORA.\n"
                + "Com ela, o fogo eterno responderá ao seu comando, iluminando seu caminho e destruindo a escuridão.\n"
                + "Abrace seu destino, bravo padawan, e eu abrirei o portal para o próximo reino, onde desafios ainda maiores o aguardam!");

        setCor256(196);
        System.out.println("> ");
        Thread.sleep(1500);

        while (true) {
            resetColor();
            digSecreta = LER.nextLine();
            digSecreta = digSecreta.toUpperCase();
            if (digSecreta.equals("FOGO")) {
                setCor256(94);
                System.out.println("Parabénss, Padawan!!\nVocê conseguiu! Agora poderá ir ao próximo reino: o Reino de Aqualis.\n");
                Thread.sleep(1500);
                atravessarRioPerguntas();

            } else {
                resetColor();
                setCor256(36);
                System.out.println("GUARDIÃO - A coragem nasce nas tentativas. Levante-se e tente mais uma vez!");

            }
        }

    }


// [ IMPRIMIR MAPAS ] 
    //  REINO DE PYRA
    public static void imprimirMapaPyra(char[][] mapaF, String letrasColetadas) {

        // Exibe o texto das letras no topo
        System.out.println("Letras coletadas: " + letrasColetadas);

        for (char[] linha : mapaF) {
            for (char c : linha) {
                setCor256(corDoCaractere(c));
                System.out.print(c);
            }
            resetColor();
            System.out.println();
        }
    }

    // METODO AUXILIAR DO IMPRIMIR MAPA DO REINO PYRA (RETORNA A COR PELO CARACTER!)
    public static int corDoCaractere(char c) {
        switch (c) {
            case '⛨':
                return 3;     // personagem
            case '~':
                return 208;   // água
            case '█':
                return 196;   // montanha
            case '▓':
                return 160;   // parede forte
            case '░':
                return 235;   // terra
            case 'F':
            case 'G':
            case 'O':
                return 226;   // letras
            default:
                return 222;   // caminho
        }
    }

    // LABIRINTO SYLDRA
    public static void imprimirMapaLabirintoSylvra(char[][] mapaLabirinto) {

        for (char[] linha : mapaLabirinto) {
            for (char s : linha) {
                setCor256(corSylvra(s));
                System.out.print(s);
            }
            resetColor();
            System.out.println();
        }
    }

    // METODO AUXILIAR TAMBÉM DO LABRINTO DE SYLDRA ( RETRONA COR PELO CARACTER)
    public static int corSylvra(char s) {
        switch (s) {
            case 'C':
                return 226;  // Cavaleiro
            case '█':
                return 130;  // Parede
            case '░':
                return 28;   // Caminho/grama
            case 'S':
                return 196;  // Saída
            default:
                return 255;  // Qualquer outro caractere
        }
    }

// [ MOVIMENTAÇÃO ]
    public static void movimentarPersonagemPyra(char[][] mapa) throws InterruptedException {

        // Posição inicial
        int px = 65, py = 4;

        // Portal fixo
        mapa[6][82] = 'P';

        // Guarda o bloco onde o personagem pisa
        char blocoAnteriorPersonagem = mapa[py][px];
        mapa[py][px] = PERSONAGEM;
        // Sistema das letras
        int fJaColetado = 0;
        int gJaColetado = 0;
        int oJaColetado = 0;

        char letraAtual = ' ';
        char blocoAnteriorLetra = ' ';
        int letraX = -1, letraY = -1;

        long tempoUltimaLetra = System.currentTimeMillis();

        while (true) {
            limparTela();
            imprimirMapaPyra(mapa, letrasColetadas);
            System.out.println("Letras coletadas: " + letrasColetadas);
            System.out.print("Mover (W/A/S/D): ");

            long agora = System.currentTimeMillis();

            // GERAR LETRA A CADA 20s
            if (agora - tempoUltimaLetra >= 20000) {

                // Remover letra antiga corretamente
                if (letraAtual != ' ' && letraX != -1 && letraY != -1) {
                    mapa[letraY][letraX] = blocoAnteriorLetra;
                    letraX = -1;
                    letraY = -1;
                }

                // Decide qual letra deve aparecer
                if (fJaColetado == 0) {
                    letraAtual = 'F';
                } else if (gJaColetado == 0) {
                    letraAtual = 'G';
                } else if (oJaColetado < 2) {
                    letraAtual = 'O';
                } else {
                    letraAtual = ' '; // acabou tudo
                }

                // Só gera se ainda houver letra
                if (letraAtual != ' ') {
                    Random sort = new Random();

                    do {
                        letraX = 1 + sort.nextInt(mapa[0].length - 2);
                        letraY = 1 + sort.nextInt(mapa.length - 2);

                    } while (mapa[letraY][letraX] == '▓'
                            || mapa[letraY][letraX] == '~'
                            || mapa[letraY][letraX] == 'P'
                            || mapa[letraY][letraX] == PERSONAGEM
                            || mapa[letraY][letraX] == ' '
                            || mapa[letraY][letraX] == '\u0000');

                    blocoAnteriorLetra = mapa[letraY][letraX];
                    mapa[letraY][letraX] = letraAtual;
                }

                tempoUltimaLetra = agora;
            }

            // MOVIMENTO 
            String entrada = LER.nextLine().trim().toUpperCase();
            if (entrada.isEmpty()) {
                continue;
            }

            char comando = entrada.charAt(0);

            if (comando == 'X') {
                System.out.println("Você escolheu sair/resetar o jogo");
                Thread.sleep(1000);

                letrasColetadas = "";
                qtdOcoletado = 0;

                // Chama menu principal ou reinicia mapa
                modoHistoria(); // volta para o menu 
                return; // sai do loop atual
            }

            int novoX = px, novoY = py;
            switch (comando) {
                case 'W':
                    novoY--;
                    break;
                case 'S':
                    novoY++;
                    break;
                case 'A':
                    novoX--;
                    break;
                case 'D':
                    novoX++;
                    break;
                default:
                    continue;
            }

            // Verifica limites antes de acessar o mapa
            if (novoX < 0 || novoX >= mapa[0].length || novoY < 0 || novoY >= mapa.length) {
                System.out.println("Você não pode sair do mapa!");
                Thread.sleep(500);
                continue;
            }

            char blocoDestino = mapa[novoY][novoX];

            if (blocoDestino == '~') {
                System.out.println("Você não pode passar por aqui!");
                Thread.sleep(800);
                continue;
            }

            // Coleta de letras
            if (blocoDestino == letraAtual) {

                switch (letraAtual) {
                    case 'F':
                        fJaColetado++;
                        break;
                    case 'G':
                        gJaColetado++;
                        break;
                    case 'O':
                        oJaColetado++;
                        break;
                }

                letrasColetadas += letraAtual;

                // Remove a letra do mapa
                mapa[letraY][letraX] = blocoAnteriorLetra;
                letraAtual = ' ';
                letraX = -1;
                letraY = -1;
            }

            // Portal
            if (blocoDestino == 'P') {
                if (letrasColetadas.length() == 4) {
                    portalPyra();
                } else {
                    System.out.println("Você precisa coletar todas as letras primeiro!");
                    Thread.sleep(1000);
                    continue;
                }
            }

            // Atualiza movimento
            mapa[py][px] = blocoAnteriorPersonagem;
            blocoAnteriorPersonagem = blocoDestino;

            px = novoX;
            py = novoY;

            mapa[py][px] = PERSONAGEM;
        }
    }

    public static boolean podeAndar(char c) {
        return c != '~' && c == '█';
    }

    // LABIRINTO DE SYLDRA
    public static void movimentarPersonagemLabirinto(char[][] mapa) throws InterruptedException {

        introSylvra();

        // Posição inicial
        int pxL = 9;
        int pyL = 1;

        // Guarda o bloco onde o personagem estava
        char blocoAnteriorPersonagemL = mapa[pyL][pxL];
        mapa[pyL][pxL] = CAVALEIRO;
        while (true) {
            limparTela();
            imprimirMapaLabirintoSylvra(mapa);
            System.out.print("Mover (W/A/S/D): ");

            // MOVIMENTO 
            String entrada = LER.nextLine().trim().toUpperCase();
            if (entrada.isEmpty()) {
                continue;
            }

            char comando = entrada.charAt(0);

            int novoX = pxL;
            int novoY = pyL;

            switch (comando) {
                case 'W':
                    novoY--;
                    break;
                case 'S':
                    novoY++;
                    break;
                case 'A':
                    novoX--;
                    break;
                case 'D':
                    novoX++;
                    break;
                default:
                    continue;
            }

            // Fora do mapa
            if (novoX < 0 || novoX >= mapa[0].length || novoY < 0 || novoY >= mapa.length) {
                continue;
            }

            char destino = mapa[novoY][novoX];

            // Colisões
            if (destino == '█') {
                continue;
            }

            setCor256(10);
            if (destino == 'S') {
                System.out.println("GUARDIÃO DE SYLDRA - Parabéns! Você encontrou a saída do labirinto!");
                Thread.sleep(900);
                System.out.println("GUARDIÃO DE SYLDRA - E com isso, padawan, você conseguiu salvar a terra dos aldeões.\nAgora volte a Sylvra e entregue a eles a Essência da Terra, que trará paz e equilíbrio a todo o reino!");
                Thread.sleep(900);
                System.out.println("GUARDIÃO DE SYLDRA - E com isso, padawan, você salvou a terra dos aldeões, enfrentando desafios que poucos ousariam.\n"
                        + "Retorne agora a Sylvra e entregue a eles a Sagrada Essência da Terra, que trará paz e equilíbrio a todo o reino!\n"
                        + "E, por seu ato de coragem, honra e determinação, os aldeões o presenteiam com o ESCUDO DA TERRA VIVA —\n"
                        + "a arma mais poderosa de seu povo, símbolo eterno de bravura e proteção!");

                Thread.sleep(1300);
                combateFinal();
            }

            // Restaurar bloco anterior
            mapa[pyL][pxL] = blocoAnteriorPersonagemL;

            // Atualizar blocoAnterior com o bloco onde vamos pisar
            blocoAnteriorPersonagemL = destino;

            // Atualiza posição do personagem
            pxL = novoX;
            pyL = novoY;

            // Coloca o personagem na nova posição
            mapa[pyL][pxL] = CAVALEIRO;
        }
    }

    //[ AUXILIADORES] 
    // METODO EMPRESTADO (UTILIZADO PARA ADICIONAR COR AO JOGO)
    public static void setCor256(int cor) {
        if (cor < 0 || cor > 255) {
            resetColor();
            return;
        }
        System.out.print("\u001b[38;5;" + cor + "m");
    }

    // RESETA A COR E VOLAT AO PADRÃO ORIGINAL DO TERMINAL
    public static void resetColor() {
        System.out.print("\u001b[0m");
    }

    public static void limparTela() {
        System.out.print("\033\143");
        System.out.flush();
    }

    public static void combateFinal() throws InterruptedException {
        limparTela();

        setCor256(10);
        System.out.println("🌿 LABIRINTO DE SYLDRA, CORAÇÃO DA FLORESTA...");
        Thread.sleep(2000);
        resetColor();

        setCor256(9);
        System.out.println("\n Dragão: \"Ah, finalmente chegaram! Pensaram que poderiam unir esses reinos contra mim? Patéticos!\"");
        Thread.sleep(2500);
        resetColor();

        setCor256(202);
        System.out.println("\n🔥 Samurai: \"Não subestime a coragem de Pyra! Não lutamos sozinhos!\"");
        Thread.sleep(2500);
        resetColor();

        setCor256(12);
        System.out.println("\n💧 Mago: \"A sabedoria de Aqualis nos guia, e nossos feitiços protegerão cada passo!\"");
        Thread.sleep(2500);
        resetColor();

        setCor256(10);
        System.out.println("\n🌿 Cavaleiro: \"A força da natureza de Sylvra corre em nossas veias! Não permitiremos que destrua nosso mundo!\"");
        Thread.sleep(2500);
        resetColor();

        setCor256(11);
        System.out.println("\n🌪 Barbaro: \"E o vento da determinação de Zephir nos empurra! Juntos, somos imparáveis!\"");
        Thread.sleep(2500);
        resetColor();

        setCor256(9);
        System.out.println("\n Dragão: \"Hahaha! Virtudes? Não passarão de pó diante do meu poder!\"");
        Thread.sleep(2500);
        resetColor();

        setCor256(202);
        System.out.println("\n🔥 Samurai: \"Amigos, cada reino nos deu sua força. Agora, juntos, vamos acabar com ele!\"");
        Thread.sleep(2500);
        resetColor();

        setCor256(12);
        System.out.println("\n💧 Mago: \"Prepare-se, vilão! Sua tirania termina aqui!\"");
        Thread.sleep(2000);
        resetColor();

        setCor256(9);
        System.out.println("\n⚔️ A BATALHA FINAL COMEÇA! ⚔️");
        Thread.sleep(2000);
        resetColor();

        // Vida do vilão
        int vidaVilao = 100;

        // Dano de cada personagem
        int danoSamurai = 15;
        int danoMago = 20;
        int danoCavaleiro = 18;
        int danoBarbaro = 22;

        while (vidaVilao > 0) {
            setCor256(202);
            System.out.println("\nSamurai avança, espada em riste, e golpeia com precisão! USANDO A CHAMA PURIFICADORA 🔥 -" + danoSamurai + " HP");
            vidaVilao -= danoSamurai;
            if (vidaVilao <= 0) {
                break;
            }

            Thread.sleep(1000);
            resetColor();

            setCor256(12);
            System.out.println("Mago conjura raios místicos! USANDO A MAGIA DA PURIFICAÇÃO 💧 -" + danoMago + " HP");
            vidaVilao -= danoMago;
            if (vidaVilao <= 0) {
                break;
            }

            Thread.sleep(1000);
            resetColor();

            setCor256(10);
            System.out.println("Cavaleiro DEFENDE COM O ESCUDO DA TERRA VIVA e logo em seguida desfere um ataque fulminante! 🌿 -" + danoCavaleiro + " HP");
            vidaVilao -= danoCavaleiro;
            if (vidaVilao <= 0) {
                break;
            }

            Thread.sleep(1000);
            resetColor();

            setCor256(11);
            System.out.println("Barbaro golpeia com força brutal com a FÚRIA DOS VENTOS! 🌪 -" + danoBarbaro + " HP");
            vidaVilao -= danoBarbaro;
            if (vidaVilao <= 0) {
                break;
            }

            Thread.sleep(1000);
            resetColor();

            setCor256(9);
            System.out.println("\nVida do vilão restante: " + vidaVilao);
            Thread.sleep(1500);
            limparTela();
        }

        limparTela();
        resetColor();
        setCor256(226);
        System.out.println(" O vilão cai derrotado, e a luz retorna ao Labirinto de Sylvra.");
        Thread.sleep(2500);
        System.out.println("Os quatro reinos celebram a união de suas virtudes e a restauração do equilíbrio no continente de Eldrath!");
        Thread.sleep(3000);
        System.out.println("\nÉ ISSOA AIII VOCÊ E SEUS Salvaram o REINO DE ELDRATH!! ");

        System.out.println("FIMMMMMMMM!!");
        resetColor();
        System.out.println("Deseja voltar ao inicio para jogar novamente ou entrar em um outro modo:\n 1.SIM\n 2.NÃO\n");
        int voltarSouN = LER.nextInt();
        if (voltarSouN == 1) {
            limparTela();
            TCA.jogar();
        }

    }

}
