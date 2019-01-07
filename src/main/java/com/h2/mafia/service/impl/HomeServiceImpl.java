package com.h2.mafia.service.impl;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.h2.mafia.common.ResponseType;
import com.h2.mafia.common.RestCode;
import com.h2.mafia.model.Product;
import com.h2.mafia.repository.ProductRepository;
import com.h2.mafia.response.MafiaStoreResponse;
import com.h2.mafia.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {
	private static final Logger log = LoggerFactory.getLogger(HomeServiceImpl.class);
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public MafiaStoreResponse getAllProduct(Pageable pageable) {
		log.info("Start method getAllProduct");
		MafiaStoreResponse mafiaStoreResponse = new MafiaStoreResponse(ResponseType.ERROR.getValue(),
				RestCode.ERROR.getCode(), RestCode.ERROR.getDescription());
		try {
			List<Product> listProduct = productRepository.getAllProduct(pageable);
			mafiaStoreResponse.setData(listProduct);
		} catch (Exception e) {
			log.error("Error with getAllProduct cause by: ",e.getMessage());
			mafiaStoreResponse.setCode(RestCode.ERROR.getCode());
			mafiaStoreResponse.setMessage(RestCode.ERROR.getDescription());
		}
		log.info("End method getAllProduct");
		return mafiaStoreResponse;
	}
}