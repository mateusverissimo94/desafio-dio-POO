import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("curso java");
        cursoJava.setDescricao("descrição curso java");
        cursoJava.setCargaHoraria(8);

        Curso cursoJs = new Curso();
        cursoJs.setTitulo("curso js");
        cursoJs.setDescricao("descrição curso js");
        cursoJs.setCargaHoraria(4);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("mentoria de java");
        mentoriaJava.setDescricao("descrição mentoria java");
        mentoriaJava.setData(LocalDate.now());

//        System.out.println(cursoJava);
//        System.out.println(cursoJs);
//        System.out.println(mentoriaJava);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJs);
        bootcamp.getConteudos().add(mentoriaJava);

        Dev devMateus = new Dev();
        devMateus.setNome("Mateus");
        devMateus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devMateus.getConteudosInscritos());
        devMateus.progredir();
        devMateus.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos " + devMateus.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos " + devMateus.getConteudosInscritos());
        System.out.println("XP: " + devMateus.calcularXp());

        System.out.println("---------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos " + devCamila.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos " + devCamila.getConteudosInscritos());
        System.out.println("XP: " + devCamila.calcularXp());


    }
}