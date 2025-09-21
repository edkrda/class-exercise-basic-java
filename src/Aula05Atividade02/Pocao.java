package Aula05Atividade02;

public class Pocao {
    private String nome;
    private String tipo;
    private int poder;

    public Pocao(String nome){
        this.nome= nome;
        setPoder(30);
        this.tipo="Veneno";
    }

    public Pocao(String nome, int poder){
        this.nome= nome;
        setPoder(poder);
        this.tipo="Sonifero";
    }

    public Pocao(String nome, int poder, String tipo){
        this.nome=nome;
        setPoder(poder);
        this.tipo=tipo;
    }

    public void usar(){
        System.out.println("A poção "+nome+" foi usada! Ela causou "+poder+" de dano");
    }
    public void usar(String alvo){
        System.out.println("A poção "+nome+" foi usada em "+alvo+"! Ela causou"+poder+" de dano.");
    }
    public void usar(String alvo, int vezes){
        System.out.println("A poção "+nome+" foi usada "+vezes+" em "+alvo+"! Ela causou "+poder+" de dano.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
    public void imprimir(){
        System.out.println("Nome da poção: "+nome
        +"\nTipo da poção: "+tipo
        +"\nPoder da poção: "+poder);
    }
}
