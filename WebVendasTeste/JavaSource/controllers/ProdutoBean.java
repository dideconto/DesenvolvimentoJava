package controllers; 

import java.io.Serializable;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import dao.CategoriaDAO;
import dao.ProdutoDAO;
import models.Categoria;
import models.Produto;

@Named
@ViewScoped
public class ProdutoBean implements Serializable {
	

	public ProdutoBean() {
		produto = new Produto();
//		categoria = new Categoria();
		produtos = ProdutoDAO.listar();
		categorias = CategoriaDAO.listar();
	}

	private static final long serialVersionUID = -7565175822617267932L;
	private Produto produto;
	private Categoria categoria;
	private List<Produto> produtos;
	private List<Categoria> categorias;
	private int idCategoria;
	
	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

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
	
	public String cadastrar() {
		System.out.println("############ Categoria: " + produto.getCategoria().getNome());
//		produto.setCategoria(categoria);
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
