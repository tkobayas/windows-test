package com.sample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.junit.Test;

public class FileTest {

    @Test
    public void testFile1() throws IOException {
        File source = new File("src/main/resources", "test.dat");
        File target = new File("target/classes", "test.dat");

        Path sourcePath = source.getAbsoluteFile().toPath();
        Path targetPath = target.getAbsoluteFile().toPath();

        System.out.println("Files.copy : 1");
        Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("Files.copy : 2");
        Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("URL.getContent");
        Object content = target.toURL().getContent();
        System.out.println("content = " + content);

        System.out.println("Files.copy : 3");
        Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
    }
}
