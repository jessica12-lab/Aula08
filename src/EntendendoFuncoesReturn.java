import java.util.Scanner;

public class EntendendoFuncoesReturn {
    public static void saudacao( String nome){
    	System.out.println ("olá, " + nome + "!");
    	}
    
    public static int anoLancamento(int numeroFilme) {
    	switch(numeroFilme) {
    	case 1:
    		return 1999;
       	case 2: 
    		return 2002;
    	case 3:
    		return 2005;	
    	default: 
    		return -1;
    	}
    }
    public static String mensagemFilme(int filme) {
    	if (anoLancamento(filme)>0) {
    		return "o filme foi lançado em " + anoLancamento(filme);
    	}else {
    		return "nao conheço esse filme";
    	}
    }
    
	public static void main(String[] args) {
Scanner leitor = new Scanner (System.in);
int filme;
System.out.println("Informe o número do filme q você deseja saber o ano de lançamento");
leitor.nextInt();

//saudacao("Jessi");
int ano;
ano = anoLancamento(2);
int diferenca;
diferenca =  ano - 1995;
System.out.println("quando você nasceu, star wars ja tinha " + diferenca);

}

}
