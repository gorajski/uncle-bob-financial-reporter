package models;

import lombok.Data;

import java.util.Map;

@Data
public class PrintViewModel {
    private String title;
    private Map<String, Integer> accounts;
}
