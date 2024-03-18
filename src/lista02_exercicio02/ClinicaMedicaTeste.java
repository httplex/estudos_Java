package lista02_exercicio02;

public class ClinicaMedicaTeste {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua das Flores", 12, "Casa", "Fiorentino", "Samambaia", "DF", "12.345-345");
		Medico medico1 = new Medico(1, "Marcos Andrade", "Cardiologia", 'M', endereco1);
		
		System.out.println(endereco1);
		System.out.println(medico1);
		
		endereco1.cep = "00.000-000";
		medico1.especialidade = "Urologia";
		
		System.out.println(endereco1);
		System.out.println(medico1);

	}

}
