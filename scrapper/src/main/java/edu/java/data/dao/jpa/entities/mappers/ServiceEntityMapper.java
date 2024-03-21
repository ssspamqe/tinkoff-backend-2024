package edu.java.data.dao.jpa.entities.mappers;

import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import java.util.Optional;

public interface ServiceEntityMapper<J, D> extends EntityMapper<J, D> {

    J toJpaWithLink(D dtoEntity, LinkJpaEntity link);

    default Optional<J> toOptionalJpaWithLink(Optional<D> optionalDtoEntity, LinkJpaEntity link) {
        if (optionalDtoEntity.isEmpty()) {
            return Optional.empty();
        }

        D dtoEntity = optionalDtoEntity.get();
        J jpaEntity = toJpaWithLink(dtoEntity, link);
        return Optional.of(jpaEntity);
    }

}
