package com.javawhizz.questions;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

@Repository
@RequiredArgsConstructor
public class QuestionRepository {
    private final ObjectMapper objectMapper;

    public List<Response> fetchQuestions(Request request) throws IOException {

        String baseURL = String.format("https://api.stackexchange.com/2.3/questions?fromdate=%s&todate=%s&order=desc&sort=votes&tagged=%S&site=stackoverflow\n",
                request.getFromDate(),
                request.getToDate(),
                request.getTag());

        URL url = new URL(baseURL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept-Encoding","gzip");

        InputStream inputStream = connection.getInputStream();
        if ("gzip".equals(connection.getContentEncoding())){
            inputStream = new GZIPInputStream(inputStream);
        }

        String decompressResponse = IOUtils.toString(inputStream, StandardCharsets.UTF_8);

        ItemsWrapper response = objectMapper.readValue(decompressResponse, ItemsWrapper.class);

        List<Response> responses = new ArrayList<>();

        for (Item item : response.getItems()) {
            Response theResponse = Response.builder()
                    .isAnswered(item.isAnswered())
                    .score(item.getScore())
                    .link(item.getLink())
                    .title(item.getTitle())
                    .build();
            responses.add(theResponse);
        }

        return responses;

    }
}
