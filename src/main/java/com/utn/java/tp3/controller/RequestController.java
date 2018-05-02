package com.utn.java.tp3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.utn.java.tp3.model.Logs;
import com.utn.java.tp3.repository.LogRepository;

import eu.bitwalker.useragentutils.UserAgent;

@RestController
@RequestMapping("/api")
public class RequestController {

	@Autowired
	private LogRepository logsDao;

	@GetMapping(value = "/", produces = "application/json; charset=UTF-8")
	public ResponseEntity<List<?>> getAll() {
		try {
			return new ResponseEntity<List<?>>(logsDao.getAll(), HttpStatus.OK);
		} catch (Exception e) {
			if (logsDao.getAll() == null) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	}

	@GetMapping(value = "/mostUsed", produces = "application/json; charset=UTF-8")
	public ResponseEntity<List<?>> getMostUsed() {
		try {
			return new ResponseEntity<List<?>>(logsDao.mostCombination(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping(value = "/", produces = "text/plain")
	@ResponseBody
	public ResponseEntity<?> save(@RequestHeader(value = "User-Agent") String header) {
		try {
			UserAgent user = UserAgent.parseUserAgentString(header);
			Logs log = new Logs(user.getBrowser().getName(), user.getOperatingSystem().getName());
			logsDao.save(log);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
