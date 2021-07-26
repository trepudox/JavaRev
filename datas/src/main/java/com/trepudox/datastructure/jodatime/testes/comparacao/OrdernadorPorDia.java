package com.trepudox.datastructure.jodatime.testes.comparacao;

import java.time.LocalDate;
import java.util.Comparator;

public class OrdernadorPorDia implements Comparator<LocalDate> {

    @Override
    public int compare(LocalDate o1, LocalDate o2) {
        return Integer.compare(o1.getDayOfMonth(), o2.getDayOfMonth());
    }

}
