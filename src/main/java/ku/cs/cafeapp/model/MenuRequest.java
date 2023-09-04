package ku.cs.cafeapp.model;

import lombok.Data;

import java.util.UUID;

@Data
public class MenuRequest {
    private String name;
    private double price;
    private UUID categoryId;
}
