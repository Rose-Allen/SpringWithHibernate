package kz.dimash.spring.services;

import kz.dimash.spring.models.Item;
import kz.dimash.spring.models.Person;
import kz.dimash.spring.repositories.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ItemsService {

    private final ItemsRepository itemsRepository;


    @Autowired
    public ItemsService(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }
    public List<Item> findByItemName(String itemName){
        return  itemsRepository.findByItemName(itemName);
    }
    public List<Item> findByPerson(Person person){
        return itemsRepository.findByPerson(person);
    }


}
