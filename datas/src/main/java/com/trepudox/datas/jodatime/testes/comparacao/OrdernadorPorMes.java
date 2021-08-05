package com.trepudox.datas.jodatime.testes.comparacao;

import java.time.LocalDate;
import java.util.Comparator;

public class OrdernadorPorMes implements Comparator<LocalDate> {

    @Override
    public int compare(LocalDate o1, LocalDate o2) {
        int mes = Integer.compare(o1.getMonth().getValue(), o2.getMonth().getValue());
        if (mes != 0)
            return mes;

        return Integer.compare(o1.getDayOfMonth(), o2.getDayOfMonth());
    }

}
