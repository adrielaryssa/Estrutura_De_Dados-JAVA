
package Clinica;

public class Paciente {
     String nome;
     String rg;
     String idade;
    
    
    public Paciente (){
        super();
    }
    public Paciente (String nome, String rg, String idade){
        super();
        this.nome=nome;
        this.rg=rg;
        this.idade=idade;
        
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nome=" + nome + ", rg=" + rg + ", idade=" + idade + '}';
    }
    
}

