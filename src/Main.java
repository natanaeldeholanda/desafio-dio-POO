import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso FullStack");
        curso2.setDescricao("FullStack em Java");
        curso2.setCargaHoraria(77);
        System.out.println(curso2);
        System.out.println("----------------");
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java Completo");
        mentoria1.setDescricao("Descrição Mentoria Java Completo");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);
    }
}