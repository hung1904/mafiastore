package com.h2.mafia.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.h2.mafia.response.MafiaStoreResponse;
import com.h2.mafia.utils.ResponseUtils;

public class AbstractController extends ResponseUtils {
	protected final Logger LOG = LoggerFactory.getLogger(getClass());
	
	protected static final String LIST = "list";
	protected static final String DETAIL = "detail";
	protected static final String CREATE = "create";
	protected static final String UPDATE = "update";
	protected static final String DELETE = "delete/{id}";
	
	protected MafiaStoreResponse success() {
		return msgResponse(com.h2.mafia.common.RestCode.SUCCESS);
	}
}
