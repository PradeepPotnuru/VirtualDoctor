package com.accenture.innovation.VirtualDoctor.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.accenture.innovation.VirtualDoctor.bean.Disease;

@Controller

public class DiseaseController {

	@RequestMapping(method = RequestMethod.GET,value="disease")
	public String disease(@ModelAttribute("disease") Disease disease, ModelMap model) {
		model.addAttribute("name", disease.getDisease_name());

		return "result";
	}
}
