package io.recruitment.assessment.api.dto;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class NewsRequest {
    private String title;
    private String content;
}
