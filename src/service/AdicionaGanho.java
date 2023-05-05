package service;

import message.MontaTelas;
import model.CadastraGanho;

import java.util.Scanner;

public class AdicionaGanho {

    public static CadastraGanho adicionaGanhoUser() {
        Scanner in3 = new Scanner(System.in);
        MontaTelas inicial2 = new MontaTelas();
        System.out.println(inicial2.adicionaGanho());
        System.out.println("Informe o nome do ganho: ");
        String nome = in3.next();
        System.out.println("Informe o valor: ");
        double valorGanho = in3.nextDouble();

        CadastraGanho ganho = new CadastraGanho(nome, valorGanho);
        System.out.println(ganho.toString());

        return ganho;
    }
}
