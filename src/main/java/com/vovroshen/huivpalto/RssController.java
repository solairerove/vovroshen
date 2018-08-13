package com.vovroshen.huivpalto;

import lombok.RequiredArgsConstructor;
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

    @GetMapping( "/" )
    public ResponseEntity<String> getRss()
    {
        final String rssFeed = rssService.readRss();

        return ResponseEntity.ok().body( rssFeed );
    }
}
