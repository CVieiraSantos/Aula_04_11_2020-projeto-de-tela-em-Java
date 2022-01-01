package aula;

public class Principal {

	public static void main(String[] args) {
		
		Conexao conexao = new Conexao();
        conexao.cadastrar("cadux.vieira2276@gmail.com" , "Carlos Eduardo Vieira dos Santos" , 9.65339999);		
        System.out.println(conexao.consultarNome("cadu.vieira2276@gmail.com"));
        System.out.println(conexao.consultarTelefone(9.76554433));

	}

}
