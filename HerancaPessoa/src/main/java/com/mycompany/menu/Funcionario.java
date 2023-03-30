package com.mycompany.menu;

import java.util.Date;

/**
 *
 * @author Ferna
 */
public class Funcionario extends Pessoa {
    public Funcionario (String aNome, String aCpf, Date aData) {
        super(aNome, aCpf, aData);
    }
    public double salario;
    public Date data_admissao;
    public String cargo;
}
