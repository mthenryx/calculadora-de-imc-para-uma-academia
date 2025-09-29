package br.senai.sp.jandira.ds1t.calculadoraDeImcParaAcademia.model;

import java.util.Scanner;

public class CalculadoraDeImc {

    String nomeDoAluno;
    String estadoFisico;
    double peso;
    double altura;
    double imc;

    public void obterDados (){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Olá! Qual o nome do aluno(a) ?");
        nomeDoAluno = scanner.nextLine();

        System.out.print("Qual o peso de " + nomeDoAluno + "?");
        peso = scanner.nextDouble();

        System.out.print("Qual a altura de " + nomeDoAluno + " (em metros)?");
        altura = scanner.nextDouble();

        calcularImc();
    }

    public void calcularImc (){
        imc = peso/(altura * altura);

        distinguirEstadoDoAluno();
    }

    public void distinguirEstadoDoAluno(){
        if (imc >= 40){
            estadoFisico = "OBESIDADE GRAU III(mórbida). É recomendado que este aluno procure um médico antes de iniciar ou intensificar os treinos.";
        } else if (imc >= 35) {
            estadoFisico = "OBESIDADE GRAU II (severa). É recomendado que este aluno procure um médico antes de iniciar ou intensificar os treinos.";
        } else if (imc >= 30) {
            estadoFisico = "OBESIDADE GRAU I. É recomendado que este aluno procure um médico antes de iniciar ou intensificar os treinos.";
        } else if (imc >= 25) {
            estadoFisico = "LEVEMENTE ACIMA DO PESO";
        } else if (imc >= 18.6) {
            estadoFisico = "PESO IDEAL (PARABÉNS)";
        } else {
            estadoFisico = "ABAIXO DO PESO. É recomendado que este aluno procure um médico antes de iniciar ou intensificar os treinos.";
        }

        exibirResultados();
    }

    public void exibirResultados (){

        System.out.println("Aluno(a): " + nomeDoAluno);
        System.out.println("O imc chegou no resultado de: " + imc);
        System.out.println(nomeDoAluno + " se encontra em: " + estadoFisico);
    }
}
