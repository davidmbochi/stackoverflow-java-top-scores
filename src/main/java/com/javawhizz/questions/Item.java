package com.javawhizz.questions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Item {
    @JsonProperty("tags")
    private List<String> tags;

    @JsonProperty("owner")
    private Owner owner;

    @JsonProperty("is_answered")
    private boolean isAnswered;

    @JsonProperty("view_count")
    private int viewCount;

    @JsonProperty("answer_count")
    private long answerCount;


    @JsonProperty("score")
    private int score;


    @JsonProperty("last_activity_date")
    private long lastActivityDate;

    @JsonProperty("creation_date")
    private long creationDate;

    @JsonProperty("last_edit_date")
    private long lastEditDate;

    @JsonProperty("question_id")
    private long questionId;

    @JsonProperty("content_license")
    private String contentLicense;

    @JsonProperty("link")
    private String link;

    @JsonProperty("title")
    private String title;

    @JsonProperty("accepted_answer_id")
    private long acceptedAnswerId;

    @JsonProperty("protected_date")
    private long protectedDate;

    @JsonProperty("closed_date")
    private long closedDate;

    @JsonProperty("closed_reason")
    private String closedReason;
}
