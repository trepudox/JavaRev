package com.trepudox.crudswing;

import com.trepudox.crudswing.model.Pessoa;
import com.trepudox.crudswing.model.dao.PessoaDAO;

import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Pessoa> lista = PessoaDAO.getAll();
        System.out.println(lista);


//        Tela tela = new Tela();
    }

}
