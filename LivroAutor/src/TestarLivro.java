
public class TestarLivro {
	public static void main(String[] args) {
		Livro livro = new Livro();
		Autor autor = new Autor();
		
		livro.setTitulo("Branca de Neve");
		autor.setNome("Disney");
		livro.setEditora("Saraiva");
		livro.setAnoDePublicacao("11/06/1996");
		
		System.out.println(livro.getTitulo());
		System.out.println(autor.getNome());
		System.out.println(livro.getEditora());
		System.out.println(livro.getAnoDePublicacao());
	}
}


