package main.java;

public class CPU {
    private int V[] = new int[16];        // 8 bit general purpose registers
    private int I;                        // 16 bit index register
    private int delay;                    // 8 bit delay register
    private int sound;                    // 8 bit sound register
    private int pc;                       // 16 bit program counter
    private int sp = 0;                   // 8 bit stack pointer
    private int[] stack = new int[16];    // 16 16 bit stack values

    private int opcode;                   // 2 byte instructions

    private RAM ram;
    private Keyboard keyboard;
    private Display display;

    public void run() {}
}
