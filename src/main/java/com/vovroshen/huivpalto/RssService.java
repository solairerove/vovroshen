package com.vovroshen.huivpalto;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.vovroshen.huivpalto.response.RssFeedResponse;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class RssService
{
    @Value( "${rss.file.path}" )
    private String rssPath;

    private final XmlMapper xmlMapper;

    public RssFeedResponse readRss()
    {
        final ClassLoader classLoader = getClass().getClassLoader();
        final File file = new File( Objects.requireNonNull( classLoader.getResource( rssPath ) ).getFile() );

        try
        {
            final String data = FileUtils.readFileToString( file, Charset.defaultCharset() );

            return xmlMapper.readValue( data, RssFeedResponse.class );
        }
        catch( IOException e )
        {
            e.printStackTrace();
        }

        return null;
    }
}
