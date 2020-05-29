package controllers;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import dao.ProdutoDAO;
import models.Produto;
import utils.JSFUtils;

@Named
@RequestScoped
public class ProdutoBean {
	
	public ProdutoBean() {
		produto = new Produto();
		produtos = ProdutoDAO.listar();
	}
	
	private Produto produto;
	private List<Produto> produtos;
	
	public List<Produto> getProdutos() {
		produtos = ProdutoDAO.listar();
		System.out.println("------ " + produtos.size());
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
		JSFUtils.enviarMensagem(produto.getNome() + ": cadastrado com sucesso!");
		produto = new Produto();
	}
	
	public void remover(Produto produto) {
		ProdutoDAO.remover(produto);
		JSFUtils.enviarMensagem(produto.getNome() + ": removido com sucesso!");
		produto = new Produto();		
	}

}
