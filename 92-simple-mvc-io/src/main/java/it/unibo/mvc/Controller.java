package it.unibo.mvc;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Application controller. Performs the I/O.
 */
public class Controller {
     private File currentFile;
     private static final String PATH = System.getProperty("user.home")
            + File.separator
            + "output.txt";

     public Controller() {
        this.currentFile = new File(PATH);
    }

    public void setFile(File file){
        this.currentFile = file;

    }
    public File getFile(){
        return this.currentFile;
    }
    public String getFilePath(){
        return this.currentFile.getPath();
    }
    public void writeContent(String text){

        try {
                Files.writeString(Path.of(this.currentFile.getPath()), text);
        } catch (IOException e) {
                throw new RuntimeException("Errore scrivendo il file", e);
        }

    }
}
