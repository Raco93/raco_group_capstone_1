package expeditors.capstone01.dao_d;

import expeditors.capstone01.domian_r.Artist;
import expeditors.capstone01.domian_r.Track;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ArtisDaoTest {

    private ArtisDao artistDao;
    private TrackDao trackDao;

    @BeforeEach
    public void setUp() {
        artistDao = new ArtisDao();
        trackDao = new TrackDao();
    }

    @Test
    public void testAddAndGetArtist() {

        Artist artist1 = new Artist();
        artist1.setName("Artist One");
        artist1.setAge(30);
        artist1.setGender("Male");
        artist1.setLocation("New York");

        Artist artist2 = new Artist();
        artist2.setName("Artist Two");
        artist2.setAge(25);
        artist2.setGender("Female");
        artist2.setLocation("Los Angeles");

        artistDao.addArtist(artist1);
        artistDao.addArtist(artist2);

        Artist retrievedArtist1 = artistDao.getArtistById(1);
        Artist retrievedArtist2 = artistDao.getArtistById(2);

        System.out.println("Retrieved Artist 1: " + retrievedArtist1);
        System.out.println("Retrieved Artist 2: " + retrievedArtist2);

        assertNotNull(retrievedArtist1);
        assertNotNull(retrievedArtist2);

        assertEquals("Artist One", retrievedArtist1.getName());
        assertEquals("Artist Two", retrievedArtist2.getName());
    }

    @Test
    public void testAddAndGetTrack() {

        Track track1 = new Track();
        track1.setName("Track One");
        track1.setYear(2020);
        track1.setLocation("New York");
        track1.setDescription("Track One description");

        Track track2 = new Track();
        track2.setName("Track Two");
        track2.setYear(2021);
        track2.setLocation("Los Angeles");
        track2.setDescription("Track Two description");

        trackDao.addTrack(track1);
        trackDao.addTrack(track2);

        Track retrievedTrack1 = trackDao.getTrackById(1);
        Track retrievedTrack2 = trackDao.getTrackById(2);

        System.out.println("Retrieved Track 1: " + retrievedTrack1);
        System.out.println("Retrieved Track 2: " + retrievedTrack2);

        assertNotNull(retrievedTrack1);
        assertNotNull(retrievedTrack2);

        assertEquals("Track One", retrievedTrack1.getName());
        assertEquals("Track Two", retrievedTrack2.getName());
    }
  
}