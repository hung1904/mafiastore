package com.h2.mafia.service;

import org.springframework.data.domain.Pageable;

import com.h2.mafia.response.MafiaStoreResponse;

public interface HomeService {
	
	MafiaStoreResponse getAllProduct(Pageable pageable);
}
