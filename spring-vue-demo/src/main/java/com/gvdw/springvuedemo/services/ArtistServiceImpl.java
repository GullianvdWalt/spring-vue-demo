package com.gvdw.springvuedemo.services;

import com.gvdw.springvuedemo.models.Artist;
import com.gvdw.springvuedemo.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Gullian Van Der Walt
 * Created at 10:33 on Sep, 2021
 */
@Service("artistService")
public class ArtistServiceImpl implements ArtistService{

    private final ArtistRepository artistRepository;

    @Autowired
    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public List<Artist> getArtists() { return artistRepository.findAll(); }
}
