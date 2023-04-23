
public class Livro {
	private String titulo;
	private Autor autor;
	private String editora;
	private String anoDePublicacao;
	
	public String getTitulo() {
		return ("Titulo do Livro: " + this.titulo);
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return ("Editora: ") + this.editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAnoDePublicacao() {
		return ("Ano de Publicacao " + anoDePublicacao);
	}
	public void setAnoDePublicacao(String anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}
	
	
}
