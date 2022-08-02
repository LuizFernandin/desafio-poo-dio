import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("---------- DEV-LUIZ ----------");
        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Luiz: " + devLuiz.getConteudosInscritos());

        devLuiz.progredir();
        devLuiz.progredir();

        System.out.println("Conteúdos Inscritos Luiz: " + devLuiz.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: " + devLuiz.getConteudosConcluidos());

        System.out.println("XP: " + devLuiz.calcularTotalXP());

        System.out.println("---------- DEV-FERNANDO ----------");
        Dev devFernando = new Dev();
        devFernando.setNome("Fernando");
        devFernando.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Fernando: " + devFernando.getConteudosInscritos());

        devFernando.progredir();

        System.out.println("Conteúdos Inscritos Fernando: " + devFernando.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: " + devFernando.getConteudosConcluidos());
        System.out.println("XP: " + devFernando.calcularTotalXP());

    }
}
