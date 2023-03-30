package com.mycompany.menu;

import java.util.Date;

/**
 *
 * @author Ferna
 */

// Fazer classe zelador que herda de funcionario
public class Menu {

    public static void main(String[] args) {
        Aluno i = new Aluno ("Vinicius Sempkoski", "123.456.789-10", new Date());
        System.out.println("Nome: " + i.nome);
        System.out.println("CPF: " + i.cpf);
        System.out.println("Data de nascimento: " + i.dataNascimento.toString());
        
        Funcionario func = new Funcionario ("Vinicius Dezan", "222.111.333-77", new Date());
        System.out.println("Nome: " + func.nome);
        System.out.println("CPF: " + func.cpf);
        System.out.println("Data de nascimento: " + func.dataNascimento.toString());
        
        Professor prof = new Professor ("Maria Joseane", "444.555.000-11", new Date());
        System.out.println("Nome: " + prof.nome);
        System.out.println("CPF: " + prof.cpf);
        System.out.println("Data de nascimento: " + prof.dataNascimento.toString());
        
        Zelador zel = new Zelador ("Ana Julia", "987.654.321-00", new Date());
        System.out.println("Nome: " + zel.nome);
        System.out.println("CPF: " + zel.cpf);
        System.out.println("Data de nascimento: " + zel.dataNascimento.toString());

    }
}
