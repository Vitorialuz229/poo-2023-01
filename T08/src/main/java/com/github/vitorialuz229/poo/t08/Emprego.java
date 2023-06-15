package com.github.vitorialuz229.poo.t08;

public class Emprego {
    private float salario;
    private String inicio;
    private String fim;
    private Pessoa pessoa;
    private Empresa empresa;

    public Emprego() {
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

}
