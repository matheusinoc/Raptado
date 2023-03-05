package partes;

import trechos.Trechos;

public class FinalJogo {
    Trechos trecho = new Trechos();

    public void contarHistoria(String fim) {
        switch (fim) {
            case "Pena de Morte" -> {
                System.out.println(trecho.verAssassinoMorto());
                System.out.println("Vi que pela janela uma luz azul e vermelha estava lá fora. Me aproximei para ver." +
                        " Era a polícia.");
            }
            case "A Caça Vira o Caçador" -> {
                System.out.println(trecho.verAssassinoMorto());
                System.out.println("Agora o que me resta é sair dessa casa e procurar ajuda.");
            }
            case "Resgate" ->
                    System.out.println("Vi que pela janela uma luz azul e vermelha estava lá fora. Me aproximei para " +
                            "ver. Era a polícia. Eu, finalmente, estava salvo.");
            case "Como Solid Snake" -> {
                System.out.println("O barulho dele andando pelo corredor foi se afastando. Agora dava para eu passar" +
                        " pela janela. Atravessei, com cuidado. Andei devagarinho pelo telhado para não " +
                        "fazer barulho e pulei no chão de grama.");
                System.out.println(trecho.fugir());
                System.out.println("Quando já estava lá no morro, em uma parte um pouco alta, vi que o psicopata " +
                        "abriu a porta e olhou ao redor da casa. Mantive a calma, o máximo que eu podia. Eu" +
                        " já estava bem longe e bem escondido para esse psicopata conseguir me encontrar. Vi" +
                        " que ele começou a se desesperar. Ao ver que não me encontraria mais ele entrou na" +
                        " casa e ficou um bom tempo nela. Vendo que ele já não está no controle da situação," +
                        " decidi andar pela floresta em busca de ajuda.");
                System.out.println(trecho.finalFugirComSucesso());
            }
            case "Corra!", "Facada Para Fugir" -> {
                System.out.println("Continuei correndo pelo morro e depois pela floresta que havia atrás.");
                System.out.println(trecho.finalFugirComSucesso());
            }
            case "Morrer na Praia" ->
                    System.out.println("Não conseguia segurar o braço dele mais. Ele enfiou a faca no meu peito.");
            case "Facada Para Sobreviver" ->
                    System.out.println("Quando o bico da faca dele começou a entrar no meu peito, em uma atitude " +
                            "desesperada para viver, eu puxei meu facão e acertei bem forte na garganta dele, fazendo" +
                            " um corte profundo. Esse merda saiu de cima de mim e começou a se desbruçar no chão. " +
                            "Fiquei em pé, vendo-o morrer. E não me senti mal por isso, talvez um pouco, bem no " +
                            "fundo. Mas, de qualquer forma, isso me impactou. Acabei de matar um homem e minhas mãos" +
                            " estavam cheias de sangue... Decidi lavá-las no mar... Ainda bem que consegui " +
                            "sobreviver a tudo isso. Joguei a água gelada do mar no meu rosto. Depois, fui em busca" +
                            " de ajuda.");
            case "Como Suzie Salmon" ->
                    System.out.println(trecho.serMorto() + "Mas ninguém veio...");
            case "Tarde Demais" ->
                    System.out.println(trecho.serMorto() + "Mas não consegui aguentar...");
            case "Salvo Pela Polícia" ->
                    System.out.println("""
                            Quando senti a ponta da faca entrando no meu peito. Ouvi um barulho alto de sirene. Era a \
                            polícia!
                            Polícia: PARADO! LARGUE A ARMA E PONHA A MÃO NA CABEÇA AGORA! AFASTE-SE DO RAPAZ!
                            Se a polícia chegasse um pouco mais tarde eu estaria morto...""");
            case "Péssimas Escolhas" -> {
                System.out.println();
                System.out.println("Ele enfiou a faca no meu peito...");
            }
        }
    }
}
