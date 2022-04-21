package guru.springfamework.repositories;

import guru.springfamework.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Yera Soni on 2022-04-12
 */
public interface CustomerRepository extends JpaRepository<Customer, Long>{
}