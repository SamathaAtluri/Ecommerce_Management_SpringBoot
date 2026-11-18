
package com.vcube.Ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.Ecommerce.entity.Category;
import com.vcube.Ecommerce.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/add")
    public Category addCategory(@RequestBody Category category) {
        return categoryService.addCategory(category);
    }

    @GetMapping("/all")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Optional<Category> getCategoryById(@PathVariable Integer id) {
        return categoryService.getCategoryById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable Integer id) {
        categoryService.deleteCategory(id);
        return "Category deleted successfully";
    }
}
