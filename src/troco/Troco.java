package troco;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);		
	
		double conta;
		double pago;	
		   
			
		}
	public static String calculaTroco(double conta, double pago) {
		DecimalFormat formatador = new DecimalFormat ("###,##0.00");
		double troco;
		double  vlr, ct;
		int i;
		String result;
		double centavos[] = {0.25, 0.10, 0.5, 0.1};	
		
		conta = 1.0;
		pago =  0.88;
		troco = pago - conta;
		System.out.println(troco);
		 
		
	    result ="\nTroco = R$"+ formatador.format(troco) +"\n\n";
	    System.out.println(result);
		

		// definindo os centavos do troco (parte fracionária)
		      vlr = (int)Math.round((troco - (int)troco) * 100);
		      i = 0;
		      while (vlr != 0) {
		        ct = vlr / centavos[i]; // calculando a qtde de moedas
		        if (ct != 0) {
		           result = result + (ct +"moeda(s) de"+ centavos[i] +
		           "centavo(s)\n");
		           vlr = vlr % centavos[i]; // sobra
		        }
		        i = i + 1; // próximo centavo
		      }

		      return(result);
		
		
	}

	}


