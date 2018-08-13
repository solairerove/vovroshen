package com.vovroshen.huivpalto.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement( localName = "channel" )
public class RssChannel
{
    @JacksonXmlProperty( localName = "title" )
    private String title;

    @JacksonXmlProperty( localName = "description" )
    private String description;

    @JacksonXmlProperty( localName = "link" )
    private String link;

    // atom:link

    @JacksonXmlProperty( localName = "lastBuildDate" )
    private String lastBuildDate;

    @JacksonXmlProperty( localName = "ttl" )
    private String ttl;

    // sy:updatePeriod

    // sy:updateFrequency

    @JacksonXmlProperty( localName = "item" )
    @JacksonXmlElementWrapper( useWrapping = false )
    private RssItem[] rssItem;
}
