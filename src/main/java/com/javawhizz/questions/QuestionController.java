package com.javawhizz.questions;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.time.LocalDate;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;

    @GetMapping
    public String home(){
        return "index";
    }

    @GetMapping("/questions")
    public String fetchQuestions(@RequestParam("tag") String tag,
                                 @RequestParam("fromDate") String fromDate,
                                 @RequestParam("toDate") String toDate, Model model) throws IOException {
        Request request = Request.builder()
                .tag(tag)
                .fromDate(LocalDate.parse(fromDate))
                .toDate(LocalDate.parse(toDate))
                .build();

        model.addAttribute("question", questionService.fetchQuestions(request));

        return "index";
    }
}
