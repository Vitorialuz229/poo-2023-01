package com.github.vitorialuz229.poo.t13;

import java.util.Scanner;

public class Pessoa {
  private String nome;
  private String sobrenome;
  private String email;
  private String telefone;
  private String cpf;

  public Pessoa(String nome, String sobrenome, String email, String telefone, String cpf) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.email = email;
    this.telefone = telefone;
    this.cpf = cpf;
  }

  // Métodos getters e setters

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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nome: ");
    String nome = scanner.nextLine();

    System.out.print("Sobrenome: ");
    String sobrenome = scanner.nextLine();

    System.out.print("E-mail: ");
    String email = scanner.nextLine();

    System.out.print("Telefone: ");
    String telefone = scanner.nextLine();

    System.out.print("CPF: ");
    String cpf = scanner.nextLine();

    Pessoa pessoa = new Pessoa(nome, sobrenome, email, telefone, cpf);

    System.out.println("\nInformações da Pessoa:");
    System.out.println("Nome: " + pessoa.getNome());
    System.out.println("Sobrenome: " + pessoa.getSobrenome());
    System.out.println("E-mail: " + pessoa.getEmail());
    System.out.println("Telefone: " + pessoa.getTelefone());
    System.out.println("CPF: " + pessoa.getCpf());
  }
}
