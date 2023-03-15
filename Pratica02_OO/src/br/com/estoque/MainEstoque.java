package br.com.estoque;

import java.util.Scanner;

public class MainEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estoque1 e1 = new Estoque1();
        e1.setCodProduto(28);
        e1.setNome("Caneta");
        e1.setQtdAtual(10);
        e1.setQtdMinima(5);

        Estoque1 e2 = new Estoque1();

        System.out.println("Digite o codigo do produto: ");
        e2.setCodProduto(sc.nextInt());

        System.out.println("Digite o nome do produto: ");
        e2.setNome(sc.next());

        System.out.println("Digite a quantidade atual: ");
        e2.setQtdAtual(sc.nextInt());

        System.out.println("Digite a quantidade minima: ");
        e2.setQtdMinima(sc.nextInt());

        System.out.println(e1.mostra());
        System.out.println("\n"+e2.mostra());

        Estoque1 e3 = new Estoque1(1,"Caderno",20,5);
        e3.darBaixa(10);
        System.out.println("Estoque Atual: "+e3.getQtdAtual());
        e3.darBaixa(1000);
        System.out.println(e3.precisaRepor());
    }
}
