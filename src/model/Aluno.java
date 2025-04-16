package model;

public class Aluno {
    String nome;
    int idade;
    double[] notas;


    public Aluno(String nome, int idade, double[] notas) {
        this.nome = nome;
        this.idade = idade;
        this.notas = notas;
    }

    public Aluno() {


    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getNotas() {
        return notas;
    }


    public double CalculaMediaNota() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public boolean Aprovado (){

        return CalculaMediaNota() >=7;



    }

    public void exibirDados(){

        System.out.println("Nome" + nome);
        System.out.println("Idade" + idade);
        System.out.println("Média" + CalculaMediaNota());
        System.out.println( "Aprovado" +(Aprovado() ? "Sim" : "Não"));





    }
}


