package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TransferRecordsCtrl extends BaseCtrl  {

	
	@RequestMapping(value="/transferRecordsIndex.do",method=RequestMethod.GET)
	public String otherIndex(Model model) {
		
		
		
		return "TransferRecords";
	}
	
}
