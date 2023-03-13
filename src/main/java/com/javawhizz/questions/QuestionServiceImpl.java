package com.javawhizz.questions;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService{
    private final QuestionRepository questionRepository;
    @Override
    public List<Response> fetchQuestions(Request request) throws IOException {
        return questionRepository.fetchQuestions(request);
    }
}
