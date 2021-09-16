import axios from 'axios';



const ARTIST_API_BASE_URL = "http://localhost:8080/artist-api";

class ArtistService {
    getArtists() { return axios.get(ARTIST_API_BASE_URL + "/get-artists"); }
}

export default new ArtistService();