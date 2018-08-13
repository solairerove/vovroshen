package com.vovroshen.huivpalto.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;

@Data
@JacksonXmlRootElement( localName = "channel" )
public class RssChannel implements Serializable
{
    @JacksonXmlProperty( localName = "title" )
    private String title;
}
