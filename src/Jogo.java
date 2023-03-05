import partes.CasaBaixo;
import partes.CasaCima;
import partes.FinalJogo;
import partes.Porao;
import personagem.Protagonista;
import trechos.FinalRelatorio;
import util.Util;

public class Jogo {
    private final Util util = new Util();
    private final Protagonista protagonista = new Protagonista();
    private final Porao porao = new Porao();
    private final CasaBaixo casaBaixo = new CasaBaixo();
    private final CasaCima casaCima = new CasaCima();
    private final FinalJogo finalJogo = new FinalJogo();
    private final FinalRelatorio finalRelatorio = new FinalRelatorio();

    public void start() {
        util.addLinhaVazia(1);
        System.out.println("Você acorda em um lugar estranho. Não se lembra de como foi parar nele. E sente que " +
                "alguém pode fazer muito mal a você se não tomar nenhuma atitude para fugir.");
        util.addLinhaVazia(2);
        System.out.println("  __________________________  ");
        System.out.println(" /                          \\ ");
        System.out.println(" |         RAPTADO          | ");
        System.out.println(" |                          | ");
        System.out.println(" |   de Matheus Inocêncio   | ");
        System.out.println(" \\__________________________/ ");
        util.addLinhaVazia(2);

        porao.contarHistoria(protagonista);

        String fim;
        if (protagonista.isVivo()) {
            casaBaixo.contarHistoria(protagonista);
            fim = casaCima.contarHistoria(protagonista);
        } else {
            fim = "Final Horrível";
        }

        finalJogo.contarHistoria(fim);
        util.addLinhaVazia(3);
        finalRelatorio.contarHistoria(fim);
        util.addLinhaVazia(1);
    }
}
