package dao;

import java.util.ArrayList;

import models.Venda;

//JVM
public class VendaDAO {
	
	private static ArrayList<Venda> vendas = new ArrayList<Venda>();
	
	public static void cadastrarVenda(Venda v) {
		vendas.add(v);
	}
	
	public static ArrayList<Venda> retornarVendas(){
		return vendas;
	}
	
}
