package br.edu.catolica.aberto_fechado.Model;

import java.util.ArrayList;

public class FolhaDePagamento {

    public double calcularFolhaDePagamento(ArrayList<Pessoa> listaPessoas) {
        double pagDaEmpresa = 0;
        for (Pessoa pessoa : listaPessoas) {
            if (pessoa instanceof Empregado) {
                Empregado empregado = (Empregado) pessoa;
                pagDaEmpresa += empregado.getSalario();
            } else if (pessoa instanceof Gerente) {
                Gerente gerente = (Gerente) pessoa;
                pagDaEmpresa += gerente.getBonus();
            }
            else if(pessoa instanceof Consultor){
                Consultor consultor = (Consultor) pessoa;
                pagDaEmpresa += consultor.getTaxaDeHora() * consultor.getHorasTrabalhadas();
            }

        }
        return pagDaEmpresa;
    }
}