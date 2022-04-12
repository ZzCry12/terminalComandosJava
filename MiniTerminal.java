package miniTerminal;

import java.util.Scanner;

public class MiniTerminal {

    static String comando = "";
    static Scanner sc = new Scanner(System.in);
    private static boolean run = true;

    public static void main(String[] args) {
        consola();
    }

    private static void consola() {

        MiniFileManagement manager = new MiniFileManagement();
        while (run) {
            System.out.println("\n[!]Introdueix 'HELP' per a més informació");
            System.out.print("\n[> ");
            comando = sc.nextLine();

            String[] args = comando.split(" ");

            switch (args[0].toLowerCase()) {
                case "pwd":
                    manager.pwd(args[0]);
                    break;
                case "cd":
                    manager.cd(args[0]);
                    break;
                case "ls":
                    manager.ls(args[0]);
                    break;
                case "ll":
                    manager.ll(args[0]);
                    break;
                case "mkdir":
                    manager.mkdir(args[0]);
                    break;
                case "rm":
                    manager.rm(args[0]);
                    break;
                case "mv":
                    manager.mv(args[0], args[0]);
                    break;
                case "help":
                    manager.help();
                    break;
                case "exit":
                    System.out.println("[!]Tancant terminal...");
                    System.out.println("..");
                    System.out.println(".");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
