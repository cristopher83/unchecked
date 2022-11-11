package uaslp.objetos.list;

public interface List<T> {
    void addAtTail(T data) throws NullNotAllowedException;

    void addAtFront(T data) throws NullNotAllowedException;

    boolean remove(int index) throws WrongIndexException;

    void removeAll();

    /**
     * Permite colocar un elemento en un índice específico de la lista.
     *
     * @param index Indice del elemento a insertar
     * @param data Dato a colocar en la lista
     * @return true si el indice era válido, false de lo contrario
     */
    boolean setAt(int index, T data) throws WrongIndexException,NullNotAllowedException;

    T getAt(int index) throws WrongIndexException;

    void removeAllWithValue(T data);

    int getSize();

    Iterator<T> getIterator();
}
