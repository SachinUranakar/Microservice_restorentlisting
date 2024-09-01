package com.sach.restolisting.advice;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sach.restolisting.HandleException.RestorentNotPresent;

@RestControllerAdvice
public class ErrorAdvice {

	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String> handleException(MethodArgumentNotValidException exception){
		Map<String, String> valreturn = new HashMap<String, String>();
		exception.getBindingResult().getFieldErrors().forEach(val->valreturn.put(val.getField(),val.getDefaultMessage()));
		return valreturn;
	}
	@ExceptionHandler(NoSuchElementException.class)
	public Map<String, String> handleRestoexception(NoSuchElementException ex){
		Map<String, String> exception = new HashMap();
		exception.put("Errormsg", ex.getMessage());
		return exception;
		
	}
}
