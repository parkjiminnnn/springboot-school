package inhatc.cse.jiminshop.start.dto;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@Builder
public class StartDto {
    private String name;
    private int grade;
    private String dept;

}