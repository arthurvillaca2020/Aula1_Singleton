package org.example;


public class Main {
    public static void main(String[] args) {
        LoginBanco loginBanco = LoginBanco.getInstance();
        loginBanco.setServidor("192.168.1.101");
        loginBanco.setLogin("UNI");
        loginBanco.setSenha("UNI@123");
        loginBanco.setNomeBanco("uniBaseDados");

        System.out.println("Servidor: " + loginBanco.getServidor());
        System.out.println("Login: " + loginBanco.getLogin());
        System.out.println("Senha: " + loginBanco.getSenha());
        System.out.println("Nome do banco: " + loginBanco.getNomeBanco());

    }
}