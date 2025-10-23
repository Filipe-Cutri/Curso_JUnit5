package barriga.domain;

import barriga.domain.Exception.ValidationException;

public class Usuario {

    private Long id;
    private String nome;
    private String email;
    private String senha;

    public Usuario(Long id, String nome, String email, String senha) {
        if(nome == null) {
            throw new ValidationException("Nome é obrigatorio");
        }

        if(email == null) {
            throw new ValidationException("Email é obrigatorio");
        }

        if(senha == null) {
            throw new ValidationException("Senha é obrigatorio");
        }

        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}
