package controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import dao.CategoriaDAO;
import dao.ProdutoDAO;
import models.Categoria;
import models.Produto;

//FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Contact admin."));

@Named
@SessionScoped
public class ProdutoBean implements Serializable {

	// Construtor
	public ProdutoBean() {
		produto = new Produto();
		produtos = new ArrayList<Produto>();
		categorias = new ArrayList<Categoria>();
	}

	// Atributos
	private static final long serialVersionUID = 1306734049083259978L;
	private Produto produto;
	private List<Produto> produtos;
	private List<Categoria> categorias;

	// Ações
	public String cadastrar() {
//		Categoria categoria = CategoriaDAO.buscarPorId(produto.getCategoria().getId());
//		produto.setCategoria(categoria);
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

	// Getter & Setters
	public List<Categoria> getCategorias() {
		categorias = CategoriaDAO.listar();
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

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

}
