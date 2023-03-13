package main.java.util;

import java.nio.file.Paths;

import io.github.cdimascio.dotenv.Dotenv;

public class DotenvLoader {
    
    private Dotenv dotenv;

    public static Dotenv newInstance() {
        return Dotenv.configure().directory("src/main/resources/").load();
    }
}
