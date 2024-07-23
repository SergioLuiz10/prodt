package aplication;

import prd.predica;
import prd.produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aplication {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<produto> list = new ArrayList<>();

        System.out.println("Digite quantos produtos você deseja?");
        int quantidade = ler.nextInt();
        ler.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome do produto:");
            String produto = ler.nextLine();
            System.out.println("Digite o preço do produto:");
            double price = ler.nextDouble();
            ler.nextLine();
            list.add(new produto(produto,price));
        }

        list.removeIf(new predica());

        System.out.println("Produtos restantes:");
        for (produto p : list) {
            System.out.println(p);
        }
    }
}