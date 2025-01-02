package exercicios;

import java.util.Scanner;
public class Agenda
{
	public static void main(String[] args) {
		String [] nomes = new String [20];
		String [] telefones = new String[20];
		String [] emails = new String[20];
		int menu = 0;
        
        
		
		while(menu != 5) {
		
		System.out.println ("Bem Vindo Ao Menu");
		System.out.println ("1 - Incluir dados");
		System.out.println ("2 - Buscar dados e escrever");
		System.out.println ("3 - Excluir dados");
		System.out.println ("4 - Listar todos os dados"); 
		System.out.println("5 - Sair do menu");
		Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira o numero para menu");
        	menu = entrada.nextInt();
        	
			switch(menu) {
			
			case 1:
				System.out.println("Selecionado Incluir dados");
					nomes  = preencherVetorNomes(nomes);
					emails = preencherVetorEmails(emails);
					telefones = preencherVetorTelefones(telefones);
				break;
		
			case 2:
				System.out.println("Selecionado buscar dados e escrever escrever na tela");
					buscarEscreverDados(nomes, telefones, emails);
				break;
		
			case 3: 
				System.out.println("Selecionando excluir dados");
					excluirDadosDoVetor(nomes, emails, telefones, entrada);
				break;
			   
			
			case 4: 
				System.out.println("Listar todos os nomes");
					listarTodosOsDados(nomes, emails, telefones, entrada);
				break;
			case 5:
					System.out.println("Saindo...");
			}
		}
	}
	
	
	private static void listarTodosOsDados(String[] nomes, String[] emails, String[] telefones, Scanner entrada) {
		System.out.println("Vamos apresentador todos os dados");
		
		for(int i = 0; i<nomes.length; i++ ) {
			System.out.println(nomes[i]);
			System.out.println(emails[i]);
			System.out.println(telefones[i]);
		}
		
	}


	private static String[] preencherVetorTelefones(String[] telefones) {
		Scanner entrada = new Scanner(System.in);
		
		for ( int i = 0; i< telefones.length; i++) {
			System.out.println("Insira o telefone na posição " + (i+1));
			telefones [i] = entrada.next();
		}
		
		return telefones;
	}


	public static String[] preencherVetorNomes (String nomes[]  ) {
		
		for(int i =0; i <nomes.length; i++ ) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Insira os nomes na posição "+ (i+1));
			nomes[i] = entrada.next();
		}
		return nomes;
		
	}
	
	
	public static String[] preencherVetorEmails(String emails[]) {
		Scanner entrada = new Scanner(System.in);
		
		for(int i =0; i <emails.length; i++) {
			System.out.println("Insira os email na posição " +(i+1));
			emails[i] = entrada.next();
		}
		
		return emails;
		
	}
	
	
	public static void buscarEscreverDados(String nomes[], String emails[], String telefones[]) {
		Scanner entrada = new Scanner(System.in);
		String nomeSelecionado;
		System.out.println("Entre com o nome que vc quer buscar");
		nomeSelecionado = entrada.next();
		boolean encontrar = false;
		
		for(int i = 0; i< nomes.length; i++) {
		
			if (nomes[i].equals(nomeSelecionado)) {
				System.out.println("Esse é o nome selecionado" + nomes[i]);
				System.out.println("Esse é o telefone do nome selecionado" + telefones[i]);
				System.out.println("Esse é o email do nome selecionado" + emails[i]);
				encontrar= true;
				
			} 
		}
		if (encontrar == false) {
			System.out.println("Infelizmente nao achamos o nome que você queria");
		}
			
		
	}
	
	public static void excluirDadosDoVetor(String nomes[], String emails[], String telefones[], Scanner entrada) {
		System.out.println("Qual elemento vc quer remover ? ");
		String nomeEliminar = entrada.next();
		int localizaçãoNomeEliminar = -1;
		boolean encontrar = false;
		
		for(int i = 0; i< nomes.length; i++) {
		
			if (nomes[i].equals(nomeEliminar)) {
				localizaçãoNomeEliminar = i;
				encontrar = true;
				break;
				
			} 
		}
		
		
		
		if (encontrar == false) {
			System.out.println("Infelizmente nao encontramos o dado");
		}
		
		
		
		
		for(int i= localizaçãoNomeEliminar; i<= nomes.length - 1; i++) {
				nomes[i] = nomes[i+1];
				emails[i] = emails[i+1];
				telefones[i] = telefones[i+1];
<<<<<<< HEAD
		
			}
		
	}
}
=======
		}
		
	}
}
>>>>>>> 136e2da562469a4b657e0d66c343942cf5ec014a
