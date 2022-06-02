package br.com.letscode.eurekaserver.entities;
import java.util.Objects;
public class User {

    private String id;
    private String nome;
    private String email;
    private String cpf;
    private String cep;

    public User() {
    }

    public User(String id, String nome, String email, String cpf, String cep) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.cep = cep;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}