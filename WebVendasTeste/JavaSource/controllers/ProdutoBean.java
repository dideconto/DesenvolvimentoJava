package controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import dao.ProdutoDAO;
import models.Produto;

@Named
@SessionScoped
public class ProdutoBean implements Serializable {
	

	public ProdutoBean() {
		produto = new Produto();
		produtos = ProdutoDAO.listar();
	}

	private static final long serialVersionUID = -7565175822617267932L;
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
	
	public String cadastrar() {
		ProdutoDAO.cadastrar(produto);
		produto = new Produto();
		return "Index.xhtml?faces-redirect=true";
	}
	
	public void remover(Produto produto) {
		ProdutoDAO.remover(produto);
		produto = new Produto();		
	}
	
	public String detalhar() {
		int idProduto = Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().
				getRequestParameterMap().get("idProduto"));
		produto = ProdutoDAO.buscarPorId(idProduto);
		return "EditarProduto.xhtml?faces-redirect=true";
	}
	
	public String editar() {
		ProdutoDAO.editar(produto);
		System.out.println(produto.getNome());
		produto = new Produto();
		return "Index.xhtml?faces-redirect=true";
	}

}
