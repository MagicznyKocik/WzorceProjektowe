package structural.adapter;

import java.util.stream.Collectors;

public class AlbumResourceAdapter implements ResourceProduct {

    private final Album album;

    public AlbumResourceAdapter(Album album){

        this.album = album;
    }


    @Override
    public String gerPicture() {
        return album.front();
    }

    @Override
    public String getContent() {
        //return album.listOfSongs().stream().collect(Collectors.joining("\n"));
        return String.join("\n", album.listOfSongs());
    }
}
