package tim_store_app.services;

import org.springframework.web.multipart.MultipartFile;
import tim_store_app.GenericResponse;
import tim_store_app.dtos.request.ProductRequestDTO;
import tim_store_app.dtos.response.ProductResponseDTO;


import java.util.List;


public interface ProductService {

    List<ProductResponseDTO> getAllProducts();

    GenericResponse saveProduct(ProductRequestDTO productRequestDTO, MultipartFile productImage, MultipartFile previewImage);


    GenericResponse deleteProduct(Long id);

    GenericResponse editProduct(Long id, ProductRequestDTO productRequestDTO);

    GenericResponse hideProduct(Long id);

    ProductResponseDTO getProductById(Long productId);

}
