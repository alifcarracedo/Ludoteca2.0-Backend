package com.ccsw.ludoteca_2_backend.product;

import com.ccsw.ludoteca_2_backend.product.model.Product;
import com.ccsw.ludoteca_2_backend.product.model.ProductDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Tag(name = "Product", description = "API of Product")
@RequestMapping(value = "/product")
@RestController
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    ModelMapper mapper;

    @Operation(summary = "Find", description = "Method that return a filtered list of Products")
    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<ProductDto> find(@RequestParam(value = "title", required = false) String title,
                                @RequestParam(value = "idCategory", required = false) Long idCategory,
                                @RequestParam(value = "subcategory", required = false) String subcategory,
                                @RequestParam(value = "age", required = false) Integer age) {

        List<Product> products = productService.find(title, idCategory, subcategory, age);

        return products.stream().map(e -> mapper.map(e, ProductDto.class)).collect(Collectors.toList());
    }

    @Operation(summary = "Save or Update", description = "Method that saves or updates a Game")
    @RequestMapping(path = { "", "/{id}" }, method = RequestMethod.PUT)
    public void save(@PathVariable(name = "id", required = false) Long id, @RequestBody ProductDto dto) {

        productService.save(id, dto);
    }

}
