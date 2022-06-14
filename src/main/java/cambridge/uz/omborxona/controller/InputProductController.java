package cambridge.uz.omborxona.controller;


import cambridge.uz.omborxona.entity.InputProduct;
import cambridge.uz.omborxona.payload.ApiResponse;
import cambridge.uz.omborxona.payload.InputDto;
import cambridge.uz.omborxona.payload.InputProductDto;
import cambridge.uz.omborxona.service.InputProductService;
import cambridge.uz.omborxona.service.InputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inputproduct")
public class InputProductController {
    @Autowired
    InputProductService inputProducrService;

    @GetMapping("/{id}")
    public HttpEntity<?> getInputProductById(@PathVariable Integer id) {
        ApiResponse apiResponse = inputProducrService.getOne(id);
        return ResponseEntity.status(apiResponse.isSuccess() ? 201 : 409).body(apiResponse);
    }

    @GetMapping
    public HttpEntity<?> getInputProductAll() {
        ApiResponse apiResponse = inputProducrService.getAll();
        return ResponseEntity.status(apiResponse.isSuccess() ? 201 : 409).body(apiResponse);
    }

    @PostMapping
    public HttpEntity<?> addInputProduct(@RequestBody InputProductDto dto) {
        ApiResponse apiResponse = inputProducrService.add(dto);
        return ResponseEntity.status(apiResponse.isSuccess() ? 201 : 409).body(apiResponse);
    }
    @PutMapping("/{id}")
    public HttpEntity<?> editInputProduct(@PathVariable Integer id,@RequestBody InputProductDto dto) {
        ApiResponse apiResponse = inputProducrService.edit(id,dto);
        return ResponseEntity.status(apiResponse.isSuccess() ? 201 : 409).body(apiResponse);
    }
    @DeleteMapping("/{id}")
    public HttpEntity<?> editInputProduct(@PathVariable Integer id) {
        ApiResponse apiResponse = inputProducrService.delete(id);
        return ResponseEntity.status(apiResponse.isSuccess() ? 201 : 409).body(apiResponse);
    }
}
