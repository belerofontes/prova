package br.edu.iftm.importacao;

public class taxas {
	
	private String produto = "";
	private String fiscal= "";
	private double imposto = 20;
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		if(produto !=null)
		{
		this.produto = produto;
		}
	}
	public String getFiscal() {
		return fiscal;
	}
	public void setFiscal(String fiscal) {
		this.fiscal = fiscal;
	}
	public double getImposto() {
		return imposto;
	}
	
	public void setImposto(double imposto) {
		if (imposto >=20 && imposto <=120)
		{	
		this.imposto = imposto;
	//*nada a mais	
		}
	}

}

