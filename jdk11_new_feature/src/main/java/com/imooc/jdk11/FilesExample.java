package com.imooc.jdk11;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * <h1>Files 新增加的 API</h1>
 */
public class FilesExample {

    public static void main(String[] args) throws Exception {
        String path = "/tmp/jdk11_new_feature.txt";

        Files.writeString(Path.of(path), "jdk11 new feature", StandardCharsets.UTF_8);

        System.out.println(Files.readString(Paths.get(path),
                StandardCharsets.UTF_8));
    }
}
