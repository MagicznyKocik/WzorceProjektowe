package structural.adapter;

public class AdapterMain {

    public static void main(String[] args) {
        Album album1 = new HipHopAlbum();

        Book book1 = new FantasyBook("no umar", "jakiś kolo co biega z mieczem", "naked  ... sword");
        Book book2 = new FantasyBook("Zyl plasko i szczesliwie", "Encyklopedia plaskoziemcy", "zdjęcie talerza" );

        ViewProduct viewProduct = new ViewProduct(new BookResourceAdapter(book1));
        viewProduct.show();
        ViewProduct viewProduct2 = new ViewProduct(new AlbumResourceAdapter(album1));
        viewProduct2.show();

    }

}
