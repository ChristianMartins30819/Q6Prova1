package prova;

public class Quiz {
	private Usuario usuario;
	private int[] resposta = new int[5];
	private String[] perguntas = new String[5];
	
	
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String[] perguntas() {
		perguntas[0] = "quanto que é 1 + 5?";
		perguntas[1] = "quanto que é 2 + 5?";
		perguntas[2] = "quanto que é 3 + 5?";
		perguntas[3] = "quanto que é 4 + 5?";
		perguntas[4] = "quanto que é 5 + 5?";
		return perguntas;
	}

	public int[] resposta() {
		resposta[0] = 6;
		resposta[1] = 7;
		resposta[2] = 8;
		resposta[3] = 9;
		resposta[4] = 10;
		return resposta;
	}


	
	
	


		
	
}
