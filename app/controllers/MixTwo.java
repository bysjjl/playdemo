package controllers;

import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

public class MixTwo extends Action.Simple{
	
	
	public Result call(Http.Context ctx) throws Throwable {
	    System.out.println("MixTwo...");
	    return delegate.call(ctx);
	  }

}
