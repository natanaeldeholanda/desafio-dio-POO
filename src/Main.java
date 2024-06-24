import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);
        //System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso FullStack");
        curso2.setDescricao("FullStack em Java");
        curso2.setCargaHoraria(77);
        //System.out.println(curso2);
        System.out.println("----------------");

        //Usando polimorfismo para criar conteúdo
        //Conteudo conteudo1 = new Curso();
        //Conteudo conteudo2 = new Mentoria();
        //List<Conteudo> conteudos = new ArrayList<>();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java Completo");
        mentoria1.setDescricao("Descrição Mentoria Java Completo");
        mentoria1.setData(LocalDate.now());
        //System.out.println(mentoria1);
        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("BootCamp Java Completo");
        bootcampJava.setDescricao("Descrição BootCamp Java Developer");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria1);

        Dev devNatanael = new Dev();
        devNatanael.setNome("Natanael de Holanda");
        devNatanael.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos Natanael" + devNatanael.getConteudosInscritos());
        devNatanael.progredir();
        devNatanael.progredir();
        System.out.println("Conteúdos Inscritos Natanael" + devNatanael.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Natanael" + devNatanael.getConteudosConcluidos());
        System.out.println("------------");
        System.out.println("XP: " + devNatanael.calcularTotalXP());
        Dev devJoao = new Dev();
        devJoao.setNome("João Bigodeiro");
        devJoao.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos João Bigodeiro" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("------------");
        System.out.println("Conteúdos Inscritos João Bigodeiro" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João Bigodeiro" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());



    }
}