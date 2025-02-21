package ec.edu.puce.security;

import java.io.Serializable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponseDTO<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	private boolean success;

	@NotNull
	private T result;

	private String message;

	public static <T> ApiResponseDTO<T> success(T data, String message) {
		return new ApiResponseDTO<>(true, data, message);
	}

	public static ApiResponseDTO<String> error(String message) {
		return new ApiResponseDTO<>(false, null, message);
	}
}
