package iuh.fit.productservice.controller;

import iuh.fit.productservice.entity.Product;
import iuh.fit.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/list")
    public String getList(Model model){
        List<Product> products = productService.getListProduct();
        model.addAttribute("products",products);
        return  "list";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
        return "redirect:/products/list";
    }

}
