package com.vovroshen.huivpalto.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;

@Data
@JacksonXmlRootElement( localName = "rss" )
public class RssFeedResponse implements Serializable
{
    @JacksonXmlProperty( localName = "channel" )
    @JacksonXmlElementWrapper
    private RssChannel rssChannel;
}
