package Interface;

public interface GenericDAO<T> {
	abstract public void actualizar(Class<T> Objeto);
	abstract public void borrar(Class<T> Objeto);
	abstract public void persistir(Class<T> Objeto);
	abstract public void recuperar(Class<T> Objeto);
	abstract public void existe(Class<T> Objeto);
	
		
	
}
