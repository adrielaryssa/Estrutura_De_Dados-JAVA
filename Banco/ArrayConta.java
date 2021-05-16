package Banco;

public class ArrayConta {
	
	
	private Conta[] conta = new Conta[14];
	private int totalconta = 0;
	
	public void adicionar(String nome, double valor){
            Conta co = new Conta(nome, valor);
            for(int i = 0;i < this.conta.length;i++){
                if(this.conta[i]==null){
                    this.conta[i] = co;
                    break;
		}
            }
	conta[this.totalconta] = co;
	this.totalconta++;
				
	};
	
	public void listar(){
                for(int i=0; i < this.totalconta;i++){
                    System.out.println(conta[i]);
                    
		}
	}
	
	public Conta procurarNome(String nome) {
            Conta co;
                for(int cont=0; cont<this.totalconta;cont ++) {
                    co = (Conta)this.conta[cont];
                    if(((Conta)co).getNome().equals(nome)) {
                        return co;
                    }
		}
		
        return null;
		
	}

}
