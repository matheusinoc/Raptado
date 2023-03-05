package partes;

import personagem.Protagonista;
import trechos.Trechos;
import util.Util;

public class CasaCima {
    Util util = new Util();
    Trechos trecho = new Trechos();
    String fim;

    public String contarHistoria(Protagonista protagonista) {
        if (protagonista.isStealth()) {
            System.out.println("Eu tinha subido a escada com o máximo de silêncio possível. Mas, mesmo assim, fiquei" +
                    " com a impressão que ele podia ter ouvido enquanto subia, pois o barulho da pia parou. Ouvi " +
                    "passos na escada. Fudeu.");
        } else {
            System.out.println("Desesperado, subi as escadas o mais rápido que pude.");

            if (protagonista.isLonge()) {
                System.out.println("Ainda bem que o assassino estava um pouco longe, mas mesmo assim, minha " +
                        "adrenalina estava a mil por hora.");
            } else {
                System.out.println("Com o assassino na minha cola.");
            }
        }

        System.out.println("Fui em direção a uma porta que tinha no fim do corredor do andar de cima. Passei pela " +
                "porta e agora tinha que tomar uma decisão. Havia uma janela no quarto que dava a um telhado que " +
                "cobria a varanda.");

        if (protagonista.isPolicia()) {
            System.out.println("Fiquei com a impressão de ter ouvido bem longe uma sirene de polícia... Mas, enfim, " +
                    "eu ainda tenho que tentar sair daqui vivo antes de tudo.");
        }

        int escolha;

        if (protagonista.isStealth()) {
            System.out.println("Eu poderia até sair pela janela, mas, provavelmente, esse psicopata vai dar uma " +
                            "olhada nela. Então esquece. Dando uma olhada rápida pelo quarto, que aliás, é lotado de" +
                            " quadros, estátuas e símbolos religiosos, acho que posso me esconder atrás da porta. E" +
                            " é o que eu vou fazer. É o melhor lugar para eu me esconder. Então fiquei atrás da " +
                            "porta. Ouvi o andar dele se aproximar cada vez mais. Eu estava muito tenso. Se ele " +
                            "quisesse fechar a porta com a maçaneta do lado de dentro do quarto eu seria descoberto." +
                            " Até que ele passou pela porta. E como eu previ, ele foi direto para a janela, a abriu " +
                            "e olhou pelo lado de fora. Se eu quisesse fazer uma coisa. A hora era agora. Ele está" +
                            " totalmente vulnerável e descuidado. Eu poderia meter o facão bem no pescoço dele, " +
                            "facilmente. Ou será que é muito arriscado? Mas e se ele resolvesse olhar atrás da porta" +
                            " depois? Se eu for fazer alguma coisa tenho que fazer nesse exato momento.");

            escolha = util.escolher("Atacá-lo", "Permanecer escondido");

            System.out.println("Eu não podia arriscar desse psicopata me matar.");

            if (escolha == 1) {
                System.out.println("Então fiz o que tinha que fazer. Quando esse desgraçado tirou a cabeça da janela." +
                        " Eu meti o facão no pescoço dele. Foda-se. Eu vi ele olhando pra mim assustado, caindo no " +
                        "chão com a mão cheia de sangue segurando a ferida. Fiquei chocado. Nunca tinha feito nada " +
                        "perto disso. Que sensação horrível e ao mesmo tempo tranquilizadora por saber que ele não " +
                        "pode mais me fazer nenhum mal. Enquanto ele morria me dizia com voz fraca:");

                if (protagonista.isPolicia()) {
                    fim = "Pena de Morte";
                } else {
                    fim ="A Caça Vira o Caçador";
                }
            } else {
                System.out.println("""
                        Vou ficar aqui. Quando esse desgraçado tirou a cabeça de janela, eu ouvi ele vindo em direção \
                        a porta e conversando sozinho:
                        Psicopata: Deve ter sido aquele imundo lá em baixo. Tenho que tomar cuidado. O barulho tá \
                        indo muito longe, acho que ta na hora de dar um jeito naquele moleque.
                        Ele sai do quarto e fecha a porta por fora.""");

                if (protagonista.isPolicia()) {
                    fim = "Resgate";
                } else {
                    fim = "Como Solid Snake";
                }
            }
        } else {
            System.out.println("Deveria arriscar pular com tudo pela janela ou deveria passar cuidadosamente, porém " +
                    "um pouco lento?");
            escolha = util.escolher("Passar, cuidadosamente", "Passar, rapidamente");

            if (protagonista.isLonge()) {
                if (escolha == 1) {
                    System.out.println(trecho.passarCuidadosamente());
                    System.out.println(trecho.fugirSemStealth());
                    System.out.println(trecho.fugirComSucesso());
                    fim = "Corra!";
                } else {
                    System.out.println(trecho.passarRapidamente());
                    System.out.println(trecho.fugirSemStealth());
                    System.out.println(trecho.serPego());
                    fim = "Morrer na Praia";
                }
            } else {
                if (protagonista.getArma().equals("facão")) {
                    if (escolha == 1) {
                        System.out.println("Tentei passar tomando cuidado, mas vi que o psicopata iria me esfaquear. Com " +
                                "o reflexo rápido eu peguei o facão e atingi a cara dele bem forte. Tão forte que" +
                                " a lâmina saiu. Com ele atordoado tive tempo de passar pela janela.");
                        System.out.println(trecho.passarCuidadosamente());
                        System.out.println(trecho.fugirSemStealth());
                        System.out.println(trecho.fugirComSucesso());
                        fim = "Facada Para Fugir";
                    } else {
                        System.out.println(trecho.passarRapidamente());
                        System.out.println(trecho.fugirSemStealth());
                        System.out.println(trecho.serPego());
                        fim = "Facada Para Sobreviver";
                    }
                } else if (protagonista.getArma().equals("nada")) {
                    if (escolha == 1) {
                        System.out.println("Tentei passar tomando cuidado, mas ele me alcançou. Tentei me desvincilhar," +
                                " mas ele rapidamente fez um corte enorme no meu pescoço e me puxou para dentro do " +
                                "quarto. Estava me desbruçando pelo chão, enquanto ele, com aquele olhar frio, me " +
                                "encarava e dizia:");

                        if (protagonista.isPolicia()) {
                            fim = "Tarde Demais";
                        } else {
                            fim = "Como Suzie Salmon";
                        }

                    } else {
                        System.out.println(trecho.passarRapidamente());
                        System.out.println(trecho.fugirSemStealth());
                        System.out.println(trecho.serPego());
                        if (protagonista.isPolicia()) {
                            fim = "Salvo Pela Polícia";
                        } else {
                            fim = "Péssimas Escolhas";
                        }
                    }
                }
            }
        }
        System.out.println("Psicopata: Pecador. Pecador cheio de maldade...");
        return fim;
    }
}
