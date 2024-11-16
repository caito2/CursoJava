package jogo;
import java.util.Iterator;
import java.util.Scanner;
public abstract class JogoDaVelha {

	public static void main(String[] args) {
		char oJogo [] [] = {{'1','2','3'}, {'4','5','6'},{'7','8','9'}};
		int jogada = 0, posição ;
		boolean vencedor = false;
		Scanner entrada = new Scanner(System.in);
		while (jogada < 9) {
			
			printarJogoDaVelha(oJogo);
			System.out.println("Vamos começar com o X");
			System.out.println("Entre com a posição que vc quer jogar");
			posição = entrada.nextInt();
			marcarposiçãoX (oJogo,posição);
			
			
			vencedor = verificarVencedor(oJogo,vencedor);
			if ( vencedor == true) {
				System.out.println("Jogador do X venceu o jogo !!");
				break;
				
			}
			jogada++;
			printarJogoDaVelha(oJogo);
			System.out.println("Agora vamos com o bolinha");
			posição = entrada.nextInt();
			marcarposiçãoO (oJogo, posição);
			

			
			vencedor = verificarVencedor(oJogo,vencedor);
			if ( vencedor) {
				System.out.println("Jogador do bolinha venceu o jogo !!");
				break;
				
			} jogada++;
			}
			
		}



	public static void printarJogoDaVelha(char oJogo[][]) {
		for (int i = 0; i < oJogo.length; i++) {
			for (int j = 0; j < oJogo.length; j++) {
				System.out.print(oJogo[i][j] + " "); 
			}
			System.out.println("");
		}
		System.out.println("");
	}
	

	 public static boolean verificarVencedor(char[][] jogo, boolean vencedor) {
	        
	        for (int i = 0; i < 3; i++) {
	            if (jogo[i][0] == jogo[i][1] && jogo[i][1] == jogo[i][2]) return vencedor = true;
	            if (jogo[0][i] == jogo[1][i] && jogo[1][i] == jogo[2][i]) return  vencedor =true;
	        }
	        if (jogo[0][0] == jogo[1][1] && jogo[1][1] == jogo[2][2]) return vencedor = true;
	        if (jogo[0][2] == jogo[1][1] && jogo[1][1] == jogo[2][0]) return vencedor =true;
	        return false;
	    }

	public static void marcarposiçãoX (char oJogo [][], int posição) {
		 switch (posição) {
		case 1:
			 oJogo[0][0]= 'x';
			break;
			
		case 2:
			oJogo[0][1]= 'x';
			break;
			
		case 3:
			oJogo[0][2]= 'x';
			break;
			
		case 4:
			oJogo[1][0]= 'x';
			break;
		case 5:
			oJogo[1][1]= 'x';
			break;
		case 6:
			oJogo[1][2]= 'x';
			break;
		case 7:
			oJogo[2][0]= 'x';
			break;
		case 8:
			oJogo[2][1]= 'x';
			break;
		case 9:
			oJogo[2][2]= 'x';
			break;
		default:
			break;
		}
		
	}
	public static void marcarposiçãoO (char oJogo [][], int posição) {
		 switch (posição) {
		case 1:
			 oJogo[0][0]= 'o';
			break;
			
		case 2:
			oJogo[0][1]= 'o';
			break;
			
		case 3:
			oJogo[0][2]= 'o';
			break;
			
		case 4:
			oJogo[1][0]= 'o';
			break;
		case 5:
			oJogo[1][1]= 'o';
			break;
		case 6:
			oJogo[1][2]= 'o';
			break;
		case 7:
			oJogo[2][0]= 'o';
			break;
		case 8:
			oJogo[2][1]= 'o';
			break;
		case 9:
			oJogo[2][2]= 'o';
			break;
		default:
			break;
		}
		
	}
		
		
	
}
