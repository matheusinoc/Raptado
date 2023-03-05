package util;

import java.util.Scanner;

public class Util {
    Scanner sc = new Scanner(System.in);  
    
    public void addLinhaVazia(int q) {
	    for (int i = 0; i < q; i++) System.out.println();
    }

    public int escolher(String escolha1, String escolha2) {
	    addLinhaVazia(1);
	    int escolha = 0;
	    while (escolha != 1 && escolha != 2) {
	    	System.out.println("Digite 1 ou 2 e depois ENTER para tomar decisões.");
	    	System.out.println(" 1 = " + escolha1);
	    	System.out.println(" 2 = " + escolha2);
	    	escolha = sc.nextInt();
	    	addLinhaVazia(1);
        }
        return escolha;
    }
}
