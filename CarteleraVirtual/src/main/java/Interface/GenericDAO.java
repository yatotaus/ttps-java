package Interface;

import java.util.List;

public interface GenericDAO<T> {
	public void agregar(T cartelera);
	public T actualizar(T Objeto);
	public void eliminar(T entity);
	public T eliminar(int id);
	public T buscar(Long id);
	public T buscar(String nombre);
	public List<T> listado();
	/*
	 * ver estos tres
	*/
	 public void persistir(T Objeto);
	 public void recuperar(T Objeto);
	 public void existe(T Objeto);

}
