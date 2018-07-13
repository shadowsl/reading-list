package readinglist;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * @author shadowsl
 * @version 1.0, 2018/7/13
 * @since reading list 1.0.0
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
