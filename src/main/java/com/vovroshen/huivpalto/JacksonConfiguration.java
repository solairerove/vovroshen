package com.vovroshen.huivpalto;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfiguration
{
    @Bean
    public ObjectMapper objectMapper()
    {
        return new ObjectMapper();
    }

    @Bean
    public XmlMapper xmlMapper()
    {
        final XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure( DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false );

        return xmlMapper;
    }
}
