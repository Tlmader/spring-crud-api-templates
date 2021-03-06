import java.util.List;

/**
 * Defines methods for handling orchestration of workflows and performing calls to repositories.
 *
 * @param <T>
 * @author tlmader.dev@gmail.com
 * @since 2016-11-20
 */
public interface ICrudService<T> {

    /**
     * Return all <T> entities.
     *
     * @return the list of <T>
     */
    List<T> getAll();

    /**
     * Returns a specific <T> by an ID.
     *
     * @param id an ID for a <T>
     * @return the <T> found by the ID
     */
    T get(Long id);

    /**
     * Creates a new <T>.
     *
     * @param id an ID for a <T>
     * @param entity a <T> to be created
     * @return the created <T>
     */
    T create(Long id, T entity);

    /**
     * Updates an existing <T>.
     *
     * @param id an ID for a <T>
     * @param entity a <T> to be updated
     * @return the updated <T>
     */
    T update(Long id, T entity);

    /**
     * Deletes a specific <T> by an ID.
     *
     * @param id an ID for a <T>
     */
    void delete(Long id);
}
