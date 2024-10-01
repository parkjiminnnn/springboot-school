package inhatc.cse.jiminshop.item.dto;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemDto {

    private Long id;

    private String itemNm;

    private int price;

    private int stockNumber;

    private String itemDetail;

    private String isOdd;
}
