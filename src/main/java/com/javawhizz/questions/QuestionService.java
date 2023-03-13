package com.javawhizz.questions;

import java.io.IOException;
import java.util.List;

public interface QuestionService {
    List<Response> fetchQuestions(Request request) throws IOException;
}
