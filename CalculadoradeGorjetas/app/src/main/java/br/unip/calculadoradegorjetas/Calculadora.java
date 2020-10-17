package br.unip.calculadoraDeGorjeta;

public class Calculadora {

    static double gorjeta(double valor, double percentual){
        return valor * percentual / 100.0;
    }

    static double [] gorjeta(double valor){
        double [] saida = new double[3];
        for (int i = 0; i < 3; i++){
            saida[i] = gorjeta(valor, i * 5 + 5);
        }
        return saida;
    }
}
