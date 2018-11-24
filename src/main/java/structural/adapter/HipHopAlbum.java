package structural.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HipHopAlbum implements Album {




    @Override
    public List<String> listOfSongs() {
        return Arrays.asList(
                "pierwsza piosneka", "druga piosenka"
        );
    }

    @Override
    public String front() {
        return "zdjęcie peji";
    }
}
