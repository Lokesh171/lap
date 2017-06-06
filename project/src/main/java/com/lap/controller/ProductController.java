package com.lap.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lap.Model.Product;
import com.lap.Service.ProductService;


public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping("admin/product/productform")
	public String getProductForm(Model model){
		model.addAttribute("product",new Product());
		return "productform";
	}

		
	@RequestMapping("admin/product/saveproduct")
	public String saveProduct(@ModelAttribute(value="product") Product product){
		ProductService.SaveProduct(product);
		return "redirect:/all/product/productlist";
	}
	}

