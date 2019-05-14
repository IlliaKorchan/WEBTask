package model.entities;

import java.util.List;

/**
 * Interface, for rating creators
 * @author Илья Корчан
 * @version 1.1
 */
public interface RatingCreator {
    List<Rated> getRating();
    List<Rated> createRating(List<Rated>ratedEntities);
}
