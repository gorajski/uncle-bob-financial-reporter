package models;

import lombok.Data;

import java.util.Map;

@Data
public class ScreenViewModel {
    private String title;
    private String logoUrl;
    private Map<String, Integer> accounts;
}
