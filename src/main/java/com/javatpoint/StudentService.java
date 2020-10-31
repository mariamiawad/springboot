package com.javatpoint;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class StudentService implements StudentServiceInterface {
	public List<String> date(Date date, int[] days, int session) throws ParseException {
		Arrays.sort(days);
		List<String> sched = new ArrayList<>();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date curDate = new Date(date.getTime());
		int numOfSess = session * 30;
		int i = 0;
		while (i < numOfSess) {
			for (int j = 0; j < days.length && i < numOfSess; j++) {
				Date date2 = new Date(curDate.getTime() + (1000 * 60 * 60 * 24 * days[j]));
				String dateString = dateFormat.format(date2);
				sched.add(dateString);
				i++;
			}
			curDate = new Date(curDate.getTime() + (1000 * 60 * 60 * 24 * 7));

		}

		return sched;

	}

}