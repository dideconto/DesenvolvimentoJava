package controllers;

import java.io.Serializable;
import java.util.ArrayList;
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
		produtos = new ArrayList<Produto>();
	}

	private static final long serialVersionUID = 1306734049083259978L;
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
	}

	public String detalhar() {
		int idProduto = Integer.parseInt(
				FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("idProduto"));
		produto = ProdutoDAO.buscarPorId(idProduto);
		return "AlterarProduto.xhtml?faces-redirect=true";
	}
	
	public String alterar() {
		ProdutoDAO.alterar(produto);
		produto = new Produto();
		return "Index.xhtml?faces-redirect=true";
	}
	
}










