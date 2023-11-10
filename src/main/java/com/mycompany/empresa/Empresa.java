
package com.mycompany.empresa;

import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author TrInfra
 */

public class Empresa {

    public static void main(String[] args) throws ParseException {
        List<Produtos> produtosCadastrados = new ArrayList<>();

        Produtos pd = new Produtos();
        ProdutoUsado pdu = new ProdutoUsado();
        ProdutoImportado pdi = new ProdutoImportado();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        int j = 0;
        /* Entrada- quantidade de produtos cadastrando */
        System.out.println("Entre com o número de produtos:");
        Scanner sc = new Scanner(System.in);
        int npd = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < npd; i++) {
            System.out.println("Insira o produto #" + (j + 1));
            System.out.println("Ele é comum, usado ou importado(c/u/i)?\n");
            String op = sc.nextLine();
            if ("c".equals(op)) {
                System.out.println("nome:");
                pd.setNome(sc.nextLine());

                System.out.println("Preço:");
                pd.setPreco(sc.nextInt());
                sc.nextLine();
                produtosCadastrados.add(pd);

            } else if ("u".equals(op)) {
                System.out.println("nome:");
                pdu.setNome(sc.nextLine());
                System.out.println("Preço:");
                pdu.setPreco(sc.nextInt());
                sc.nextLine();
                System.out.println("Data de Fabricação: ");
                String dataRecebida = sc.nextLine();

                try {
                    Date data = formato.parse(dataRecebida);
                    pdu.setLancamento(data);
                } catch (ParseException e) {
                    System.out.println("Data de fabricação inserida em formato inválido. Use o formato dd/MM/yyyy.");
                }
                produtosCadastrados.add(pdu);

            } else if ("i".equals(op)) {
                System.out.println("nome: ");
                pdi.setNome(sc.nextLine());
                System.out.println("Preço: ");
                pdi.setPreco(sc.nextInt());
                System.out.println("Taxa alfandegaria: ");
                pdi.setTaxaAfandega(sc.nextDouble());
                sc.nextLine();
                produtosCadastrados.add(pdi);

            }

            j++;
        }
        sc.close();

        for (Produtos produto : produtosCadastrados) {

            System.out.println("--------------------");

            if (produto instanceof ProdutoUsado) {
                ProdutoUsado produtoUsado = (ProdutoUsado) produto;
                System.out.println("\nNome: " + produto.getNome());
                System.out.println("\nPreço: " + produto.getPreco());
                System.out.println("\nData de Fabricação: " + formato.format(produtoUsado.getDataFabricacao()));
            } else if (produto instanceof ProdutoImportado) {
                ProdutoImportado produtoImportado = (ProdutoImportado) produto;
                System.out.println("\nNome: " + produto.getNome());
                System.out.println("\nPreço: " + produto.getPreco());
                System.out.println("\nTaxa Alfandegária: " + produtoImportado.getTaxaAfandega());
                System.out.println("TOTAL: preço + taxa = R$" + pdi.precoTotal(pdi.getPreco(), pdi.getTaxaAfandega()));
            } else if (produto instanceof Produtos) {
                System.out.println("\nNome: " + produto.getNome());
                System.out.println("\nPreço: " + produto.getPreco());
            }
2
            System.out.println("--------------------");

        }

    }
}
