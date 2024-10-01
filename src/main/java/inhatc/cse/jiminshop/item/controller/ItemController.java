package inhatc.cse.jiminshop.item.controller;

import inhatc.cse.jiminshop.item.dto.ItemDataDto;
import inhatc.cse.jiminshop.item.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {
    @GetMapping("/item/thymeleaf1")
    public String thymeleaf1(Model model) {
        ItemDto itemDto = ItemDto.builder()
                .id(1L)
                .itemNm("상품명123")
                .itemDetail("상품상세설명123")
                .price(10000)
                .stockNumber(100)
                .build();

        model.addAttribute("item", itemDto);
        return "item/thymeleaf1";   //view단으로 갈때는 기본적으로 루트가 붙어서 /안해줘도 됨.
    }

    @GetMapping("/item/thymeleaf2")
    public String thymeleaf2(ItemDataDto itemDataDto, Model model) {
        System.out.println("==================이름" + itemDataDto);
        model.addAttribute("item", itemDataDto);

        return "item/thymeleaf2";
    }

    @GetMapping("/temp/temp")
    public String ex() {

        return "temp/temp";
    }

    @GetMapping("/item/thymeleaf3")
    public String thymeleaf3(Model model) {
        List<ItemDto> itemDtoList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ItemDto itemDto = new ItemDto();
            itemDto.setItemDetail("상품상세설명" + i);
            itemDto.setItemNm("테스트상품 " + i);
            itemDto.setPrice(1000 * i);
            itemDto.setStockNumber(10 * i);

            itemDtoList.add(itemDto);

        }
        model.addAttribute("itemDtoList", itemDtoList);
        return "item/thymeleaf3";
    }

    @GetMapping("/item/thymeleaf4")
    public String thymeleaf4(Model model) {
        List<ItemDto> itemDtoList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ItemDto itemDto = new ItemDto();
            itemDto.setItemDetail("상품상세설명" + i);
            itemDto.setItemNm("테스트상품 " + i);
            itemDto.setPrice(1000 * i);
            itemDto.setStockNumber(10 * i);

            itemDtoList.add(itemDto);

        }
        model.addAttribute("itemDtoList", itemDtoList);
        return "item/thymeleaf4";
    }
}
