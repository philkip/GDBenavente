package view;

import java.util.Scanner;

import controller.ControladorSocio;
import controller.GereReceita;

public class MenuPrincipal 
{
	public MenuPrincipal()
	{
		Menu();
	}
	
	public void Menu()
	{
		boolean sair = false;
		ControladorSocio cs = new ControladorSocio();
		GereReceita gr = new GereReceita();
		
		do
		{
			System.out.println("Socios Clube Desportivo Benavente");
			System.out.println("1 - Inscrever Socio");
			System.out.println("2 - Comprar Bilhetes");
			System.out.println("3 - Efectuar Doacao");
			System.out.println("4 - Pagar Quotas");
			System.out.println("5 - Ver qual o socio que mais contribuio");
			System.out.println("6 - Ver o mes com maior contribuicao");
			System.out.println("7 - Listagem de todos os sócios");
			System.out.println("8 - Sair");
			int opc = (new Scanner(System.in).nextInt());
			
			switch(opc)
			{
			case 1:
				cs.AdicionaSocio(null, null, null);
				break;
			
			case 2:
			case 3:
			case 4:
				gr.addReceita(null, opc, null, 0.0);
				break;
			
			case 5:
				break;
				
			case 6:
				break;
				
			case 7:
				cs.ListarSocios();
				break;
				
			case 8:
				sair = true;
				System.exit(0);
				break;
			
			default:
				System.out.println("Escolha a opcao de 1 a 8");
				break;
			}
			
		}while(sair == false);
		
	}
}
