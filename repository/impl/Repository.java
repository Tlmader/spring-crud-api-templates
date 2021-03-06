import org.springframework.stereotype.Component;

/**
 * Implements data access methods for ${NAME} entities.
 *
 * @author tlmader.dev@gmail.com
 * @since ${DATE}
 */
@Component
public class ${NAME}Repository extends CrudRepository<${NAME}> {

    public ${NAME}Repository() {
        super((x, y) -> {
            x.setName(y.getName());
        }, ${NAME}.class);
    }
}
