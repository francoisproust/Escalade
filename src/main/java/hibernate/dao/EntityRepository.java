package hibernate.dao;

import hibernate.entities.Utilisateur;
import java.util.List;

public interface EntityRepository<T> {
    public T save(T utilisateur);
    public List<T> findAll();
    public T findOne(Long userId);
    public T update(T t);
    public List<T> findByDesignation(String critere);
    public void delete(Long userId);
}
