package com.vovroshen.huivpalto;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

@Service
public class RssService
{
    @Value( "${rss.file.path}" )
    private String rssPath;

    public String readRss()
    {
        final ClassLoader classLoader = getClass().getClassLoader();
        final File file = new File( Objects.requireNonNull( classLoader.getResource( rssPath ) ).getFile() );

        try
        {
            return FileUtils.readFileToString( file, Charset.defaultCharset() );
        }
        catch( IOException e )
        {
            e.printStackTrace();
        }

        return rssPath;
    }
}
