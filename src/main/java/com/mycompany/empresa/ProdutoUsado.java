/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

import java.util.Date;

/**
 *
 * @author srdes
 */
public class ProdutoUsado extends Produtos{
    private Date dataFabricacao;
    
    

    public ProdutoUsado() {
    }
    
    public ProdutoUsado(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    public void setLancamento(Date data) { 
        this.dataFabricacao = data; 
    }
    @Override
     public String precoTag(String nome){
        return nome;
    }
     
}
