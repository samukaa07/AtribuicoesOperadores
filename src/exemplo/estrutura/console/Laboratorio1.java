package exemplo.estrutura.console;

	public class Laboratorio1 {
		 // 1� criei uma classe
			public static void main(String[] args) {
				// 2� crie uma variavel para receber o numero a ser avaliado
				int numero = 5;
				// passo 3 - variavel para fazer a contagem de divisores
				int Div = 0;
				// criando um loop para realizar as divis�es de variavel numero
				for(int i = 1; i <= numero; i++) {
					int result = (numero % i);
					
					if(result == 0) {
						Div++;
									}
				// verificando se o valor da variavel � primo ou n�o
					
					if(Div <= 2) {
						System.out.println(numero +" Este n�mero � primo");
						break;
					} else {
						System.out.println(numero +" Este n�mero n�o � primo");
						break;
					}
			
			    
			}
			}
		}
