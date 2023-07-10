package model.manage;

public interface Manage<E> {
    void addNew(E e);

    void delete(String id);

    void edit(E e);
}
