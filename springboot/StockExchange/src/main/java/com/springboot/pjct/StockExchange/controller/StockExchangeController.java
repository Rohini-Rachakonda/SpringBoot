package com.springboot.pjct.StockExchange.controller;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.pjct.StockExchange.dao.StockExchangeRepository;
import com.springboot.pjct.StockExchange.pojos.StockExchange;


@RestController
@CrossOrigin(origins="*",allowedHeaders="*")
@RequestMapping("stockexchange")
public class StockExchangeController {
	@Autowired
	private StockExchangeRepository stockexchangeRepository;

	@RequestMapping("/getAllStockExchange")
	public Iterable<StockExchange> getAllStockExchange() {

		return stockexchangeRepository.findAll();

	}

	@PostMapping("/saveStockExchange")

	public StockExchange saveStockExchange(@RequestBody StockExchange stockexchange) {

		System.out.println(stockexchange);

		stockexchangeRepository.save(stockexchange);

		return stockexchange;

	}

	@PutMapping("/updateStockExchange/{Id}")

	public StockExchange updateStockExchange(@RequestBody StockExchange stockexchange,

			@PathVariable("Id") Integer id) {

		stockexchange.setId(id);

		System.out.println(stockexchange);

		stockexchangeRepository.save(stockexchange);

		return stockexchange;

	}

	@DeleteMapping("/deletestockexchange/{Id}")

	public Boolean deleteStockExchange(@PathVariable("Id") Integer id) {

		System.out.println(id);

		stockexchangeRepository.deleteById(id);
		;

		return true;

	}

	@GetMapping("/find/{Id}")

	public StockExchange find(@PathVariable("Id") Integer id)

	{

		Optional<StockExchange> stockexchange = stockexchangeRepository.findById(id);

		return stockexchange.get();

	}

}
