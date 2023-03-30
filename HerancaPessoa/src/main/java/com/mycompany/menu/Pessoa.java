package com.mycompany.menu;

import java.util.Date;

/**
 *
 * @author Ferna
 */
public class Pessoa {
    public String nome;
    public String cpf;
    public Date dataNascimento;
    
    public Pessoa (String aNome, String aCpf, Date aData) {
        this.nome = aNome;
        this.cpf = aCpf;
        this.dataNascimento = aData;
    }
}
