package com.vovroshen.huivpalto.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement( localName = "item" )
public class RssItem
{
    @JacksonXmlProperty( localName = "title" )
    private String title;

    @JacksonXmlProperty( localName = "link" )
    private String link;

    @JacksonXmlProperty( localName = "description" )
    private String description;

    @JacksonXmlProperty( localName = "guid" )
    private RssGuid guid;

    // dc:creator

    @JacksonXmlProperty( localName = "pubDate" )
    private String pubDate;
}
