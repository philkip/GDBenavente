package model;

public class Receita 
{
	Socio socio;
	int tipo;
	String data;
	double quantidade;
	int totalReceitas;
	
	public Receita(Socio socio, int tipo, String data, double quantidade)
	{
		super();
		this.socio = socio;
		this.tipo = tipo;
		this.data = data;
		this.quantidade = quantidade;
	}

	public Socio getSocio() 
	{
		return socio;
	}

	public void setSocio(Socio socio)
	{
		this.socio = socio;
	}

	public int getTipo()
	{
		return tipo;
	}

	public void setTipo(int tipo) 
	{
		this.tipo = tipo;
	}

	public String getData()
	{
		return data;
	}

	public void setData(String data) 
	{
		this.data = data;
	}

	public double getQuantidade()
	{
		return quantidade;
	}

	public void setQuantidade(double quantidade) 
	{
		this.quantidade = quantidade;
	}

	public int getTotalReceitas() 
	{
		return totalReceitas;
	}

	public void setTotalReceitas(int totalReceitas)
	{
		this.totalReceitas = totalReceitas;
	}	
}
