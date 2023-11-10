/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

/**
 *
 * @author srdes
 */
public class ProdutoImportado extends Produtos{
    private double taxaAfandega;

    public ProdutoImportado(String nome, double preco) {
        super(nome, preco);
    }

    public ProdutoImportado() {
    }
    public double getTaxaAfandega() {
        return taxaAfandega;
    }

    public void setTaxaAfandega(double taxaAfandega) {
        this.taxaAfandega = taxaAfandega;
    }
    
    @Override
     public String precoTag(String nome){
        return nome;
    }
     public double precoTotal( double preco, double taxaAfandega){
         return preco + taxaAfandega;
     }
}
