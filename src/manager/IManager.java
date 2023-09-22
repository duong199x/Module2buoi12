package manager;


import java.util.ArrayList;
import java.util.Map;

public interface IManager<E> {
    void add(int key, E e);

    void delete(int id);

    void update(int id, E e);

    Map<Integer,E> findListName(String name);

    double averageClass();

    Map<Integer, E> findall();
}
