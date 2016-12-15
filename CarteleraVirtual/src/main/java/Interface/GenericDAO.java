package Interface;

public interface GenericDAO<T> {
	public void agregar(Object cartelera);
	public T actualizar(T Objeto);
	public void eliminar(T entity);
	abstract public void persistir(Class<T> Objeto);
	abstract public void recuperar(Class<T> Objeto);
	abstract public void existe(Class<T> Objeto);
	public T buscar(String nombre);
}
