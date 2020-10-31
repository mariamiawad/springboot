package com.javatpoint;

import java.text.ParseException;
import java.util.Date;
import java.util.List;


public interface StudentServiceInterface {

	public List<String> date(Date date, int[] days, int session) throws ParseException;

}
