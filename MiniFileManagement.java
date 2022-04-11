package miniTerminal;

import java.io.File;

public class MiniFileManagement {

    public MiniFileManagement() {
        super();
    }

    public void help() {

        System.out.println("**************[Ayuda terminal]**************");
        System.out.println("pwd: Mostra quina és la carpeta actual");
        System.out.println("cd <DIR>: Canvia la carpeta actual a ‘DIR’. Amb .. canvia a la carpeta superiorhe");
        System.out.println(
                "ls: Mostra la llista de directoris i arxius de la carpeta actual (primer directoris, després arxius, tots dos ordenats alfabèticament)");
        System.out.println("ll: Com ls però mostra també la grandària i la data d'última modificació.");
        System.out.println("mkdir <DIR>: Crea el directori ‘DIR’ en la carpeta actual");
        System.out.println(
                "rm <FILE>: Esborra ‘FILE’. Si és una carpeta, esborrarà primer els seus arxius i després la carpeta. Si té subcarpetes, les deixarà intactes i mostrarà un avís a l'usuari");
        System.out.println("mv <FILE1> <FILE2>: Mou o canvia de nom ‘FILE1’ a ‘FILE2’");
        System.out.println("Exit : cierra el programa");
        System.out.println("**************[Ayuda terminal]**************");
    }

    public void mv(String origen, String destino) {

    }

    public void rm(String archivo) {
    }

    public void mkdir(String directorio) {
    }

    public void ll(String directorio) {
    }

    public void cd(String ruta) {
    }

    public void pwd(String ruta) {
        File f = new File(".");
        System.out.println("Carpeta actual:");
        for (String e : f.list()) {
            System.out.println(e);
        }
    }

    public void ls(String origen, String destino) {
    }

}
