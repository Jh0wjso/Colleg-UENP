//Esta classe serve somente para teste
public class Pessoa {
    String nome;
    int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String toString(){
        return "Nome -> "+nome+" Idade -> "+idade;
    }
}
