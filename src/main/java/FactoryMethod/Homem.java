package FactoryMethod;

import javax.swing.*;

//Essa classe representa o ConcrectProdut do padrão Factory Method
public class Homem extends Pessoa {

    public Homem(String nome){
        this.nome = nome;
        System.out.println("Olá Senhor " + this.nome);
        JOptionPane.showMessageDialog(null, "Olá Senhor " + this.nome);
    }
}