package inhatc.cse.jiminshop.item.repository;

import inhatc.cse.jiminshop.item.entity.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ItemRepositoryTest3 {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    void findItemDetail() {
        List<Item> items = itemRepository.findItemDetail("2");
        items.forEach(System.out::println);
    }

    @Test
    void findItemDetailNative() {
        List<Item> items = itemRepository.findItemDetailNative("신상품");
        items.forEach(System.out::println);
    }
}