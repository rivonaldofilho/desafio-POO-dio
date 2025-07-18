import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Aprenda os fundamentos de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Aprenda os fundamentos de JavaScript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Sessão de mentoria para tirar dúvidas sobre o Curso de Java");
        mentoria1.setData(java.time.LocalDate.now());
        Mentoria mentoria2 = new Mentoria();

        mentoria2.setTitulo("Mentoria de Java");
        mentoria2.setDescricao("Sessão de mentoria para tirar dúvidas sobre o Curso de Java");
        mentoria2.setData(java.time.LocalDate.now());


        System.out.println(curso1);
        System.out.println("====================================================");
        System.out.println(mentoria1);
        System.out.println("====================================================");
        System.out.println(curso2);
        System.out.println("====================================================");
        System.out.println(mentoria2);
        
    }

}