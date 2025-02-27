package controller;

public class Lista {
    private String nome;
    private int id;

    public Lista(String nome) {
        setNome(nome);
    }

    public void cadastroSucesso() {
        System.out.print("Lista cadastrada com sucesso!");
    }

    public void cadastroErro(){
        System.out.print("Erro ao cadastrar lista!");
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
}