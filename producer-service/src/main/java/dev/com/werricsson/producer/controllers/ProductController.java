package dev.com.werricsson.producer.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import dev.com.werricsson.producer.services.ProductService;
import lombok.RequiredArgsConstructor;
import main.java.dtos.ProductDTO;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/products")
public class ProductController {
	
	private final ProductService service;
	
	@PostMapping
	public ResponseEntity<ProductDTO> produces(@RequestBody ProductDTO dto) {
		service.createProduct(dto);
		return ResponseEntity.status(CREATED).build();
	}
}
