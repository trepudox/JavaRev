package com.trepudox.datastructure.files;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.time.LocalDateTime;

@Slf4j
public class WriteFile {

    private static String currentPath = "C:\\Users\\marco\\GitHub\\JavaRev\\files\\src\\main\\java\\com\\trepudox\\files";

    public static void main(String[] args) throws IOException {
        LocalDateTime agora = LocalDateTime.now();

        String fileName = agora.toString().replace(':', ';');
        String fullPathFileName = currentPath + "\\txt\\" + fileName + ".txt";

        File file = new File(fullPathFileName);

        try (FileWriter fileWriter = new FileWriter(fullPathFileName)) {
            System.out.println("Nome do arquivo: " + file.getName());

            fileWriter.write("Hello File!\n");
            fileWriter.write(String.format(
                    "Hoje dia %d está sol e calor", agora.getDayOfMonth()
            ));
        } catch (IOException e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }
    }

}
