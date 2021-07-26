package com.trepudox.datastructure.files;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

@Slf4j
public class CreateFile {

    private static String currentPath = "C:\\Users\\marco\\GitHub\\JavaRev\\files\\src\\main\\java\\com\\trepudox\\files";

    public static void main(String[] args) {
        String fileName = "file";
        String fullPathFileName = currentPath + "\\txt\\" + fileName + ".txt";

        File file = new File(fullPathFileName);

        try {
            if (file.createNewFile()) {
                log.info("Arquivo criado");
            } else {
                log.error("Arquivo já existente");
                throw new FileAlreadyExistsException("Arquivo já existente!");
            }

            System.out.println(String.format("Nome do arquivo: %s", file.getName()));
        } catch (IOException e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }


    }

}
