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
public interface IUserDao<T> {
    void addNew(T obj) throws Exception;
    void delete(int index) throws Exception;
    void update(int index,T obj) throws Exception;
    List<T> getList() throws Exception;
}
