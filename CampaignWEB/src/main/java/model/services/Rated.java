package model.services;

import java.math.BigDecimal;

/**
 * Interface, that marks implementors can be rated
 * @author Илья Корчан
 * @version 1.2
 */
public interface Rated {
    BigDecimal countRatingMark();
}
