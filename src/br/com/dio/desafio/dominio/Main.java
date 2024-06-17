package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso 1 java");
        curso1.setDescricao("descricao do curso 1 js");
        curso1.setCargaHoraria(6);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso 2 java");
        curso2.setDescricao("descricao do curso 2 js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao memntoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("---------");

        Dev devMarden = new Dev();
        devMarden.setNome("Marden");
        devMarden.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao" + devMarden.getConteudosInscritos());
        devMarden.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Joao" + devMarden.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao" + devMarden.getConteudosConcluidos());
        System.out.println("XP: " + devMarden.calcularTotalXp());






    }
}