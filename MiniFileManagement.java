package miniTerminal;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class MiniFileManagement {
    static Scanner sc = new Scanner(System.in);

    public MiniFileManagement() {
        super();
    }

    public void help() {

        System.out.println("[?]**************[Ajuda terminal]**************");
        System.out.println("pwd: Mostra quina és la carpeta actual");
        System.out.println("cd <DIR>: Canvia la carpeta actual a ‘DIR’. Amb .. canvia a la carpeta superior");
        System.out.println(
                "ls: Mostra la llista de directoris i arxius de la carpeta actual (primer directoris, després arxius, tots dos ordenats alfabèticament)");
        System.out.println("ll: Com ls però mostra també la grandària i la data d'última modificació.");
        System.out.println("mkdir <DIR>: Crea el directori ‘DIR’ en la carpeta actual");
        System.out.println(
                "rm <FILE>: Esborra ‘FILE’. Si és una carpeta, esborrarà primer els seus arxius i després la carpeta. Si té subcarpetes, les deixarà intactes i mostrarà un avís a l'usuari");
        System.out.println("mv <FILE1> <FILE2>: Mou o canvia de nom ‘FILE1’ a ‘FILE2’");
        System.out.println("Exit : tanca el programa");
        System.out.println("[?]**************[Ajuda terminal]**************");
    }

    public void cd(String ruta) {
        System.out.println("Introdueix la ruta a la que vols anar");
        ruta = sc.nextLine();
        File f = new File(ruta);
        System.setProperty("user.dir", ruta);

        System.out.println("\n[!]Directori actual = " + f.getAbsolutePath());
    }

    public void mv(String origen, String destino) {

        System.out.println("[!]Introdueix el nom del arxiu/fitxer que vullges renombrar:");
        File f1 = new File(sc.nextLine());

        System.out.println("[!] [" + f1 + "] Seleccionat correctament, introdueix el nou nom:");
        File f2 = new File(sc.nextLine());

        boolean correcto = f1.renameTo(f2);

        if (correcto)
            System.out.println("[!] [" + f1 + "] Ha sigut renomenat correctament a [" + f2 + "]");
        else
            System.out.println("[ERROR] Ha hagut un error al renomenar");
    }

    public void rm(String archivo) {

        try {

            System.out.println("[!]Introdueix el nom del arxiu/fitxer que vullges renombrar");
            File f = new File(sc.nextLine());

            // eliminamos el archivo/carpeta si existe
            if (f.delete())
                System.out.println("[!] [" + f + "] Ha sigut eliminat correctament");
            else
                System.out.println("[ERROR]" + f + " No ha pogut ser eliminat");
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    public void mkdir(String directorio) {

        System.out.println("[!]Introdueix el nom de la carpeta a crear:");
        File f = new File(sc.nextLine());
        // comprobamos si existe la carpeta con el nombre
        if (!f.exists()) {
            // si no existe la creamos
            boolean comprobacion = f.mkdir();
            if (comprobacion) {
                System.out.println("[!]Carpeta creada correctamente " + f.getAbsolutePath());
            } else {
                System.out.println("[ERROR]Error al crear la carpeta " + f.getAbsolutePath());
            }
        } else {
            System.out.println("[!]La carpeta existeix actualment");
        }

    }

    public void ll(String directorio) {
        File f = new File(".");
        File[] listado = f.listFiles();

        Arrays.sort(listado);

        System.out.println("\n[!]Directorio actual = " + System.getProperty("user.dir"));

        for (int i = 0; i < listado.length; i++) {
            if (listado[i].isFile())
                System.out.println(
                        "\n[!] [Archiu del directori: " + "'" + System.getProperty("user.dir") + "'] -  "
                                + "'" + listado[i].getName() + "'"
                                + " Grandaria: " + "[" + listado[i].length() + " B]"
                                + " Ultima modificació: " + listado[i].lastModified());

        }
    }

    public void pwd(String ruta) {

        System.out.println("\n[!]Directori actual = " + System.getProperty("user.dir"));

    }

    public void ls(String ruta) {

        File f = new File(".");
        File[] listado = f.listFiles();

        Arrays.sort(listado);

        System.out.println("\n[!]Directori actual = " + System.getProperty("user.dir"));
        System.out.println("");

        for (int i = 0; i < listado.length; i++) {
            if (listado[i].isFile())
                System.out.println("[A]" + listado[i].getName());

        }
    }
}
