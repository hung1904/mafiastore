package com.h2.mafia.common;

public enum RestCode {
	SUCCESS(1, "Success"),
	ERROR(2, "Error"),
	BAD_REQUEST(3, "Bad Request"),
	PARAMETER_INVALID(4, "Parameter invalid"),
	ACCESS_DENIED(5, "Access Denied"),
	UNAUTHENTICATED(6, "Unauthenticated"),
	NOT_FOUND(7, "Not Found"),
	ERROR_INTERNAL_SERVER(8, "Error Internal Server"),
	NO_CONTENT(9, "No Content"),
	VALIDATE_DELETE_TASK(10, "Validate Delete Task"),
	NOT_SUPPORT_ADMIN(11, "Not Support Admin")
	;
	private final int code;
    private final String description;
    private ResponseType responseType;
    
    private RestCode(final int code, final String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
		return code;
	}
    
    public String getCodeString() {
		return String.valueOf(code);
	}

	public String getDescription() {
		return description;
	}

	public ResponseType getResponseType() {
		return responseType;
	}
}
