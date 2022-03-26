package domain.mappers;
// Chuyển đổi giữa Model của domain <-> Entity của database
public interface DomainMapper<E, M> {
    M toDomain(E entity);

    E fromDomain(M model);
}