package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import dao.ProdutoDAO;
import models.Produto;

@Named
@RequestScoped
public class ProdutoBean {

	public ProdutoBean() {
		produto = new Produto();
		produtos = new ArrayList<Produto>();
	}

	private Produto produto;
	private List<Produto> produtos;
	
	public List<Produto> getProdutos() {		
		produtos = ProdutoDAO.listar();
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public void cadastrar() {
		ProdutoDAO.cadastrar(produto);
		System.out.println(produto.getNome() +  ": Cadastrado com sucesso!");
	}
	
	public void remover(Produto produto) {
		ProdutoDAO.remover(produto);
		System.out.println(produto.getNome() +  ": Removido com sucesso!");
	}
}











