package com.vovroshen.huivpalto.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement( localName = "rss" )
public class RssFeedResponse
{
    @JacksonXmlProperty( localName = "channel" )
    @JacksonXmlElementWrapper
    private RssChannel rssChannel;
}
