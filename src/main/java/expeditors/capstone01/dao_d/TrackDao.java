package expeditors.capstone01.dao_d;

import expeditors.capstone01.domian_r.Artist;
import expeditors.capstone01.domian_r.Track;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class TrackDao {

    private final Map<Integer, Track> tracks = new HashMap<>();
    private static final AtomicInteger nextId = new AtomicInteger(1); // AtomicInteger로 고유 ID 생성

    public void addTrack(Track track) {
        track.setId(nextId.getAndIncrement());  // 자동으로 ID 할당
        tracks.put(track.getId(), track);
    }

    public Track getTrackById(int id) {
        return tracks.get(id);
    }

    public Map<Integer, Track> getAllTracks() {
        return tracks;
    }

    public void updateTrack(Track track) {
        if (tracks.containsKey(track.getId())) {
            tracks.put(track.getId(), track);
        }
    }

    public void deleteTrack(int id) {
        tracks.remove(id);
    }
}