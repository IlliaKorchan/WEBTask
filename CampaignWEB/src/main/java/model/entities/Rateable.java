package model.entities;

import java.math.BigDecimal;

/**
 * Interface for entities, that can be rated
 * @author Илья Корчан
 * @version 1.2
 */
public interface Rateable {
    BigDecimal getAverageMark();
    int getAdditionalMark();
}
