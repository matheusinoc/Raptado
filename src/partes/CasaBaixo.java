package partes;

import personagem.Protagonista;
import trechos.Trechos;
import util.Util;

public class CasaBaixo {
    Util util = new Util();
    Trechos trecho = new Trechos();

    public void contarHistoria(Protagonista protagonista) {
        System.out.println("Quando saí do corredor me deparei com uma sala de espera com uma chaleira. Percebi que " +
                        "tinha marcas no chão da porta da qual eu acabara de passar e um armário com porta de " +
                        "vidro, com algumas taças e fotos dentro. Provavelmente, era usado para tampar a porta que, " +
                        "reparei agora, ficava debaixo de uma escada que levava ao andar de cima da casa. Espero " +
                        "conseguir escapar desse inferno.");

        if (protagonista.isPolicia()) {
            System.out.println("""
                    Meu celular vibrou. Era uma das minhas amigas que estava na festa junto comigo. Ela me mandou \
                    mensagem:
                    (Mensagem): Plmds vc tava na festa e do nd sumiu. Falaram que viram um carro levando vc, fiquei em \
                    duvida se era alguem q vc conhecia mas tudo foi mt suspeito, ainda mais com os casos de \
                    desaparecimento q acontecem por aki e vc n tinha falado nd q ia embora então chamei a policia ja \
                    tava procurando por vc assustada. - 01h56
                    (Mensagem): To com o policia aqui no carro procurando por você em colina. Ele pergunta se voce \
                    pode dar mais informações do lugar onde vc ta. Acha que é em uma casa, é mt velho? ouve barulho de \
                    carros ou outra coisa? - 01h57
                    Pelo visto ela recebeu minha mensagem. Respondi rápido:
                    Eu (pelo celular): É uma casa com porão escondido, tem uma chaminé e é um sobrado! Pfv vem rapido
                    Ela visualizou. Mas eu não podia ficar aqui parado trocando mensagens.""");
        }
        if (protagonista.isStealth()) {
            System.out.println("Com extremo cuidado para não fazer nenhum barulho eu andei em direção a porta da " +
                    "frente da casa. A sala onde eu estava ficava no lado esquerdo da escada, mas eu percebi que no" +
                    " lado direito tinha uma cozinha... e um velho lavando louça. Com certeza era ele, o psicopata!" +
                    " Era ele que tava fazendo barulho lavando a louça. O porão ficava bem abaixo da cozinha. " +
                    "Qualquer coisa que eu fosse fazer agora eu ia tomar o cuidado de fazer o mínimo de barulho" +
                    " possível.");
        } else {
            System.out.println("Também vi a porta da frente de casa. Eu corro pra onde?");
        }

        System.out.println("Agora eu tinha que tomar outra decisão: Sair pela porta ou subir ao andar de cima?");

        int escolha;
        escolha = util.escolher("Abrir a porta", "Subir as escadas");

        if (escolha == 1) {
            System.out.println("Não quero ficar nem mais um segundo sequer nesta bosta de casa. Fui em direção a " +
                            "porta e girei a maçaneta: Estava trancada. Merda! Não perdi tempo e fui subir as " +
                            "escadas.");

            if (protagonista.isLonge()) {
                protagonista.setLonge(false);
            } else {
                System.out.println(" ...");
                System.out.println("Mas o assassino estava na frente dela com uma faca.");

                if (protagonista.isStealth()) {
                    protagonista.setStealth(false);
                    System.out.println(trecho.introduzirPsicopata());
                }

                System.out.println("Ele veio em minha direção me atacar, em um reflexo bem rápido, eu meti o facão " +
                                "bem forte na cara dele. Ele gritou de dor e de raiva. A lâmina caiu do cabo do " +
                                "facão. Perdi o facão, mas agora não tinha mais nada o que fazer. Corri e subir as " +
                                "escadas com tudo enquanto ele me perseguia enfurecido logo atrás com a buchecha " +
                                "sangrando.");

                protagonista.setArma("nada");
            }
        } else {
            System.out.println("Não perdi tempo e fui subir as escadas.");
        }
    }
}
