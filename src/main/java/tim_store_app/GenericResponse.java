package tim_store_app;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenericResponse {
//    private String code;
    private String message;

    @JsonIgnore
    private HttpStatus httpStatus;

//    private Object data;
//
//    public GenericResponse(Object data) {
//        this.data = data;
//    }
//
//        private Map<String, Object> metadata;
//
//    public GenericResponse(String code, String message, HttpStatus httpStatus) {
//        this.code = code;
//        this.message = message;
//        this.httpStatus = httpStatus;
//    }
//
//    public GenericResponse(String code, String message, HttpStatus httpStatus, Object data) {
//        this.code = code;
//        this.message = message;
//        this.httpStatus = httpStatus;
//        this.data = data;
//    }

}
