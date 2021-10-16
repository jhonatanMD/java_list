package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProjectInit {

    public static void main(String[] args) {

        //List  -> Son colecciones
        //CREACIÓN DE LISTA CON ARRAYS.ASLIST -> INMUTABLES -> NO SE PUEDEN EDITAR
        List<String> palabras = Arrays.asList("HOLA","CHAU","BYE","ADIOS");

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //palabras.forEach(System.out::println);

        //CREACIÓN DE LISTA CON LIST.OF -> INMUTABLE -> NO SE PUEDEN EDITAR
        List<String> palabras2 = List.of("HOLA","CHAU","BYE","ADIOS");

        //CREACCION DE LISTA CON NEW ARRAYSLIST -> INSTANCIA
        List<String> palabras3 = new ArrayList<>(Arrays.asList("HOLA","CHAU","BYE","ADIOS"));

        //ADD ->  AGREGAR NUEVOS ITEMS A LA LISTA
        palabras3.add("ESTA CLASE JAVA");

        //REMOVE -> RETIRAR OBJETO DE LA LISTA
        palabras3.remove(0);
        palabras3.remove("BYE");
        palabras3.removeIf(item -> item.equals("ADIOS"));

        palabras3.forEach(System.out::println);

    }

}
