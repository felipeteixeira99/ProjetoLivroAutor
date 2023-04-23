
public class TestarAutor {

	public static void main(String[] args) {
		Autor autor = new Autor();
		
		autor.setNome("Zezim dos livros");
		autor.setNacionalidade("Russo");
		autor.setDataDeNascimento("11/06/2001");
		
		System.out.println(autor.getNome());
		System.out.println(autor.getNacionalidade());
		System.out.println(autor.getDataDeNascimento());
	}
}
