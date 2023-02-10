package troco;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double conta;
		double pago;
		double troco;
		String result="";;
		conta = 0.88;
		pago = 1.00;
		troco = pago - conta;
		System.out.println("O troco é " + troco);		
		
	// definindo os centavos do troco (parte fracionária)
		double vlr, ct;
		int i;		
		
		double centavos[] = { 0.25, 0.10, 0.5, 0.1 };
		
			vlr = (int) Math.round((troco - (int) troco) * 100);
			i = 0;
			
			while (vlr != 0) {
				ct = vlr / centavos[i]; // calculando a qtde de moedas
				
				if (ct != 0) {
					result = result + (ct + "moeda(s) de" + centavos[i] + "centavo(s)\n");
					vlr = vlr % centavos[i]; // sobra
				}
				i = i + 1; // próximo centavo
			}
				System.out.println(result);
			}
	}


