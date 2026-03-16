package org.example.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Link {
    private long id;
    private String url;
    private String title;
    private String userId;
    private LocalDateTime createdAt;

}
