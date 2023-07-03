package Model.Manage;

public interface Manage<E> {
    void addNew(E e);

    void delete(String id);

    void edit(E e);
}
