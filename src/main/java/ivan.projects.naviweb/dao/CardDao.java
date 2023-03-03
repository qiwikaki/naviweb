package ivan.projects.naviweb.dao;

import ivan.projects.naviweb.entity.Card;

import java.util.List;

public interface CardDao extends BaseDao<Long,Card>{

    List<Card> showAll();

    boolean createEntity(Card t);

    boolean deleteEntityById(Long id);

    Card findEntityById(Long id);

    //    void update(T t);
}
