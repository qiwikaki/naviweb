package ivan.projects.naviweb.dao;

import java.util.List;

public interface BaseDao<K,T> {

    List<T> showAll();
    boolean createEntity(T t);
    boolean deleteEntityById(K id);
//    void update(T t);
    T findEntityById(K id);
}
