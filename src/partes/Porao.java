package partes;

import personagem.Protagonista;
import trechos.Trechos;
import util.Util;

public class Porao {
    Util util = new Util();
    Trechos trecho = new Trechos();
    
    public void contarHistoria(Protagonista protagonista) {
        System.out.println("Acabei de acordar em um quarto. Não sei como apareci aqui. Não me lembro de nada. O que " +
                "aconteceu? E por que estou amarrado? Puta merda. Isso só pode ser um sequestro. Estou " +
                "observando o quarto em que estou, mas parando pra pensar, isso aqui deve ser um porão. É " +
                "muito abafado e só tem uma lâmpada encandecente pra iluminar. Merda. Tem uns equipamentos " +
                "horríveis aqui: serras, faca e outras coisas cortantes. Todas velhas e sujas. Será que " +
                "consigo sair daqui por conta própria? E se quem me botou aqui aparecer do nada? Estou com " +
                "muito medo. Me encontro deitado em uma espécie de mesa enorme de trabalho. Neste porão há " +
                "muitas coisas que parecem ser de um carpinteiro. Minhas mãos e pés estão amarrados com " +
                "cordas que vêm de cada ponta da mesa e minha cintura está presa nela com um arame enfarpado." +
                " Que horror! Eu não quero morrer aqui! Cada vez mais fico desesperado. Chegou a hora de " +
                "tomar algumas decisões aqui. Minha cintura dói, mas acho que consigo alcançar com a parte " +
                "superior do meu corpo um facão ou gilete que estão em cima de um armáriozinho perto da mesa." +
                " Dá pra eu pegar com a boca. Devo me arriscar? Percebi duas coisas que podem me ajudar a " +
                "decidir o que fazer. A primeira é que desde que eu despertei, estou ouvindo um barulho de " +
                "alguns passos no teto. Deve ser o filho da puta que me colocou aqui. Talvez ele apareça bem " +
                "na hora que eu estiver pegando. Porém, a segunda observação é que ele até agora não apareceu," +
                " mesmo com esse barulho, e tem manchas de sangue seco na mesa. Talvez se eu não fizer nada " +
                "eu vire mais uma vítima. E agora, o que eu faço?");

        int escolha;
        escolha = util.escolher("Tentar pegar a gilete ou o facão", "Não fazer nada por enquanto");
        if (escolha == 1) {
            protagonista.setArma("facão");
            System.out.println("Certo! Eu vou tentar pegar. Como acho que o facão vai ser melhor, eu vou tentar " +
                    "pegá-lo com a boca. Consegui! Soltei-o com cuidado na minha mão. Cortei a corda de uma " +
                    "das mãos e depois pude cortar todas as outras. Com muito esforço saí do arame enfarpado." +
                    " Evitando fazer barulho, me retirei da mesa. Estava livre e com uma faca! Lá em cima o" +
                    " barulho continuava, mas parecia ter diminuido mais. Já estou armado com um facão. Será" +
                    " que vale a pena investigar rapidamente o local ou devo sair desse porão o mais rápido" +
                    " possível sendo discreto ao mesmo tempo?");

            escolha = util.escolher("Sair", "Investigar");
            if (escolha == 1) {
                System.out.println("Melhor sair o quanto antes mesmo.");
            } else {
                protagonista.setLonge(false);
                protagonista.setPolicia(true);
                System.out.println("Fui investigar. Em questão de armas, não tinha nenhuma melhor que o facão que eu" +
                        " tenho. Na verdade, até tem, mas são coisas que precisam de tomada pra funcionar então é " +
                        "inútil. Achei que tinha perdido tempo vendo até que achei meu celular guardado em um " +
                        "armário. Tentei ligar para a polícia, obviamente, foi em vão, meu desespero é tão grande " +
                        "que esqueci que estava em um porão. Então liguei os dados móveis. E mandei mensagem sobre " +
                        "essa situação para um montão de gente, a mensagem não foi enviada, mas se eu saísse daquele" +
                        " porão ela seria.");
            }

            System.out.println("Então passei pela porta que tinha e comecei a subir as escadas de um corredor escuro " +
                    "e baixo que levava a saída daquela porra de porão. Enquanto fazia isso eu me lembrava das " +
                    "coisas. Eu tava em uma festa, acho que já ia voltar pra casa quando... Ele me raptou... Minhas " +
                    "memórias estão todas embaralhadas.");
        } else {
            protagonista.setStealth(false);
            System.out.println("""
                    Melhor não fazer nada. O risco seria alto demais. Vai que ele me pega no flagra. Vou ficar quieto...
                    ...
                    Será que tomei a decisão certa? Dava pra eu ter feito alguma coisa durante o tempo que eu tô""" +
                    " esperando... Puta merda! O barulho de cima parou e eu acho que comecei a ouvir um barulho " +
                    "distante vindo da porta. Deve ser ele! Estou com muito medo! Acho que devia ter feito alguma " +
                    "coisa. Sinto que ele está vindo! Mas acho que ainda tenho tempo pra fazer algo! Ou seria " +
                    "arriscado demais? E se eu pegasse a gilete ou o facão e tentasse cortar as cordas? Mas tenho tão" +
                    " pouco tempo que não daria nem pra cortar sequer uma corda. Pelo menos não com a mão amarrada. " +
                    "Mas, se eu cortar um pouco a corda e esconder a arma... Acho que dá, mas seria meio arriscado, " +
                    "mas talvez seria melhor do que ficar totalmente a mercê dele. Mas se ele descobrir que fiz " +
                    "isso... Devo arriscar?");
            
            escolha = util.escolher("Arriscar pegar arma", "Não arriscar");
            if (escolha == 1) {
                System.out.println("Ok. Vou arriscar, foda-se! Tenho pouco tempo. Pego o facão ou a gilete?");
                
                escolha = util.escolher("Facão", "Gilete");
                        
                if (escolha == 1) {
                    protagonista.setArma("facão");
                    System.out.println("Peguei o facão.");
                } else {
                    protagonista.setArma("gilete");
                    System.out.println("Peguei a gilete.");
                }
                System.out.println("Comecei a cortar a corda até que ouvi que ele estava perto demais da porta. Parei" +
                        " de cortar e escondi a arma.");
            } else {
                System.out.println("Esquece! Ele poderia ver eu fazendo isso. Aí é que eu estaria morto sem sombra de" +
                        " dúvidas. Escuto ele se aproximar cada vez mais.");
            }

            System.out.println("Ele abre a porta. É um idoso com óculos, mas em boa forma. Começa a olhar pra mim e " +
                            "vejo que ele vai falar alguma coisa:");
            System.out.println(trecho.introduzirPsicopata());
            System.out.println("Ele começou a andar pelo lugar e foi em direção àquele armáriozinho. O psicopata " +
                            "olhou pra ele.");

            if (protagonista.getArma().equals("facão")) {
                protagonista.setVivo(false);
                System.out.println("""
                        Psicopata: Cadê o facão?
                        Meu Deus. Eu devia ter me tocado que ele perceberia o sumiço de um arma daquele tamanho.
                        Psicopata: Filho da puta.
                        Ele pegou com brutalidade o facão que eu escondi deitando em cima.""");
            } else {
                System.out.println("Ele afastou o facão de mim. Ainda bem. Que susto eu tomei agora. Se eu tivesse " +
                        "pego a faca eu estaria totalmente ferrado porque ele teria percebido. Ele continuou" +
                        " andando ao redor da mesa. Vi ele pegando uma faca bem limpa em uma gaveta.\n" +
                        "Psicopata: É meu jovem, infelizmente, esse é o destino que você traçou. Que deus " +
                        "tenha piedade de você, mas sendo sincero, eu não sei se vai. E nem adianta gritar. Eu " +
                        "tranquei a porta lá em cima. Ninguém vai te escutar. Ninguém vai te salvar.");
            }

            if (protagonista.getArma().equals("gilete")) {
                System.out.println("Ele está andando de costas pra mim agora. Eu poderia tentar cortar a corda com a" +
                                " gilete discretamente e se eu conseguisse, pegaria o facão e assim teria uma forma " +
                                "de me defender, e com o facão seria bem mais rápido cortar as cordas que restam. " +
                                "Acho que dá pra alcançar o facão com uma mão solta. Mas e se não der tempo de " +
                                "conseguir fazer tudo isso? Estou desesperado. Eu poderia também começar a implorar" +
                                " pra ele não me matar. Começar a chorar ou sei lá o que, ele poderia ficar com dó " +
                                "de mim... A corda do jeito que está pode rapidamente ser cortada. Mas esse plano " +
                                "pode não dá certo por causa das outras cordas. Ele levantou a arma pra cima com " +
                                "intenção de me matar. É agora! Tenho que pensar rápido!");

                escolha = util.escolher("Cortar", "Implorar");
            }

            if (escolha == 2) {
                protagonista.setVivo(false);
            }
        }

        if (!protagonista.isVivo()) {
            System.out.println("Eu: POR FAVOR! NÃO FAÇA ISSO!\n" +
                    "Essas foram minhas últimas palavras... nem deu tempo de falar mais. Ele começou a me esfaquear" +
                    " em todas as partes do meu corpo. Enquanto eu gritava e ninguém me ouvia.");
        }

        if (protagonista.isVivo() && !protagonista.isStealth()) {
            System.out.println("No desespero que eu estava, cortei a corda com tudo! Foda-se se eu cortei a mão com " +
                            "a gilete. Já tô lascado de qualquer forma. Peguei o facão e tentei acertar esse velho " +
                            "miserável dos infernos. Ele se afastou rápido demais, pois não esperava por isso. Com " +
                            "o susto ele se desequilibrou e caiu. Com isso tive tempo de, rapidamente, cortar a " +
                            "corda que amarrava minha outra mão e as que amarravam os pés. O velho se levantou e " +
                            "agora só faltava tirar a merda do arame na minha cintura que me prendia a mesa. Eu " +
                            "posso usar a faca e sair rápido da mesa, mas a lâmina ficou meio solta, se eu usasse " +
                            "o facão, iria perdê-lo. Ou então, eu me retiraria sozinho, acho que consigo, " +
                            "permaneceria com o facão, mas perderia tempo. Em qualquer situação, acho que consigo" +
                            " escapar do porão. Mas, e aí? Qual sacrifícil devo fazer?");

            escolha = util.escolher("Ganhar tempo e perder facão\n (Assassino longe enquanto fujo)",
                    "Manter facão e perder tempo\n (Tenho uma forma de me defender)");

            if (escolha == 1) {
                protagonista.setArma("nada");
                protagonista.setLonge(true);
                System.out.println("Não importa as outras outras coisas. Tenho que sair daqui o mais rápido que " +
                        "puder. Com toda força eu usei o facão pra cortar o arame. E consegui, mas na hora de " +
                        "levantar o facão, a lâmina ficou grudada na mesa e o cabo na minha mão. Mas não importa " +
                        "mais. Corri com tudo em direção a porta. O psicopata tentou ir pra minha frente, mas " +
                        "consegui correr a tempo de ele não me pegar.");
            } else {
                protagonista.setArma("facão");
                protagonista.setLonge(false);
                System.out.println("Machucando minha cintura e minhas pernas, resolvi sair me arrastando pelo arame." +
                        " Tava com as pernas bem doloridas, mas minha adrenalina era tanta que nem me importei. " +
                        "Corri com tudo em direção a porta. O psicopata tentou ir pra minha frente, mas o afastei um" +
                        " pouco tentando o acertar com meu facão. Então passei pela porta que tinha e comecei a subir" +
                        " as escadas de um corredor escuro e baixo que levava a saída daquela porra de porão. " +
                        "Enquanto aquele velho filho da puta me perseguia.");
            }
        }
    }
}
