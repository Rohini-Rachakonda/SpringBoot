package com.springboot.pjct.StockPrice.dao;
import org.springframework.data.repository.CrudRepository;

import com.springboot.pjct.StockPrice.pojos.StockPrice;

public interface StockPriceRepository extends CrudRepository<StockPrice,String> {

}
