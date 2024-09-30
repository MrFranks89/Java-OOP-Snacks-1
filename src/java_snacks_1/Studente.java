package java_snacks_1;

public class Studente {

		private String nome;
		private String cognome;
		private int age;
		
		
		Studente(String nome, String cognome, int age){
			this.nome = nome;
			this.cognome = cognome;
			this.age = age;
		}
		
		//public void setNome(String nome) {
		//	this.nome = nome;
		//}
		
		public String getNome () {
			return this.nome;
		}
		
		//public void setCognome(String cognome) {
		//	this.cognome = cognome;
		//}
		
		public String getCognome () {
			return this.cognome;
		}
		
		//public void setAge(int age) {
		//	this.age = age;
		//}
		
		
		public double getAge(double age) {
			return this.age;
		}
		
		String getNomeEsteso () {
			return this.nome + " - " + this.cognome + " - " + this.age + " anni";
		}
}
