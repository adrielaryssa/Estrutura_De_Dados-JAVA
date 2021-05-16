
package Clinica;

public class ColecaoPaciente {
    
    public Paciente op[]=new Paciente[10];
    int aux=0;
    public void cadastrarPaciente(Paciente x) {
        op[this.aux]=x;
        this.aux++;
    }
    public void listarPaciente() {
            int i;
            for(i=0;i<op.length;i++){
            System.out.println(op[i]);
            }
    }
    public void procurarPaciente(int y){
            System.out.println(op[y]);
    }
}