package com.vovroshen.huivpalto.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

@Data
@JacksonXmlRootElement( localName = "guid" )
public class RssGuid
{
    @JacksonXmlProperty( localName = "isPermaLink", isAttribute = true )
    private String isPermaLink;

    @JacksonXmlText
    private String value;
}
