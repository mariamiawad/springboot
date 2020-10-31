package com.javatpoint;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class StudentController {
	@Autowired
	StudentService studentService;

	@PostMapping("/calc")
	@ResponseBody
	public List<String> date(@RequestParam("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date,
			@RequestParam("session") int session, @RequestParam("days") int[] days) throws ParseException {
		return studentService.date(date, days, session);
	}

}
