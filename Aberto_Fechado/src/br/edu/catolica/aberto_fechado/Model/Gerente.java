package br.edu.catolica.aberto_fechado.Model;

public class Gerente extends Pessoa{
    public double bonus;

    public  Gerente(String nome, int idade, String email, double bonus){
        super(nome, idade, email);
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }


}
