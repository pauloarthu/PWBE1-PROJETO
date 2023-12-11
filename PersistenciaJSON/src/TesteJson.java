import com.fasterxml.jackson.databind.ObjectMapper;

public class TesteJson {

	public static void main(String[] args) {
		try {
			ObjectMapper objeto = new ObjectMapper();
			//objeto para utilizar na serilização
			Pessoa pes = new Pessoa("Abel", 45);
			//seralizar o obj pes
			String json = objeto.writeValueAsString(pes);
			
			System.out.println("objeto serializado");
			System.out.println(json);
			
			//deserializar o JSON para o obj pes
			Pessoa desPessoa = objeto.readValue(json, Pessoa.class);
			System.out.println("JSON desserializado para obj Pessoa");
			System.out.println("nome: " + desPessoa.getNome());
			System.out.println("idade: " + desPessoa.getIdade());
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
