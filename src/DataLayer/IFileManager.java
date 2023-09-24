/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import java.util.List;

/**
 *
 * @author nhutm
 * @param <T>
 */
public interface IFileManager<T> {
    List<String> readDataFromFile() throws Exception;
}
