package dao;

public interface iDao<T> {
    T registrar(T t);
    T buscarPorCampo(String campo);

}
