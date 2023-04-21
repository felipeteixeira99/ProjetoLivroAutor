public class Autor {
		private String nome;
		private String nacionalidade;
		private String dataDeNascimento;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNacionalidade() {
			return nacionalidade;
		}
		public void setNacionalidade(String nacionalidade) {
			this.nacionalidade = nacionalidade;
		}
		public String getDataDeNascimento() {
			//System.out.println("Data de nascimento: ");
			return ("Data de nascimento: " + dataDeNascimento);
		}
		public void setDataDeNascimento(String dataDeNascimento) {
			this.dataDeNascimento = dataDeNascimento;
		}
}
