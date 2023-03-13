package com.javawhizz.questions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
@Data
public class ItemsWrapper {
    @JsonProperty("items")
    private List<Item> items;

    @JsonProperty("has_more")
    private boolean hasMore;

    @JsonProperty("quota_max")
    private long quotaMax;

    @JsonProperty("quota_remaining")
    private long quotaRemaining;
}
