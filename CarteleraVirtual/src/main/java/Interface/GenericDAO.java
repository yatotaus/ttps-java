package Interface;

public interface GenericDAO<T> {
	public void agregar(T cartelera);
	public T actualizar(T Objeto);
	public void eliminar(T entity);
	public void persistir(T Objeto);
	public void recuperar(T Objeto);
	public void existe(T Objeto);
	public T buscar(String nombre);
}
