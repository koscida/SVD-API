package com.koscida.svdapi.svdapi.webservice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import com.koscida.svdapi.svdapi.business.sitemap.XmlUrl;
import com.koscida.svdapi.svdapi.business.sitemap.XmlUrlSet;

@RestController
@RequestMapping("")
public class SiteMapController {

	private final RequestMappingHandlerMapping re;

	public SiteMapController(RequestMappingHandlerMapping re) {
		this.re = re;
	}

	@GetMapping("/sitemap.xml")
	@ResponseBody
	public XmlUrlSet getSiteMapping() {
		// Xml classes:
		// https://mehmetozanguven.com/spring-boot/spring-boot-create-sitemap-xml-controller/
		// add javax:
		// https://www.javaguides.net/2020/01/java-jaxb-example-tutorial-java-11.html

		// build xml set
		XmlUrlSet xmlUrlSet = new XmlUrlSet();

		// get all the method urls
		Map<RequestMappingInfo, HandlerMethod> handlerMethods = re.getHandlerMethods();
		List<String> urls = new ArrayList<>();
		for (Entry<RequestMappingInfo, HandlerMethod> entry : handlerMethods.entrySet()) {
			// urls.addAll((entry.getKey().getPatternsCondition().getPatterns()));
			// urls.add(entry.getKey().toString());

			// create xml
			if (!entry.getKey().isEmptyMapping()) {
				xmlUrlSet.addUrl(new XmlUrl(
						entry.getKey().getActivePatternsCondition().toString(),
						entry.getKey().getMethodsCondition().toString(),
						XmlUrl.Priority.HIGH));
			}
		}

		return xmlUrlSet;
	}

}
