package tim_store_app.dtos.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class ProductRequestDTO {

    @NotNull(message = "Product name cannot be empty")
    private String name;

    private String category;

    private String productId; // Change type to String if it's an identifier

    @NotNull(message = "Price must be provided")
    private Integer price;

    @NotNull(message = "Quantity must be provided")
    private Integer quantity;

    private String color;

    @NotEmpty(message = "Sizes cannot be empty")
    private List<String> sizes;
}
