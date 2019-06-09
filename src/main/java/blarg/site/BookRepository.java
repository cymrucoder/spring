package blarg.site;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cymrucoder
 */
@Repository
@Configurable
public interface BookRepository extends CrudRepository<Book, Long> {

}
