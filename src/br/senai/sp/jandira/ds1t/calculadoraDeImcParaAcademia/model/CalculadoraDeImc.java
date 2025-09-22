package br.senai.sp.jandira.ds1t.calculadoraDeImcParaAcademia.model;

import java.util.Scanner;

public class CalculadoraDeImc {

    String nomeDoAluno;
    double peso;
    double altura;
    double resultadoDoCalculo;

    public void obterDados (){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Olá! Qual o nome do aluno(a) ?");
        nomeDoAluno = scanner.nextLine();

        System.out.print("Qual o peso  ?");
        peso = scanner.nextLine();

        System.out.print("Olá! Qual o seu nome ?");
        altura = scanner.nextLine();

    }

    public void calcularImc (){

    }

    public void distinguirEstadoDoAluno(){

    }

    public void exibirResultados (){

    }
}
