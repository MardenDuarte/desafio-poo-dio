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


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}