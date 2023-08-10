package FactoryMethod;

import javax.swing.*;

//Essa classe representa o ConcrectProdut do padrão Factory Method
public class Mulher extends Pessoa{

    public Mulher(String nome){
        this.nome = nome;
        System.out.println("Olá Senhora " + this.nome);
        JOptionPane.showMessageDialog(null, "Olá Senhora " + this.nome);
    }
}
