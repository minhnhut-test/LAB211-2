/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

/**
 *
 * @author nhutm
 */
public class FileManager<T> implements IFileManager<T>{
    private String fileName;

    public FileManager(){
    
    }
    
    public FileManager(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public List<String> readDataFromFile() throws IOException {
        List<String> result;
        result = Files.readAllLines(new File(fileName).toPath(), Charset.forName("utf-8"));
        return result;
    }
    
}
