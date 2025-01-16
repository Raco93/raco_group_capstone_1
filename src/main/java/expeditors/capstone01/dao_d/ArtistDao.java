package expeditors.capstone01.dao_d;

import expeditors.capstone01.domian_r.Artist;
import expeditors.capstone01.domian_r.Track;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ArtistDao {

    private final Map<Integer, Artist> artists = new HashMap<>();

    private static final AtomicInteger nextId = new AtomicInteger(1);

    public void addArtist(Artist artist) {
        artist.setId(nextId.getAndIncrement());
        artists.put(artist.getId(), artist);
    }

    public Artist getArtistById(int id) {

        return artists.get(id);
    }

    public Map<Integer, Artist> getAllArtists() {
        return artists;
    }

    public void updateArtist(Artist artist) {
        if (artists.containsKey(artist.getId())) {
            artists.put(artist.getId(), artist);
        }
    }

    public void deleteArtist(int id) {
        artists.remove(id);
    }
}
