package com.vovroshen.huivpalto;

import com.vovroshen.huivpalto.response.RssFeedResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping( "/rss" )
public class RssController
{
    private final RssService rssService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE )
    public ResponseEntity<RssFeedResponse> getRss()
    {
        final RssFeedResponse rssFeed = rssService.readRss();

        return ResponseEntity.ok().body( rssFeed );
    }
}
