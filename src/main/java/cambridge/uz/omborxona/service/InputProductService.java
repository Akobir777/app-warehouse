package cambridge.uz.omborxona.service;

import cambridge.uz.omborxona.entity.Input;
import cambridge.uz.omborxona.entity.InputProduct;
import cambridge.uz.omborxona.payload.ApiResponse;
import cambridge.uz.omborxona.payload.InputProductDto;
import cambridge.uz.omborxona.repository.InputProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InputProductService {
@Autowired
InputProductRepository inputProductRepository;
    public ApiResponse getOne(Integer id) {
        Optional<InputProduct> byId = inputProductRepository.findById(id);
        if (byId.isEmpty())
            return new ApiResponse("not found", false);
        return new ApiResponse("mana", true, byId.get());
    }

    public ApiResponse getAll() {
        List<InputProduct> inputProducts = inputProductRepository.findAll();
        return new ApiResponse("mana", true, inputProducts);
    }

    public ApiResponse add(InputProductDto dto) {
        return new ApiResponse() ;
    }

    public ApiResponse edit(Integer id, InputProductDto dto) {
        return new ApiResponse() ;

    }

    public ApiResponse delete(Integer id) {
        return new ApiResponse() ;
    }
}
