package com.javawhizz.questions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Owner {
    @JsonProperty("account_id")
    private int accountId;

    @JsonProperty("reputation")
    private int reputation;

    @JsonProperty("user_id")
    private int userId;

    @JsonProperty("user_type")
    private String userType;

    @JsonProperty("profile_image")
    private String profileImage;

    @JsonProperty("display_name")
    private String displayName;

    @JsonProperty("link")
    private String link;

    @JsonProperty("accept_rate")
    private int acceptRate;
}
