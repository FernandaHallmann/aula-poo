package com.mycompany.menu;

import java.util.Date;

/**
 *
 * @author Ferna
 */
public class Aluno extends Pessoa {
    public Aluno (String aNome, String aCpf, Date aData) {
        super (aNome, aCpf, aData);
    }
    public String matricula;
}
