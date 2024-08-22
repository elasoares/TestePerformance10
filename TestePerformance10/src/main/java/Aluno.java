import lombok.*;

@Getter @AllArgsConstructor @NoArgsConstructor @ToString
public class Aluno {
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;

    public int setMatricula(int matricula) {
        if(matricula <= 0){
            throw new ArithmeticException("Erro: Matrícula deve ser maior que zero.");
        }
        this.matricula = matricula;
        return matricula;
    }
    public void setNome(String nome) {
        if(nome == null || nome.length() < 4){
            throw new RuntimeException("Erro: O campo nome deve " +
                    "ter pelo menos 4 caracteres.");
        }
        if(!nome.contains(" ") || nome.split(" ").length < 2) {
            throw new RuntimeException("Erro: O nome deve conter pelo " +
                    "menos um nome e um sobrenome.");
        }
        this.nome = nome;
    }


}
