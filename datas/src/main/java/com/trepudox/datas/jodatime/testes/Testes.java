package com.trepudox.jodatime.testes.jodatime.testes;

import com.trepudox.jodatime.testes.jodatime.testes.comparacao.OrdernadorPorDia;
import com.trepudox.jodatime.testes.jodatime.testes.comparacao.OrdernadorPorMes;
import com.trepudox.jodatime.testes.jodatime.testes.comparacao.OrdernadorPorAno;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Testes {

    private static final List<LocalDate> lista = new ArrayList<>();

    static {
        lista.add(LocalDate.of(2021, 7, 20));
        lista.add(LocalDate.of(2021, 10, 6));
        lista.add(LocalDate.of(2021, 4, 4));
        lista.add(LocalDate.of(2021, 11, 2));
        lista.add(LocalDate.of(2021, 11, 14));
        lista.add(LocalDate.of(2021, 8, 13));
        lista.add(LocalDate.of(2021, 5, 12));
        lista.add(LocalDate.of(2021, 7, 19));
        lista.add(LocalDate.of(2021, 2, 9));
        lista.add(LocalDate.of(2021, 12, 10));
        lista.add(LocalDate.of(2021, 3, 17));
        lista.add(LocalDate.of(2021, 1, 28));
        lista.add(LocalDate.of(2021, 7, 15));
        lista.add(LocalDate.of(2021, 6, 22));
        lista.add(LocalDate.of(2021, 7, 1));
    }

    public static void main(String[] args) {

//        filtrarPorMes(2);
//        ordernarPorDia();
//        ordernarPorMes();
//        ordernarPorAno();

    }

    private static void ordernarPorDia() {
        lista.stream()
                .sorted((d1, d2) -> new OrdernadorPorDia().compare(d1, d2))
                .forEach(System.out::println);
    }

    private static void ordernarPorMes() {
        lista.stream()
                .sorted((d1, d2) -> new OrdernadorPorMes().compare(d1, d2))
                .forEach(System.out::println);
    }

    private static void ordernarPorAno() {
        lista.stream()
                .sorted((d1, d2) -> new OrdernadorPorAno().compare(d1, d2))
                .forEach(System.out::println);
    }

    private static void filtrarPorMes(int mes) {
        lista.stream()
                .filter(date -> date.getMonth().getValue() == mes)
                .forEach(System.out::println);
    }

}
