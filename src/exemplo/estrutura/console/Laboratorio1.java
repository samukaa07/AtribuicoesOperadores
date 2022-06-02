package exemplo.estrutura.console;

	public class Laboratorio1 {
		 // 1º criei uma classe
			public static void main(String[] args) {
				// 2º crie uma variavel para receber o numero a ser avaliado
				int numero = 5;
				// passo 3 - variavel para fazer a contagem de divisores
				int Div = 0;
				// criando um loop para realizar as divisões de variavel numero
				for(int i = 1; i <= numero; i++) {
					int result = (numero % i);
					
					if(result == 0) {
						Div++;
									}
				// verificando se o valor da variavel é primo ou não
					
					if(Div <= 2) {
						System.out.println(numero +" Este número é primo");
						break;
					} else {
						System.out.println(numero +" Este número não é primo");
						break;
					}
			
			    
			}
			}
		}
