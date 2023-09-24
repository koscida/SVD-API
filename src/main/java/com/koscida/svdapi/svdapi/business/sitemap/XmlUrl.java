package com.koscida.svdapi.svdapi.business.sitemap;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(value = XmlAccessType.NONE)
@XmlRootElement(name = "url")
public class XmlUrl {

	public enum Priority {
		HIGH("1.0"), MEDIUM("0.5");

		private String value;

		Priority(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	@XmlElement
	private String loc;

	@XmlElement
	private String lastmod;

	@XmlElement
	private String changefreq = "daily";

	@XmlElement
	private String priority;

	@XmlElement
	private String method;

	public XmlUrl() {
		setLastmod();
	}

	public XmlUrl(String loc, String method, Priority priority) {
		this.loc = loc;
		this.priority = priority.getValue();
		this.method = method;
		setLastmod();
	}

	private void setLastmod() {
		this.lastmod = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}

	public String getLoc() {
		return loc;
	}

	public String getPriority() {
		return priority;
	}

	public String getMethod() {
		return method;
	}

	public String getChangefreq() {
		return changefreq;
	}

	public String getLastmod() {
		return lastmod;
	}

}
