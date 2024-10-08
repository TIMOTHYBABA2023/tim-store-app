package tim_store_app.dtos.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class ProductResponseDTO {

    private Long id;
    private String productId;
    private String name;
    private String category;
    private int price;
    private int quantity;
    private String imageUrl;
    private String imageReviewUrl;
    private String color;
    private List<String> sizes;
    private boolean hideProduct;

}
