package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Receita;
import model.Socio;

public class GereReceita 
{
	ArrayList<Receita> arReceita;
		
	public GereReceita()
	{
		arReceita = new ArrayList<>();
	}
	
	public Receita addReceita(Socio socio, int tipo, String data, double quantidade)
	{
		Scanner sc = new Scanner(System.in);
		
		switch(tipo)
		{
		case 2://Comprar Bilhetes
			System.out.println("Cada bilhete custa 5€");
			System.out.println("Quantos bilhetes deseja comprar?");
			int num = (new Scanner(System.in).nextInt());
			break;
			
		case 3://Efectuar Doaçao
			
			break;
			
		case 4://Pagar quotas
			
			break;
		}
			
				
		Receita r = new Receita(socio, tipo, data, quantidade);
		
		int newTotal = arReceita.size();
		
		r.setTotalReceitas(newTotal);
		
		return r;
	}
	
}
