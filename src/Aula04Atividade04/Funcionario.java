package Aula04Atividade04;

public class Funcionario {
    private int cracha;
    private String nome;
    char tipoVinculo;
    float valorHora;
    float qntHora;
    float salario;
    float valorDesconto;

    public Funcionario(int cracha, String nome, char tipoVinculo ){
        this.cracha= cracha;
        this.nome= nome;
        this.tipoVinculo= tipoVinculo;
    }

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQntHora() {
        return qntHora;
    }

    public void setQntHora(float qntHora) {
        this.qntHora = qntHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float calcularSalario(){
        if(tipoVinculo=='H'){
            return valorHora * qntHora;
        } else if(tipoVinculo=='N') {
            return salario;
        }
        return 0;
    }

    public float calcularValorReceber(){
        return calcularSalario() - valorDesconto;
    }

    public String imprimir(){
        String msg ="\nCracha: "+cracha
                + "\nNome: "+ nome
                + "\nTipo vinculo: "+ tipoVinculo
                + "\nValor Hora: "+ valorHora
                + "\nQuantidade Hora: "+qntHora
                + "\nSalario: "+salario
                + "\nDesconto: "+valorDesconto
                +"\nValor a receber:"+calcularValorReceber();
                return msg;
    }


}
