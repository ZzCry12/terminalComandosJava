package miniTerminal;

import java.util.Scanner;

public class MiniTerminal {

    static String comando = "";
    static Scanner sc = new Scanner(System.in);
    private static boolean run = true;

    public static void main(String[] args) {
        init();
    }

    private static void init() {

        MiniFileManagement manager = new MiniFileManagement();

        while (run) {
            System.out.println("\nIntroduce 'HELP' para más información");
            System.out.print("\n[> ");
            comando = sc.nextLine();

            String[] args = comando.split(" ");

            switch (args[0]) {
                case "pwd":
                    manager.pwd(args[1]);
                    break;
                case "cd":
                    manager.cd(args[1]);
                    break;
                case "ls":
                    manager.ls(args[1], args[2]);
                    break;
                case "ll":
                    manager.ll(args[1]);
                    break;
                case "mkdir":
                    manager.mkdir(args[1]);
                    break;
                case "rm":
                    manager.rm(args[1]);
                    break;
                case "mv":
                    manager.mv(args[1], args[2]);
                    break;
                case "help":
                    manager.help();
                    break;
                case "exit":
                    System.out.println("Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
