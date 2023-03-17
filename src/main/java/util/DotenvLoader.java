package main.java.util;

import io.github.cdimascio.dotenv.Dotenv;

public class DotenvLoader {
    
    public static Dotenv newInstance() {
        return Dotenv.configure().directory("src/main/resources/").load();
    }
}
