public class Autor {
		private String nome;
		private String nacionalidade;
		private String dataDeNascimento;
		
		public String getNome() {
			return ("Nome: " + this.nome);
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNacionalidade() {
			return ("Nacionalidade: " + nacionalidade);
		}
		public void setNacionalidade(String nacionalidade) {
			this.nacionalidade = nacionalidade;
		}
		public String getDataDeNascimento() {
			return ("Data de nascimento: " + dataDeNascimento);
		}
		public void setDataDeNascimento(String dataDeNascimento) {
			this.dataDeNascimento = dataDeNascimento;
		}
}
