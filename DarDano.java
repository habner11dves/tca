

import java.util.Random;

public class DarDano {
    final static CombateSamurai samuraiCombate = new CombateSamurai();
    final static CombateMago magoCombate = new CombateMago();
    final static CombateCavaleiro cavaleiroCombate = new CombateCavaleiro();
    final static CombateBarbaro barbaroCombate = new CombateBarbaro();

    public static void darDanoNoP2(int jogada, int player1, int player2) throws InterruptedException {
        Random aleatorio = new Random();
        int indice = 0;
        int dano = 0;

        if (player1 == 1 && player2 == 1) { // Dano do samurai no samurai
            switch (jogada) {
                case 1:
                    int[] danoSamuraiAtaque1 = {55, 60, 65, 70, 75};

                    indice = aleatorio.nextInt(danoSamuraiAtaque1.length);
                    dano = danoSamuraiAtaque1[indice];
                    samuraiCombate.darDanoP2(dano);
                    break;
                case 2:
                    int[] danoSamuraiAtaque2 = {80, 85, 90, 95, 100};

                    indice = aleatorio.nextInt(danoSamuraiAtaque2.length);
                    dano = danoSamuraiAtaque2[indice];
                    samuraiCombate.darDanoP2(dano);
                    break;
                case 3:
                    int[] danoSamuraiAtaque3 = {160};

                    indice = aleatorio.nextInt(danoSamuraiAtaque3.length);
                    dano = danoSamuraiAtaque3[indice];
                    samuraiCombate.darDanoP2(dano);
                    break;
                case 4:
                    int[] danoSamuraiAtaque4 = {170, 175, 180, 185};

                    indice = aleatorio.nextInt(danoSamuraiAtaque4.length);
                    dano = danoSamuraiAtaque4[indice];
                    samuraiCombate.darDanoP2(dano);
                    break;
            }
        } else if (player1 == 1 && player2 == 2) { // Dano do samurai no mago
            switch (jogada) {
                case 1:
                    int[] danoSamuraiAtaque1 = {55, 60, 65, 70, 75};

                    indice = aleatorio.nextInt(danoSamuraiAtaque1.length);
                    dano = danoSamuraiAtaque1[indice];
                    magoCombate.darDanoP2(dano);
                    break;
                case 2:
                    int[] danoSamuraiAtaque2 = {80, 85, 90, 95, 100};

                    indice = aleatorio.nextInt(danoSamuraiAtaque2.length);
                    dano = danoSamuraiAtaque2[indice];
                    magoCombate.darDanoP2(dano);
                    break;
                case 3:
                    int[] danoSamuraiAtaque3 = {160};

                    indice = aleatorio.nextInt(danoSamuraiAtaque3.length);
                    dano = danoSamuraiAtaque3[indice];
                    magoCombate.darDanoP2(dano);
                    break;
                case 4:
                    int[] danoSamuraiAtaque4 = {170, 175, 180, 185};

                    indice = aleatorio.nextInt(danoSamuraiAtaque4.length);
                    dano = danoSamuraiAtaque4[indice];
                    magoCombate.darDanoP2(dano);
                    break;
            }
        } else if (player1 == 1 && player2 == 3) { // Dano do samurai no cavaleiro
            switch (jogada) {
                case 1:
                    int[] danoSamuraiAtaque1 = {55, 60, 65, 70, 75};

                    indice = aleatorio.nextInt(danoSamuraiAtaque1.length);
                    dano = danoSamuraiAtaque1[indice];
                    cavaleiroCombate.darDanoP2(dano);
                    break;
                case 2:
                    int[] danoSamuraiAtaque2 = {80, 85, 90, 95, 100};

                    indice = aleatorio.nextInt(danoSamuraiAtaque2.length);
                    dano = danoSamuraiAtaque2[indice];
                    cavaleiroCombate.darDanoP2(dano);
                    break;
                case 3:
                    int[] danoSamuraiAtaque3 = {160};

                    indice = aleatorio.nextInt(danoSamuraiAtaque3.length);
                    dano = danoSamuraiAtaque3[indice];
                    cavaleiroCombate.darDanoP2(dano);
                    break;
                case 4:
                    int[] danoSamuraiAtaque4 = {170, 175, 180, 185};

                    indice = aleatorio.nextInt(danoSamuraiAtaque4.length);
                    dano = danoSamuraiAtaque4[indice];
                    cavaleiroCombate.darDanoP2(dano);
                    break;
            }
        } else if (player1 == 1 && player2 == 4) { // Dano do samurai no barbaro
            switch (jogada) {
                case 1:
                    int[] danoSamuraiAtaque1 = {55, 60, 65, 70, 75};

                    indice = aleatorio.nextInt(danoSamuraiAtaque1.length);
                    dano = danoSamuraiAtaque1[indice];
                    barbaroCombate.darDanoP2(dano);
                    break;
                case 2:
                    int[] danoSamuraiAtaque2 = {80, 85, 90, 95, 100};

                    indice = aleatorio.nextInt(danoSamuraiAtaque2.length);
                    dano = danoSamuraiAtaque2[indice];
                    barbaroCombate.darDanoP2(dano);
                    break;
                case 3:
                    int[] danoSamuraiAtaque3 = {160};

                    indice = aleatorio.nextInt(danoSamuraiAtaque3.length);
                    dano = danoSamuraiAtaque3[indice];
                    barbaroCombate.darDanoP2(dano);
                    break;
                case 4:
                    int[] danoSamuraiAtaque4 = {170, 175, 180, 185};

                    indice = aleatorio.nextInt(danoSamuraiAtaque4.length);
                    dano = danoSamuraiAtaque4[indice];
                    barbaroCombate.darDanoP2(dano);
                    break;
            }
        } else if (player1 == 2 && player2 == 1) { // Dano do mago no samurai
            switch (jogada) {
                case 1:
                    int[] danoMagoAtaque1 = {60, 65, 70, 75};

                    indice = aleatorio.nextInt(danoMagoAtaque1.length);
                    dano = danoMagoAtaque1[indice];
                    samuraiCombate.darDanoP2(dano);
                    break;
                case 2:
                    int[] danoMagoAtaque2 = {70, 75, 80, 85, 90, 95};

                    indice = aleatorio.nextInt(danoMagoAtaque2.length);
                    dano = danoMagoAtaque2[indice];
                    samuraiCombate.darDanoP2(dano);
                    break;
                case 3:
                    int[] danoMagoAtaque3 = {170, 180};

                    indice = aleatorio.nextInt(danoMagoAtaque3.length);
                    dano = danoMagoAtaque3[indice];
                    samuraiCombate.darDanoP2(dano);
                    break;
                case 4:
                    int[] danoMagoAtaque4 = {150, 155, 160, 165, 170, 175, 180, 185, 190};

                    indice = aleatorio.nextInt(danoMagoAtaque4.length);
                    dano = danoMagoAtaque4[indice];
                    samuraiCombate.darDanoP2(dano);
                    break;
            }
        } else if (player1 == 2 && player2 == 2) { // Dano do mago no mago
            switch (jogada) {
                case 1:
                    int[] danoMagoAtaque1 = {60, 65, 70, 75};

                    indice = aleatorio.nextInt(danoMagoAtaque1.length);
                    dano = danoMagoAtaque1[indice];
                    magoCombate.darDanoP2(dano);
                    break;
                case 2:
                    int[] danoMagoAtaque2 = {70, 75, 80, 85, 90, 95};

                    indice = aleatorio.nextInt(danoMagoAtaque2.length);
                    dano = danoMagoAtaque2[indice];
                    magoCombate.darDanoP2(dano);
                    break;
                case 3:
                    int[] danoMagoAtaque3 = {170, 180};

                    indice = aleatorio.nextInt(danoMagoAtaque3.length);
                    dano = danoMagoAtaque3[indice];
                    magoCombate.darDanoP2(dano);
                    break;
                case 4:
                    int[] danoMagoAtaque4 = {150, 155, 160, 165, 170, 175, 180, 185, 190};

                    indice = aleatorio.nextInt(danoMagoAtaque4.length);
                    dano = danoMagoAtaque4[indice];
                    magoCombate.darDanoP2(dano);
                    break;
            }
        } else if (player1 == 2 && player2 == 3) { // Dano do mago no cavaleiro
            switch (jogada) {
                case 1:
                    int[] danoMagoAtaque1 = {60, 65, 70, 75};

                    indice = aleatorio.nextInt(danoMagoAtaque1.length);
                    dano = danoMagoAtaque1[indice];
                    cavaleiroCombate.darDanoP2(dano);
                    break;
                case 2:
                    int[] danoMagoAtaque2 = {70, 75, 80, 85, 90, 95};

                    indice = aleatorio.nextInt(danoMagoAtaque2.length);
                    dano = danoMagoAtaque2[indice];
                    cavaleiroCombate.darDanoP2(dano);
                    break;
                case 3:
                    int[] danoMagoAtaque3 = {170, 180};

                    indice = aleatorio.nextInt(danoMagoAtaque3.length);
                    dano = danoMagoAtaque3[indice];
                    cavaleiroCombate.darDanoP2(dano);
                    break;
                case 4:
                    int[] danoMagoAtaque4 = {150, 155, 160, 165, 170, 175, 180, 185, 190};

                    indice = aleatorio.nextInt(danoMagoAtaque4.length);
                    dano = danoMagoAtaque4[indice];
                    cavaleiroCombate.darDanoP2(dano);
                    break;
            }
        } else if (player1 == 2 && player2 == 4) { // Dano do mago no barbaro
            switch (jogada) {
                case 1:
                    int[] danoMagoAtaque1 = {60, 65, 70, 75};

                    indice = aleatorio.nextInt(danoMagoAtaque1.length);
                    dano = danoMagoAtaque1[indice];
                    barbaroCombate.darDanoP2(dano);
                    break;
                case 2:
                    int[] danoMagoAtaque2 = {70, 75, 80, 85, 90, 95};

                    indice = aleatorio.nextInt(danoMagoAtaque2.length);
                    dano = danoMagoAtaque2[indice];
                    barbaroCombate.darDanoP2(dano);
                    break;
                case 3:
                    int[] danoMagoAtaque3 = {170, 180};

                    indice = aleatorio.nextInt(danoMagoAtaque3.length);
                    dano = danoMagoAtaque3[indice];
                    barbaroCombate.darDanoP2(dano);
                    break;
                case 4:
                    int[] danoMagoAtaque4 = {150, 155, 160, 165, 170, 175, 180, 185, 190};

                    indice = aleatorio.nextInt(danoMagoAtaque4.length);
                    dano = danoMagoAtaque4[indice];
                    barbaroCombate.darDanoP2(dano);
                    break;
            }
        } else if (player1 == 3 && player2 == 1) { // Dano do cavaleiro no samurai
            switch (jogada) {
                case 1:
                    int[] danoCavaleiroAtaque1 = {65, 70, 75, 80};

                    indice = aleatorio.nextInt(danoCavaleiroAtaque1.length);
                    dano = danoCavaleiroAtaque1[indice];
                    samuraiCombate.darDanoP2(dano);
                    break;
                case 2:
                    int[] danoCavaleiroAtaque2 = {80, 85, 90, 95, 100};

                    indice = aleatorio.nextInt(danoCavaleiroAtaque2.length);
                    dano = danoCavaleiroAtaque2[indice];
                    samuraiCombate.darDanoP2(dano);
                    break;
                case 3:
                    int[] danoCavaleiroAtaque3 = {100, 105, 110, 115, 120, 125};

                    indice = aleatorio.nextInt(danoCavaleiroAtaque3.length);
                    dano = danoCavaleiroAtaque3[indice];
                    samuraiCombate.darDanoP2(dano);
                    break;
                case 4:
                    int[] danoCavaleiroAtaque4 = {145, 150, 155, 160};

                    indice = aleatorio.nextInt(danoCavaleiroAtaque4.length);
                    dano = danoCavaleiroAtaque4[indice];
                    samuraiCombate.darDanoP2(dano);
                    break;
            }
        } else if (player1 == 3 && player2 == 2) { // Dano do cavaleiro no mago
            switch (jogada) {
                case 1:
                    int[] danoCavaleiroAtaque1 = {65, 70, 75, 80};

                    indice = aleatorio.nextInt(danoCavaleiroAtaque1.length);
                    dano = danoCavaleiroAtaque1[indice];
                    magoCombate.darDanoP2(dano);
                    break;
                case 2:
                    int[] danoCavaleiroAtaque2 = {80, 85, 90, 95, 100};

                    indice = aleatorio.nextInt(danoCavaleiroAtaque2.length);
                    dano = danoCavaleiroAtaque2[indice];
                    magoCombate.darDanoP2(dano);
                    break;
                case 3:
                    int[] danoCavaleiroAtaque3 = {100, 105, 110, 115, 120, 125};

                    indice = aleatorio.nextInt(danoCavaleiroAtaque3.length);
                    dano = danoCavaleiroAtaque3[indice];
                    magoCombate.darDanoP2(dano);
                    break;
                case 4:
                    int[] danoCavaleiroAtaque4 = {145, 150, 155, 160};

                    indice = aleatorio.nextInt(danoCavaleiroAtaque4.length);
                    dano = danoCavaleiroAtaque4[indice];
                    magoCombate.darDanoP2(dano);
                    break;
            }
        } else if (player1 == 3 && player2 == 3) { // Dano do cavaleiro no cavaleiro
            switch (jogada) {
                case 1:
                    int[] danoCavaleiroAtaque1 = {65, 70, 75, 80};

                    indice = aleatorio.nextInt(danoCavaleiroAtaque1.length);
                    dano = danoCavaleiroAtaque1[indice];
                    cavaleiroCombate.darDanoP2(dano);
                    break;
                case 2:
                    int[] danoCavaleiroAtaque2 = {80, 85, 90, 95, 100};

                    indice = aleatorio.nextInt(danoCavaleiroAtaque2.length);
                    dano = danoCavaleiroAtaque2[indice];
                    cavaleiroCombate.darDanoP2(dano);
                    break;
                case 3:
                    int[] danoCavaleiroAtaque3 = {100, 105, 110, 115, 120, 125};

                    indice = aleatorio.nextInt(danoCavaleiroAtaque3.length);
                    dano = danoCavaleiroAtaque3[indice];
                    cavaleiroCombate.darDanoP2(dano);
                    break;
                case 4:
                    int[] danoCavaleiroAtaque4 = {145, 150, 155, 160};

                    indice = aleatorio.nextInt(danoCavaleiroAtaque4.length);
                    dano = danoCavaleiroAtaque4[indice];
                    cavaleiroCombate.darDanoP2(dano);
                    break;
            }
        } else if (player1 == 3 && player2 == 4) { // Dano do cavaleiro no barbaro
            switch (jogada) {
                case 1:
                    int[] danoCavaleiroAtaque1 = {65, 70, 75, 80};

                    indice = aleatorio.nextInt(danoCavaleiroAtaque1.length);
                    dano = danoCavaleiroAtaque1[indice];
                    barbaroCombate.darDanoP2(dano);
                    break;
                case 2:
                    int[] danoCavaleiroAtaque2 = {80, 85, 90, 95, 100};

                    indice = aleatorio.nextInt(danoCavaleiroAtaque2.length);
                    dano = danoCavaleiroAtaque2[indice];
                    barbaroCombate.darDanoP2(dano);
                    break;
                case 3:
                    int[] danoCavaleiroAtaque3 = {100, 105, 110, 115, 120, 125};

                    indice = aleatorio.nextInt(danoCavaleiroAtaque3.length);
                    dano = danoCavaleiroAtaque3[indice];
                    barbaroCombate.darDanoP2(dano);
                    break;
                case 4:
                    int[] danoCavaleiroAtaque4 = {145, 150, 155, 160};

                    indice = aleatorio.nextInt(danoCavaleiroAtaque4.length);
                    dano = danoCavaleiroAtaque4[indice];
                    barbaroCombate.darDanoP2(dano);
                    break;
            }
        } else if (player1 == 4 && player2 == 1) { // Dano do barbaro no samurai
            switch (jogada) {
                case 1:
                    int[] danoBarbaroAtaque1 = {70, 75, 80};

                    indice = aleatorio.nextInt(danoBarbaroAtaque1.length);
                    dano = danoBarbaroAtaque1[indice];
                    samuraiCombate.darDanoP2(dano);
                    break;
                case 2:
                    int[] danoBarbaroAtaque2 = {85};

                    indice = aleatorio.nextInt(danoBarbaroAtaque2.length);
                    dano = danoBarbaroAtaque2[indice];
                    samuraiCombate.darDanoP2(dano);
                    break;
                case 3:
                    int[] danoBarbaroAtaque3 = {110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160, 165, 170, 175, 180, 185, 190};

                    indice = aleatorio.nextInt(danoBarbaroAtaque3.length);
                    dano = danoBarbaroAtaque3[indice];
                    samuraiCombate.darDanoP2(dano);
                    break;
                case 4:
                    int[] danoBarbaroAtaque4 = {145, 150, 155, 160};

                    indice = aleatorio.nextInt(danoBarbaroAtaque4.length);
                    dano = danoBarbaroAtaque4[indice];
                    samuraiCombate.darDanoP2(dano);
                    break;
            }
        } else if (player1 == 4 && player2 == 2) { // Dano do barbaro no mago
            switch (jogada) {
                case 1:
                    int[] danoBarbaroAtaque1 = {70, 75, 80};

                    indice = aleatorio.nextInt(danoBarbaroAtaque1.length);
                    dano = danoBarbaroAtaque1[indice];
                    magoCombate.darDanoP2(dano);
                    break;
                case 2:
                    int[] danoBarbaroAtaque2 = {85};

                    indice = aleatorio.nextInt(danoBarbaroAtaque2.length);
                    dano = danoBarbaroAtaque2[indice];
                    magoCombate.darDanoP2(dano);
                    break;
                case 3:
                    int[] danoBarbaroAtaque3 = {110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160, 165, 170, 175, 180, 185, 190};

                    indice = aleatorio.nextInt(danoBarbaroAtaque3.length);
                    dano = danoBarbaroAtaque3[indice];
                    magoCombate.darDanoP2(dano);
                    break;
                case 4:
                    int[] danoBarbaroAtaque4 = {145, 150, 155, 160};

                    indice = aleatorio.nextInt(danoBarbaroAtaque4.length);
                    dano = danoBarbaroAtaque4[indice];
                    magoCombate.darDanoP2(dano);
                    break;
            }
        } else if (player1 == 4 && player2 == 3) { // Dano do barbaro no cavaleiro
            switch (jogada) {
                case 1:
                    int[] danoBarbaroAtaque1 = {70, 75, 80};

                    indice = aleatorio.nextInt(danoBarbaroAtaque1.length);
                    dano = danoBarbaroAtaque1[indice];
                    cavaleiroCombate.darDanoP2(dano);
                    break;
                case 2:
                    int[] danoBarbaroAtaque2 = {85};

                    indice = aleatorio.nextInt(danoBarbaroAtaque2.length);
                    dano = danoBarbaroAtaque2[indice];
                    cavaleiroCombate.darDanoP2(dano);
                    break;
                case 3:
                    int[] danoBarbaroAtaque3 = {110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160, 165, 170, 175, 180, 185, 190};

                    indice = aleatorio.nextInt(danoBarbaroAtaque3.length);
                    dano = danoBarbaroAtaque3[indice];
                    cavaleiroCombate.darDanoP2(dano);
                    break;
                case 4:
                    int[] danoBarbaroAtaque4 = {145, 150, 155, 160};

                    indice = aleatorio.nextInt(danoBarbaroAtaque4.length);
                    dano = danoBarbaroAtaque4[indice];
                    cavaleiroCombate.darDanoP2(dano);
                    break;
            }
        } else if (player1 == 4 && player2 == 4) { // Dano do barbaro no barbaro
            switch (jogada) {
                case 1:
                    int[] danoBarbaroAtaque1 = {70, 75, 80};

                    indice = aleatorio.nextInt(danoBarbaroAtaque1.length);
                    dano = danoBarbaroAtaque1[indice];
                    barbaroCombate.darDanoP2(dano);
                    break;
                case 2:
                    int[] danoBarbaroAtaque2 = {85};

                    indice = aleatorio.nextInt(danoBarbaroAtaque2.length);
                    dano = danoBarbaroAtaque2[indice];
                    barbaroCombate.darDanoP2(dano);
                    break;
                case 3:
                    int[] danoBarbaroAtaque3 = {145, 150, 155, 160};

                    indice = aleatorio.nextInt(danoBarbaroAtaque3.length);
                    dano = danoBarbaroAtaque3[indice];
                    barbaroCombate.darDanoP2(dano);
                    break;
                case 4:
                    int[] danoBarbaroAtaque4 = {110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160, 165, 170, 175, 180, 185, 190};

                    indice = aleatorio.nextInt(danoBarbaroAtaque4.length);
                    dano = danoBarbaroAtaque4[indice];
                    barbaroCombate.darDanoP2(dano);
                    break;
            }
        }
    }

    public static void darDanoNoP1(int player2, int player1) throws InterruptedException {
        Random aleatorio = new Random();
        int indice = 0;
        int danoP1 = 0;

        if (player1 == 1 && player2 == 1) {
            int[] danoSamuraiAtaque = {55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160,165, 170,175, 180, 185};

            indice = aleatorio.nextInt(danoSamuraiAtaque.length);
            danoP1 = danoSamuraiAtaque[indice];
            samuraiCombate.darDanoP1(danoP1);
        } else if (player1 == 1 && player2 == 2) {
            int[] danoMagoAtaque = {60, 65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160,165, 170,175, 180, 185, 190};

            indice = aleatorio.nextInt(danoMagoAtaque.length);
            danoP1 = danoMagoAtaque[indice];
            samuraiCombate.darDanoP1(danoP1);
        } else if (player1 == 1 && player2 == 3) {
            int[] danoCavaleiroAtaque = {65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160};

            indice = aleatorio.nextInt(danoCavaleiroAtaque.length);
            danoP1 = danoCavaleiroAtaque[indice];
            samuraiCombate.darDanoP1(danoP1);
        } else if (player1 == 1 && player2 == 4) {
            int[] danoBarbaroAtaque = {70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160,165, 170,175, 180, 185, 190};

            indice = aleatorio.nextInt(danoBarbaroAtaque.length);
            danoP1 = danoBarbaroAtaque[indice];
            samuraiCombate.darDanoP1(danoP1);
        } else if (player1 == 2 && player2 == 1) {
            int[] danoSamuraiAtaque = {55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160,165, 170,175, 180, 185};

            indice = aleatorio.nextInt(danoSamuraiAtaque.length);
            danoP1 = danoSamuraiAtaque[indice];
            magoCombate.darDanoP1(danoP1);
        } else if (player1 == 2 && player2 == 2) {
            int[] danoMagoAtaque = {60, 65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160,165, 170,175, 180, 185, 190};

            indice = aleatorio.nextInt(danoMagoAtaque.length);
            danoP1 = danoMagoAtaque[indice];
            magoCombate.darDanoP1(danoP1);
        } else if (player1 == 2 && player2 == 3) {
            int[] danoCavaleiroAtaque = {65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160};

            indice = aleatorio.nextInt(danoCavaleiroAtaque.length);
            danoP1 = danoCavaleiroAtaque[indice];
            magoCombate.darDanoP1(danoP1);
        } else if (player1 == 2 && player2 == 4) {
            int[] danoBarbaroAtaque = {70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160,165, 170,175, 180, 185, 190};

            indice = aleatorio.nextInt(danoBarbaroAtaque.length);
            danoP1 = danoBarbaroAtaque[indice];
            magoCombate.darDanoP1(danoP1);
        } else if (player1 == 3 && player2 == 1) {
            int[] danoSamuraiAtaque = {55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160,165, 170,175, 180, 185};

            indice = aleatorio.nextInt(danoSamuraiAtaque.length);
            danoP1 = danoSamuraiAtaque[indice];
            cavaleiroCombate.darDanoP1(danoP1);
        } else if (player1 == 3 && player2 == 2) {
            int[] danoMagoAtaque = {60, 65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160,165, 170,175, 180, 185, 190};

            indice = aleatorio.nextInt(danoMagoAtaque.length);
            danoP1 = danoMagoAtaque[indice];
            cavaleiroCombate.darDanoP1(danoP1);
        } else if (player1 == 3 && player2 == 3) {
            int[] danoCavaleiroAtaque = {65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160};

            indice = aleatorio.nextInt(danoCavaleiroAtaque.length);
            danoP1 = danoCavaleiroAtaque[indice];
            cavaleiroCombate.darDanoP1(danoP1);
        } else if (player1 == 3 && player2 == 4) {
            int[] danoBarbaroAtaque = {70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160,165, 170,175, 180, 185, 190};

            indice = aleatorio.nextInt(danoBarbaroAtaque.length);
            danoP1 = danoBarbaroAtaque[indice];
            cavaleiroCombate.darDanoP1(danoP1);
        } else if (player1 == 4 && player2 == 1) {
            int[] danoSamuraiAtaque = {55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160,165, 170,175, 180, 185};

            indice = aleatorio.nextInt(danoSamuraiAtaque.length);
            danoP1 = danoSamuraiAtaque[indice];
            barbaroCombate.darDanoP1(danoP1);
        } else if (player1 == 4 && player2 == 2) {
            int[] danoMagoAtaque = {60, 65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160,165, 170,175, 180, 185, 190};

            indice = aleatorio.nextInt(danoMagoAtaque.length);
            danoP1 = danoMagoAtaque[indice];
            barbaroCombate.darDanoP1(danoP1);
        } else if (player1 == 4 && player2 == 3) {
            int[] danoCavaleiroAtaque = {65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160};

            indice = aleatorio.nextInt(danoCavaleiroAtaque.length);
            danoP1 = danoCavaleiroAtaque[indice];
            barbaroCombate.darDanoP1(danoP1);
        } else if (player1 == 4 && player2 == 4) {
            int[] danoBarbaroAtaque = {70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160,165, 170,175, 180, 185, 190};

            indice = aleatorio.nextInt(danoBarbaroAtaque.length);
            danoP1 = danoBarbaroAtaque[indice];
            barbaroCombate.darDanoP1(danoP1);
        }


    }
}