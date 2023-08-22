package br.udesc.ddm.exemplo_imagem;

public class Aluno {

    private String nome;
    private String email;
    private int codigo;
    private static int geradorCodigo = 0;
    public Aluno(String nome) {
        this.nome = nome;
        this.codigo = ++geradorCodigo;
        this.email = nome + "@edu.udesc.br";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}
