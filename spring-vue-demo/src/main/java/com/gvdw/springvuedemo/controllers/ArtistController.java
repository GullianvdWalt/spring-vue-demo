package com.gvdw.springvuedemo.controllers;

import com.gvdw.springvuedemo.models.Artist;
import com.gvdw.springvuedemo.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Gullian Van Der Walt
 * Created at 10:36 on Sep, 2021
 */
@RestController
@RequestMapping("/artist-api")
@CrossOrigin("http://localhost:8081/") // Avoid CORS Errors
public class ArtistController {

    private final ArtistService artistService;

    @Autowired
    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping("/get-artists")
    public List<Artist> getArtists(){
        return artistService.getArtists();
    }

}
