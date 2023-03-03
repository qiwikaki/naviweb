package ivan.projects.naviweb.dao;

import ivan.projects.naviweb.entity.Card;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CardDaoImp implements CardDao{

    @Override
    public List<Card> showAll() {

        List<Card> allCard = new ArrayList<>();
        Statement statement ;
        return allCard;
    }

    @Override
    public boolean createEntity(Card t) {
        return false;
    }

    @Override
    public boolean deleteEntityById(Long id) {
        return false;
    }

    @Override
    public Card findEntityById(Long id) {
        return null;
    }
}
