package com.koscida.svdapi.svdapi.business.sitemap;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(value = XmlAccessType.NONE)
@XmlRootElement(name = "urlset", namespace = "http://www.sitemaps.org/schemas/sitemap/0.9")
public class XmlUrlSet {

	@XmlElements({ @XmlElement(name = "url", type = XmlUrl.class) })
	private Collection<XmlUrl> xmlUrls = new ArrayList<>();

	public void addUrl(XmlUrl xmlUrl) {
		xmlUrls.add(xmlUrl);
	}

	public Collection<XmlUrl> getXmlUrls() {
		return xmlUrls;
	}
}
