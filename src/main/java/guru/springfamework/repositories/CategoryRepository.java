package guru.springfamework.repositories;

import guru.springfamework.domain.Category;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Yera Soni on 2022-04-11
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}
