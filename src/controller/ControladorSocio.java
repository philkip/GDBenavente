package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Socio;

public class ControladorSocio 
{
	ArrayList<Socio> arSocio;
	
	public ControladorSocio()
	{
		arSocio = new ArrayList<>();
	}
	
	public void AdicionaSocio(String nome, String localidade, String contacto)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do Sócio:");
		nome = sc.nextLine();
		System.out.println("Localidade:");
		localidade = sc.nextLine();
		System.out.println("Contacto:");
		contacto = sc.nextLine();
		
		Socio s = new Socio(nome, localidade, contacto);
		
		int novoID = arSocio.size();
		
		s.setId(novoID);
		
		arSocio.add(s);
	}
	
	public void ListarSocios()
	{
		for(int i = 0; i < arSocio.size(); i++)
		{
			System.out.println(arSocio.get(i).getNome());
			System.out.println(arSocio.get(i).getLocalidade());
			System.out.println(arSocio.get(i).getContacto());
		}
	}
}
