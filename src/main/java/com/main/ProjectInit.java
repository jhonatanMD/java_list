package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProjectInit {

    public static void main(String[] args) {

        //List  -> Son colecciones
        //CREACIÓN DE LISTA CON ARRAYS.ASLIST -> INMUTABLES -> NO SE PUEDEN EDITAR
        List<String> palabras = Arrays.asList("1","2","3","4");

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //palabras.forEach(System.out::println);

        //CREACIÓN DE LISTA CON LIST.OF -> INMUTABLE -> NO SE PUEDEN EDITAR
        List<String> palabras2 = List.of("HOLA","CHAU","BYE","ADIOS");

        //CREACCION DE LISTA CON NEW ARRAYSLIST -> INSTANCIA
        List<String> palabras3 = new ArrayList<>(Arrays.asList("HOLA","CHAU","BYE","ADIOS"));

        //ADD ->  AGREGAR NUEVOS ITEMS A LA LISTA
        //palabras3.add("ESTA CLASE JAVA");

        //REMOVE -> RETIRAR OBJETO DE LA LISTA
        //palabras3.remove(0);
        //palabras3.remove("BYE");
        //palabras3.removeIf(item -> item.equals("ADIOS"));



        //"JAVA","HOLA","CHAU","BYE","ADIOS"
        //palabras3.add(3,"JAVA");

        //ADDALL -> AGREGAR ITEMS MEDIANTE UNA LISTA
        //palabras3.addAll(palabras);

        //SET -> REEMPLAZAR EL OBJETO MEDIANTE SU INDICE
        //palabras3.set(0,"GOOD BYE");

        // SIZE -> SABER LA CANTIDAD DE ITEMS QUE TIENE MI LISTA

        //INDEX OF DEVUEL EL INDICE DEL OBJETO
        //System.out.println(palabras3.indexOf("CHAU"));

        //CONTAINS SABER SI EXISTE EL OBJETO
        //System.out.println(palabras3.contains("ZAMIR"));
        palabras3.forEach(System.out::println);

        System.out.println("TAMAÑO DE LISTA : "+palabras3.size());

    }

}
