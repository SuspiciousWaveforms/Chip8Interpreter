package main.java;

import java.nio.file.Paths;

public class Chip8Interpreter {
    public static void main(String[] args) {
        RAM ram = new RAM();
        CPU cpu = new CPU();

        ram.loadProgram(Paths.get("./ROMs/Fishie.ch8"));

        cpu.run();
    }
}
