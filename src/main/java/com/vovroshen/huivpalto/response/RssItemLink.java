package com.vovroshen.huivpalto.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

@Data
@JacksonXmlRootElement( localName = "link" )
public class RssItemLink
{
    @JacksonXmlText
    private String value;
}
