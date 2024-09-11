package inhatc.cse.jiminshop.item.repository;

import inhatc.cse.jiminshop.item.entity.Item;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ItemRepositoryTest2 {

    @Autowired
    private ItemRepository itemRepository;


    @Test
    public void test() {
        System.out.println("AAAAAAAAAAAAAAA");
    }

    @Test
    @DisplayName("상품 등록 테스트")
    public void insertItemTest() {
        Item item = Item.builder()
                .itemNm("신상품2")
                .itemDetail("신상품 상세 설명2")
                .price(20000)
                .stockNumber(200)
                .build();

        Item savedItem = itemRepository.save(item);
        System.out.println(savedItem);
    }

    @Test
    public void findByItemNm() {
        List<Item> itemList = itemRepository.findByItemNm("신상품2");
        itemList.forEach(System.out::println);
    }
}
