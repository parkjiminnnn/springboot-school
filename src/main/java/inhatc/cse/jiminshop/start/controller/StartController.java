package inhatc.cse.jiminshop.start.controller;

import inhatc.cse.jiminshop.start.dto.StartDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartController {

    @GetMapping("/")
    public String start(Model model){
        StartDto startDto = StartDto.builder()
                .name("홍길동")
                .grade(1)
                .dept("컴퓨터공학")
                .build();
        model.addAttribute("data",startDto);
        return "temp/temp";
    }
}