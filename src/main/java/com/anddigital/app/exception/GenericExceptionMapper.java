package com.anddigital.app.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<RegisterUserException> {

	public Response toResponse(RegisterUserException exception) {

		ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(),
				ErrorMessages.COULD_NOT_REGISTER_USER.name());

		return Response.status(Response.Status.BAD_REQUEST).entity(errorMessage).build();
	}

}
