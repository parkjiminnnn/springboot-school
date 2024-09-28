package inhatc.cse.jiminshop.item.dto;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@Builder
public class ItemDataDto {
    private String name;
    private int age;
    private String dept;
    private int grade;
}
