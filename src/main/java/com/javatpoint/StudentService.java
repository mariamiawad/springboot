package com.javatpoint;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	public Date[] date(Date date, int session, List<Integer> days) {
		return new Date[] { new Date() };
	}
}
