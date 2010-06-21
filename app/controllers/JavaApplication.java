package controllers;

import play.mvc.*;
import java.text.SimpleDateFormat;
import java.util.Calendar; 
import java.util.Date;
import java.text.ParseException;

public class JavaApplication extends Controller {
	private final static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
	
	public static void index() {
    	String formatedDate = dateFormat.format(new Date());
    	render(formatedDate);
  	}

  	public static void calculate(String date, int extraDays) throws ParseException {
    	Calendar calendar = Calendar.getInstance();
		calendar.setTime(new SimpleDateFormat("MM/dd/yyyy").parse(date));
    	calendar.add(Calendar.DATE, extraDays);
    	renderText(dateFormat.format(calendar.getTime()));
  	}
}