import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.*;

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

        Conteudo conteudo = new Curso();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Sessão de mentoria para tirar dúvidas sobre o Curso de Java");
        mentoria1.setData(java.time.LocalDate.now());
        
        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de Java");
        mentoria2.setDescricao("Sessão de mentoria para tirar dúvidas sobre o Curso de Java");
        mentoria2.setData(java.time.LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Venha aprender a desenvolver Java nesse bootcamp personalizado para impulsionar sua aprendizagem");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev devRivonaldo = new Dev();
        devRivonaldo.setNome("Rivonaldo");
        devRivonaldo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Rivonaldo: \n" + devRivonaldo.getConteudosInscritos());
        System.out.println("--------------------------------------------------------------------");
        devRivonaldo.progredir();
        System.out.println("Conteudos inscritos de Rivonaldo: \n" + devRivonaldo.getConteudosInscritos());
        devRivonaldo.progredir();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Conteudos Concluidos de Rivonaldo: \n" + devRivonaldo.getConteudosConcluidos());
        System.out.println("XP: " + devRivonaldo.calcularXp());
        
        System.out.println("--------------------------------------------------------------------");
        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Lucas: \n" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Conteudos inscritos de Lucas: \n" + devLucas.getConteudosInscritos());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Conteudos Concluidos de Lucas: \n" + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularXp());
        
    }

}