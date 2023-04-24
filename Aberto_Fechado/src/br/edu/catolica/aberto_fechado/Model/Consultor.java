package br.edu.catolica.aberto_fechado.Model;

public class Consultor extends Pessoa{

    private double taxaDeHora;
    private double horasTrabalhadas;

    public Consultor(String nome, int idade, String email, double taxaDeHora, double horasTrabalhadas){
        super(nome, idade, email);
        this.taxaDeHora = taxaDeHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double getTaxaDeHora(){
        return taxaDeHora;
    }
    public void setTaxaDeHora(double taxaDeHora){
        this.taxaDeHora = taxaDeHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
