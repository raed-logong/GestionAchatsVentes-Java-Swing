/*
 * Created By Raed Attia
 * Github : https://github.com/raed-logong
 */

/*
 * Created By Raed Attia
 * Github : https://github.com/raed-logong
 */

/*
 * Created By Raed Attia
 */

package controller;

import java.util.ArrayList;

public interface Services<Object> {
    boolean add(Object E);

    boolean edit(Object E);

    boolean delete(String key);

    Object get(String key);

    ArrayList<Object> getAll();

    ArrayList<Object> getByName(String name);
}
