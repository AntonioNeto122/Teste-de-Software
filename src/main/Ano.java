package main;

public class Ano {
    int ano;

    public Ano() {
    }

    public String tempAno(int ano) {
        if(ano < 1900 || ano > 2020) {
            return "Data Inválida";
        }
        this.ano = ano;
        return "Data Válida";
    }
}
