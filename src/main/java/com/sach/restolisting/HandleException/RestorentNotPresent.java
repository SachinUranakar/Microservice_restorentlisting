package com.sach.restolisting.HandleException;

public class RestorentNotPresent extends Exception {
String msg = "";

public RestorentNotPresent(String msg) {
	super();
	this.msg = msg;
}

public RestorentNotPresent() {
	super();
	// TODO Auto-generated constructor stub
}

public RestorentNotPresent(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
	// TODO Auto-generated constructor stub
}

public RestorentNotPresent(String message, Throwable cause) {
	super(message, cause);
	// TODO Auto-generated constructor stub
}

public RestorentNotPresent(Throwable cause) {
	super(cause);
	// TODO Auto-generated constructor stub
}

}
