package item;

public class Item {
	
	//atributos da classe
	private String nome;
	private String autor;
	private String editora;
	private String anopublicacao;
	private String assunto;
	private String sinopse;
	private String capa;
	private boolean itemStatus;
	
	//construtor da classe
	public Item(String nome, String editora, String autor, String assunto, String anopublicacao, String sinopse, String capa) {
		this.nome = nome;
		this.editora = editora;
		this.autor = autor;
		this.assunto = assunto;
		this.anopublicacao = anopublicacao;
		this.sinopse = sinopse;
		this.capa = capa;
		
		//inicializa disponível e timer máximo
		this.itemStatus = true;
	}
	
	
	//Getters para acessar os atributos privado
	public String getNome() {
		return nome;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getAssunto() {
		return assunto;
	}
	
	public String getAnopublicacao() {
		return anopublicacao;
	}
	
	public String getSinopse() {
		return sinopse;
	}
	
	public String getCapa() {
		return capa;
	}
	
	public boolean getItemStatus() {
		return itemStatus;
	}
	
	public void setItemStatus(boolean novoStatus) {
		this.itemStatus = novoStatus;
	}
	
}