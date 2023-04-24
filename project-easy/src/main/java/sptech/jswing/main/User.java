package sptech.jswing.main;

public class User {
    private Integer idUsuario;
    private String nome;
    private String email;
    private String senha;
    private String cargo;

    public User(Integer idUsuario, String email, String senha) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.senha = senha;
    }
    
    public User() {
        
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return String.format("Usuário: \nId: %d \nNome: %s \nE-mail: %s\n Senha: %s\n Cargo: %s", idUsuario, nome, email, senha, cargo);
    }
}
