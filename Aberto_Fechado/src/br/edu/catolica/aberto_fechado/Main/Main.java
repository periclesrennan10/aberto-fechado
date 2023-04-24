package br.edu.catolica.aberto_fechado.Main;
import br.edu.catolica.aberto_fechado.Model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();

        Empregado empregado1 = new Empregado("Pericles", 20, "periclesrennan599@gmail.com", 2000);

        Gerente gerente = new Gerente("Rennan", 21, "rennan10@gmail.com",1500);

        Consultor consultor = new Consultor("Farias", 25, "fariasff@gmail.com", 15,220);

        listaPessoas.add(empregado1);
        listaPessoas.add(gerente);
        listaPessoas.add(consultor);

        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
        double pagDaEmpresa = folhaDePagamento.calcularFolhaDePagamento(listaPessoas);
        System.out.println("Valor total do pagamento da empresa: " + pagDaEmpresa);

    }
}