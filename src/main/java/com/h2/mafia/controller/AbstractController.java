package com.h2.mafia.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbstractController {
	protected final Logger LOG = LoggerFactory.getLogger(getClass());
	
	protected static final String LIST = "list";
	protected static final String DETAIL = "detail";
	protected static final String CREATE = "create";
	protected static final String UPDATE = "update";
	protected static final String DELETE = "delete/{id}";
	
	
}
