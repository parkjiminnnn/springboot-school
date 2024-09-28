package inhatc.cse.jiminshop.item.controller;

import inhatc.cse.jiminshop.item.dto.ItemDataDto;
import inhatc.cse.jiminshop.item.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {

    @GetMapping("/item/thymeleaf1")
    public String thymeleaf1(Model model) {
//        long id = 1L;
//        String isOdd = "";
//        for (int i = 1; i < 10; i++) {
//            id = i;
//            if (i % 2 == 0) {
//                isOdd = "짝수";
//            } else {
//                isOdd = "홀수";
//            }
//        }
        ItemDto itemDto = ItemDto.builder()
                .id(1L)
                .itemNm("상품명")
                .itemDetail("상품 상세 설명")
                .price(10000)
                .stockNumber(100)
//                .isOdd(isOdd)
                .build();
//        List<ItemDto> list = new ArrayList<>() {};
//        list.add(itemDto);

        model.addAttribute("item", itemDto);
        return "item/thymeleaf1";
    }

    @GetMapping("/item/thymeleaf2")
    public String thymeleaf2(ItemDataDto itemDataDto,
                             Model model
    ) {
        System.out.println("========: " + itemDataDto);
        model.addAttribute("item", itemDataDto);


        return "item/thymeleaf2";
    }
}
