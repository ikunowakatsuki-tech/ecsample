package com.example.controller.entity;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class Product {
	private int id;
	private String name;
	private int price;

	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@GetMapping("/product/{id}")
	public String showDetail(@PathVariable("id") int id, Model model) {
		Product product;
		if (id == 1) {
			product = new Product(1, "コーヒーカップ", 1200);
		} else if (id == 2) {
			product = new Product(2, "ティーポット", 2400);
		} else {
			product = new Product(0, "未登録の商品", 0);
		}
		model.addAttribute("product", product);
		return "product/detail";
	}
}
