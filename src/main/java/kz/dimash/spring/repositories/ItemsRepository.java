package kz.dimash.spring.repositories;

import kz.dimash.spring.models.Item;
import kz.dimash.spring.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ItemsRepository extends JpaRepository<Item, Integer> {
    List<Item> findByItemName(String itemName);

    List<Item> findByPerson(Person person);

}
