package main.java;

class CPU {
    private int V[] = new int[16];        // 8 bit general purpose registers
    private int I;                        // 16 bit index register
    private int delayTimer;               // 8 bit delay register
    private int soundTimer;               // 8 bit sound register
    private int pc = 0x200;               // 16 bit program counter
    private int sp = 0;                   // 8 bit stack pointer
    private int[] stack = new int[16];    // 16 16 bit stack values

    private int opcode;                   // 2 byte instructions

    private RAM ram;
    private Keyboard keyboard;
    private Display display;
}
