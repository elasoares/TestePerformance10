public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
       aluno.setMatricula(1);
       aluno.setNome("Rodrigo");
        System.out.println(aluno.getMatricula() + aluno.getNome());
    }
}
