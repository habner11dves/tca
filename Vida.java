

public class Vida {

    final static CombateSamurai samuraiCombate = new CombateSamurai();
    final static CombateMago magoCombate = new CombateMago();
    final static CombateCavaleiro cavaleiroCombate = new CombateCavaleiro();
    final static CombateBarbaro barbaroCombate = new CombateBarbaro();
    final static Samurai samurai = new Samurai();
    final static Mago mago = new Mago();
    final static Cavaleiro cavaleiro = new Cavaleiro();
    final static Barbaro barbaro = new Barbaro();
    final static Botoes botao = new Botoes();

    public static void main(String[] args, int player1, int player2) throws InterruptedException {
        int vidaAtual1;
        int vidaAtual2;
        while (true) {
            if (player1 == 1 && player2 == 1) { // Samurai VS Samurai
                vidaAtual1 = samuraiCombate.mostrarBarraP1();
                vidaAtual2 = samuraiCombate.mostrarBarraP2();
                if (vidaAtual1 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.perdeu();
                    break;
                } else if (vidaAtual2 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.venceu();
                    break;
                }
                limparTela();
                vidaAtual1 = samuraiCombate.mostrarBarraP1();
                System.out.println();
                vidaAtual2 = samuraiCombate.mostrarBarraP2();
                System.out.println();
                samurai.samuraiSamurai();
                botao.samuraiBotoes(player1, player2);
            } else if (player1 == 1 && player2 == 2) { // Samurai VS Mago
                vidaAtual1 = samuraiCombate.mostrarBarraP1();
                vidaAtual2 = magoCombate.mostrarBarraP2();
                if (vidaAtual1 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.perdeu();
                    break;
                } else if (vidaAtual2 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.venceu();
                    break;
                }
                limparTela();
                vidaAtual1 = samuraiCombate.mostrarBarraP1();
                System.out.println();
                vidaAtual2 = magoCombate.mostrarBarraP2();
                System.out.println();
                samurai.samuraiMago();
                botao.samuraiBotoes(player1, player2);
            } else if (player1 == 1 && player2 == 3) { // Samurai VS Cavaleiro
                vidaAtual1 = samuraiCombate.mostrarBarraP1();
                vidaAtual2 = cavaleiroCombate.mostrarBarraP2();
                if (vidaAtual1 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.perdeu();
                    break;
                } else if (vidaAtual2 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.venceu();
                    break;
                }
                limparTela();
                vidaAtual1 = samuraiCombate.mostrarBarraP1();
                System.out.println();
                vidaAtual2 = cavaleiroCombate.mostrarBarraP2();
                System.out.println();
                samurai.samuraiCavaleiro();
                botao.samuraiBotoes(player1, player2);
            } else if (player1 == 1 && player2 == 4) { // Samurai VS Barbaro
                vidaAtual1 = samuraiCombate.mostrarBarraP1();
                vidaAtual2 = barbaroCombate.mostrarBarraP2();
                if (vidaAtual1 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.perdeu();
                    break;
                } else if (vidaAtual2 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.venceu();
                    break;
                }
                limparTela();
                vidaAtual1 = samuraiCombate.mostrarBarraP1();
                System.out.println();
                vidaAtual2 = barbaroCombate.mostrarBarraP2();
                System.out.println();
                samurai.samuraiBarbaro();
                botao.samuraiBotoes(player1, player2);
            } else if (player1 == 2 && player2 == 1) { // Mago VS Samurai
                vidaAtual1 = magoCombate.mostrarBarraP1();
                vidaAtual2 = samuraiCombate.mostrarBarraP2();
                if (vidaAtual1 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.perdeu();
                    break;
                } else if (vidaAtual2 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.venceu();
                    break;
                }
                limparTela();
                vidaAtual1 = magoCombate.mostrarBarraP1();
                System.out.println();
                vidaAtual2 = samuraiCombate.mostrarBarraP2();
                System.out.println();
                mago.magoSamurai();
                botao.magoBotoes(player1, player2);
            } else if (player1 == 2 && player2 == 2) { // Mago VS Mago
                vidaAtual1 = magoCombate.mostrarBarraP1();
                vidaAtual2 = magoCombate.mostrarBarraP2();
                if (vidaAtual1 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.perdeu();
                    break;
                } else if (vidaAtual2 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.venceu();
                    break;
                }
                limparTela();
                vidaAtual1 = magoCombate.mostrarBarraP1();
                System.out.println();
                vidaAtual2 = magoCombate.mostrarBarraP2();
                System.out.println();
                mago.magoMago();
                botao.magoBotoes(player1, player2);
            } else if (player1 == 2 && player2 == 3) { // Mago VS Cavaleiro
                vidaAtual1 = magoCombate.mostrarBarraP1();
                vidaAtual2 = cavaleiroCombate.mostrarBarraP2();
                if (vidaAtual1 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.perdeu();
                    break;
                } else if (vidaAtual2 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.venceu();
                    break;
                }
                limparTela();
                vidaAtual1 = magoCombate.mostrarBarraP1();
                System.out.println();
                vidaAtual2 = cavaleiroCombate.mostrarBarraP2();
                System.out.println();
                mago.magoCavaleiro();
                botao.magoBotoes(player1, player2);
            } else if (player1 == 2 && player2 == 4) { // Mago VS Barbaro
                vidaAtual1 = magoCombate.mostrarBarraP1();
                vidaAtual2 = barbaroCombate.mostrarBarraP2();
                if (vidaAtual1 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.perdeu();
                    break;
                } else if (vidaAtual2 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.venceu();
                    break;
                }
                limparTela();
                vidaAtual1 = magoCombate.mostrarBarraP1();
                System.out.println();
                vidaAtual2 = barbaroCombate.mostrarBarraP2();
                System.out.println();
                mago.magoBarbaro();
                botao.magoBotoes(player1, player2);
            } else if (player1 == 3 && player2 == 1) { // Cavaleiro VS Samurai
                vidaAtual1 = cavaleiroCombate.mostrarBarraP1();
                vidaAtual2 = samuraiCombate.mostrarBarraP2();
                if (vidaAtual1 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.perdeu();
                    break;
                } else if (vidaAtual2 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.venceu();
                    break;
                }
                limparTela();
                vidaAtual1 = cavaleiroCombate.mostrarBarraP1();
                System.out.println();
                vidaAtual2 = samuraiCombate.mostrarBarraP2();
                System.out.println();
                cavaleiro.cavaleiroSamurai();
                botao.cavaleiroBotoes(player1, player2);
            } else if (player1 == 3 && player2 == 2) { // Cavaleiro VS Mago
                vidaAtual1 = cavaleiroCombate.mostrarBarraP1();
                vidaAtual2 = magoCombate.mostrarBarraP2();
                if (vidaAtual1 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.perdeu();
                    break;
                } else if (vidaAtual2 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.venceu();
                    break;
                }
                limparTela();
                vidaAtual1 = cavaleiroCombate.mostrarBarraP1();
                System.out.println();
                vidaAtual2 = magoCombate.mostrarBarraP2();
                System.out.println();
                cavaleiro.cavaleiroMago();
                botao.cavaleiroBotoes(player1, player2);
            } else if (player1 == 3 && player2 == 3) { // Cavaleiro VS Cavaleiro
                vidaAtual1 = cavaleiroCombate.mostrarBarraP1();
                vidaAtual2 = cavaleiroCombate.mostrarBarraP2();
                if (vidaAtual1 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.perdeu();
                    break;
                } else if (vidaAtual2 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.venceu();
                    break;
                }
                limparTela();
                vidaAtual1 = cavaleiroCombate.mostrarBarraP1();
                System.out.println();
                vidaAtual2 = cavaleiroCombate.mostrarBarraP2();
                System.out.println();
                cavaleiro.cavaleiroCavaleiro();
                botao.cavaleiroBotoes(player1, player2);
            } else if (player1 == 3 && player2 == 4) { // Cavaleiro VS Barbaro
                vidaAtual1 = cavaleiroCombate.mostrarBarraP1();
                vidaAtual2 = barbaroCombate.mostrarBarraP2();
                if (vidaAtual1 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.perdeu();
                    break;
                } else if (vidaAtual2 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.venceu();
                    break;
                }
                limparTela();
                vidaAtual1 = cavaleiroCombate.mostrarBarraP1();
                System.out.println();
                vidaAtual2 = barbaroCombate.mostrarBarraP2();
                System.out.println();
                cavaleiro.cavaleiroBarbaro();
                botao.cavaleiroBotoes(player1, player2);
            } else if (player1 == 4 && player2 == 1) { // Barbaro VS Samurai
                vidaAtual1 = barbaroCombate.mostrarBarraP1();
                vidaAtual2 = samuraiCombate.mostrarBarraP2();
                if (vidaAtual1 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.perdeu();
                    break;
                } else if (vidaAtual2 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.venceu();
                    break;
                }
                limparTela();
                vidaAtual1 = barbaroCombate.mostrarBarraP1();
                System.out.println();
                vidaAtual2 = samuraiCombate.mostrarBarraP2();
                System.out.println();
                barbaro.barbaroSamurai();
                botao.barbaroBotoes(player1, player2);
            } else if (player1 == 4 && player2 == 2) { // Barbaro Vs Mago
                vidaAtual1 = barbaroCombate.mostrarBarraP1();
                vidaAtual2 = magoCombate.mostrarBarraP2();
                if (vidaAtual1 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.perdeu();
                    break;
                } else if (vidaAtual2 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.venceu();
                    break;
                }
                limparTela();
                vidaAtual1 = barbaroCombate.mostrarBarraP1();
                System.out.println();
                vidaAtual2 = magoCombate.mostrarBarraP2();
                System.out.println();
                barbaro.barbaroMago();
                botao.barbaroBotoes(player1, player2);
            } else if (player1 == 4 && player2 == 3) { // Barbaro VS Cavaleiro
                vidaAtual1 = barbaroCombate.mostrarBarraP1();
                vidaAtual2 = cavaleiroCombate.mostrarBarraP2();
                if (vidaAtual1 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.perdeu();
                    break;
                } else if (vidaAtual2 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.venceu();
                    break;
                }
                limparTela();
                vidaAtual1 = barbaroCombate.mostrarBarraP1();
                System.out.println();
                vidaAtual2 = cavaleiroCombate.mostrarBarraP2();
                System.out.println();
                barbaro.barbaroCavaleiro();
                botao.barbaroBotoes(player1, player2);
            } else { // Barbaro VS Barbaro
                vidaAtual1 = barbaroCombate.mostrarBarraP1();
                vidaAtual2 = barbaroCombate.mostrarBarraP2();
                if (vidaAtual1 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.perdeu();
                    break;
                } else if (vidaAtual2 == 0) {
                    limparTela();
                    Thread.sleep(1500);
                    PerdeuGanhou.venceu();
                    break;
                }
                limparTela();
                vidaAtual1 = barbaroCombate.mostrarBarraP1();
                System.out.println();
                vidaAtual2 = barbaroCombate.mostrarBarraP2();
                System.out.println();
                barbaro.barbaroBarbaro();
                botao.barbaroBotoes(player1, player2);
            }
        }
    }

    public static void limparTela() { // Metodo para limpar o terminal
        for (int i = 0; i < 40; ++i) {
            System.out.println();
        }
        System.out.print("\033\143");

    }
}