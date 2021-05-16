package Banco;

public class Conta {
	
	private String nome;
	private double valor;
	
	public Conta(){
        }
	
	public Conta(String n, double v) {
		super();
		this.nome = n;
		this.valor = v;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String no) {
		this.nome = no;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double va) {
		this.valor = va;
	}
	
        @Override
	public String toString(){
		return "Nome:" + this.nome + "\nValor:" + this.valor;
	}
	
	
	

}
