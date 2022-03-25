package main;

public class Motorista {

    public String renova_cnh(int idade){

        String output = "";

        if(idade > 0 && idade < 50){
            output = "Renovação a cada 10 anos!";
        }else if(idade >= 50 && idade <=70){
            output = "Renovação a cada 5 anos!";
        } else if(idade > 70){
            output = "Renovação a cada 3 anos!";
        } else{
            output = "Idade inválida!";
        }
        return output;
    }
}