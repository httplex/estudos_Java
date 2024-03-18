package lista02_exercicio01;

public class PacienteTeste {
	public static void main(String[] args) {
		Paciente paciente1 = new Paciente(1, "Jennie Kim", "01/09/1980", 'F', "Koreaboo", "Chocolate", "B+");
		System.out.println(paciente1);
		
		paciente1.nome = "Marianne Kim";
		paciente1.dataNascimento = "10/05/1975";
        paciente1.sexo = 'F';
        paciente1.planoSaude = "Plano Y";
        paciente1.alergia = "Alergia Nova";
        paciente1.tipoSanguineo = "O-";
        System.out.println("\nDados Modificados do Paciente:");
        System.out.println(paciente1);
        
	}
}
