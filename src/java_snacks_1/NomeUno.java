package java_snacks_1;

public class NomeUno {
public static void main(String[] args) {
		Studente studente1 = new Studente("Federico", "Franchi", 35 );
		
		System.out.println("Il nome dello studente è: " + studente1.getNomeEsteso());
		System.out.println(studente1.getNome());
		System.out.println(studente1.getCognome());
		System.out.println(studente1.getAge(0));
}
}
