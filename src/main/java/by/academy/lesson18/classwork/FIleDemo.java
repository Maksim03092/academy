package by.academy.lesson18.classwork;

import java.io.File;
import java.io.IOException;

public class FIleDemo {

    public static void main(String[] args) throws IOException {

        File myPackage = new File("MyPackage");
        File my = new File("./");

        if(!myPackage.exists()){
            myPackage.mkdir();
        }

        File file = new File(myPackage, "myFirstFile.txt");

        if (!file.exists()){
            file.createNewFile();
        }
        System.out.println(file.isAbsolute());

        for (File f : my.listFiles()){
            System.out.println("Имя файла: " + f.getName());
            System.out.println("Путь: " + f.getPath());
            System.out.println("Абсолютный путь: " + f.getAbsolutePath());
            System.out.println("Родительский католог: " + f.getParent());
            System.out.println(f.exists() ? "Файл/какталог существует" : "Файл/не существует");
        }

    }
}
