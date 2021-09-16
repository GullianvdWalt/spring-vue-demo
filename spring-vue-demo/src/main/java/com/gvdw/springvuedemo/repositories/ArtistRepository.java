package com.gvdw.springvuedemo.repositories;

import com.gvdw.springvuedemo.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Gullian Van Der Walt
 * Created at 10:32 on Sep, 2021
 */
public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
