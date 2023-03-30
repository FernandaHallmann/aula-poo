package com.mycompany.menu;

import java.util.Date;

/**
 *
 * @author Ferna
 */
public class Professor extends Pessoa {
    public Professor (String aNome, String aCpf, Date aData) {
        super (aNome, aCpf, aData);
    }
    public double salario;
    public String disciplina;
}
