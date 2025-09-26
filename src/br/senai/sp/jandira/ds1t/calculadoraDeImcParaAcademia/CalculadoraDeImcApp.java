package br.senai.sp.jandira.ds1t.calculadoraDeImcParaAcademia;

import br.senai.sp.jandira.ds1t.calculadoraDeImcParaAcademia.model.CalculadoraDeImc;

public class CalculadoraDeImcApp {

    public static void main(String[] args){
        System.out.println("Executando programa...");

        CalculadoraDeImc imc  = new CalculadoraDeImc();
        imc.obterDados();
    }
}
