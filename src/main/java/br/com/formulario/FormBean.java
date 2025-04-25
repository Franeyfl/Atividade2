package br.com.formulario;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

// Essa anotação permite que o XHTML encontre essa classe
@Named("formBean")
// Diz que o bean vive por uma única requisição (é descartado depois)
@RequestScoped
public class FormBean {

    // Campos para armazenar os dados do formulário
    private String nome;
    private String sobrenome;
    private String fone;
    private String email;

    // Getters e Setters são obrigatórios para o JSF funcionar corretamente

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
