package com.springboot.pjct.StockExchange.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.pjct.StockExchange.pojos.StockExchange;


public interface StockExchangeRepository extends CrudRepository<StockExchange,Integer>{

}
