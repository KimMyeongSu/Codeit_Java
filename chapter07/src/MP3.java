import java.util.ArrayList;

public class MP3 {
    public static void main(String[] args) {

        Artist keithJarrett = new Artist("Keith Jarrett");

        Album theMelodyAtNightWithYou = new Album("The Melody At Night With You", 1999, keithJarrett);
        theMelodyAtNightWithYou.addTrack(new Song("I Loves You, Porgy", keithJarrett, theMelodyAtNightWithYou));
        theMelodyAtNightWithYou.addTrack(new Song("I Got It Bad (and That Ain't Good)", keithJarrett, theMelodyAtNightWithYou));
        theMelodyAtNightWithYou.addTrack(new Song("Don't Ever Leave Me", keithJarrett, theMelodyAtNightWithYou));
        theMelodyAtNightWithYou.addTrack(new Song("Someone to Watch over Me", keithJarrett, theMelodyAtNightWithYou));

        Album insideOut = new Album("Inside Out", 2001, keithJarrett);

        insideOut.addTrack(new Song("From the Body", keithJarrett, insideOut));
        insideOut.addTrack(new Song("Inside Out", keithJarrett, insideOut));

        keithJarrett.addAlbum(theMelodyAtNightWithYou);
        keithJarrett.addAlbum(insideOut);

        Artist bts = new Artist("방탄소년단");

        Album darkAndWild = new Album("DARK & WILD", 2014, bts);
        darkAndWild.addTrack(new Song("Intro: What am I to You", bts, darkAndWild));
        darkAndWild.addTrack(new Song("Danger", bts, darkAndWild));

        Album wings = new Album("WINGS", 2016, bts);
        wings.addTrack(new Song("Intro: Boy Meets Evil", bts, wings));
        wings.addTrack(new Song("피 땀 눈물", bts, wings));
        wings.addTrack(new Song("Begin", bts, wings));
        wings.addTrack(new Song("Lie", bts, wings));


        bts.addAlbum(darkAndWild);
        bts.addAlbum(wings);

        System.out.println(keithJarrett.getAlbums().get(0).getTrack(2).toString());
        System.out.println();
        System.out.println(bts.getAlbums().get(1).getTrack(3).toString());



    }


}

class Artist {
    public final String name; //가수이름
    private ArrayList<Album> albums =new ArrayList<>(); //앨범들을 저장하기위한 ArrayList .

    public Artist(String name) {
        this.name = name;
    }


    public void addAlbum (Album album){
        //앨범을 추가하는 메소드
        albums.add(album);
    }

    public ArrayList<Album> getAlbums(){
        return albums;
    }





}



class Album {

    public final String name; //앨범이름
    public final int year; //발매년도
    private  final  Artist artist; //가수
    private ArrayList<Song> Track =new ArrayList<>(); //노래를 저장할 ArrayList .


    public Album(String name, int year, Artist artist) {
        this.name = name;
        this.year = year;
        this.artist = artist;
    }


    public void addTrack (Song song) {
         //노래를 앨범에 저장하는 메소드
        Track.add(song);
    }


    public Song getTrack(int a) {
        return Track.get(a-1);
    }


}


class Song {
    private String name; //노래제목
    private Artist artist; //가수
    private Album album; //앨범

    public Song(String name, Artist artist, Album album) {
        this.name = name;
        this.artist = artist;
        this.album = album;
    }

    @Override
    public String toString() {
        String result = name+" - "+artist.name+"\n" + album.name+"("+album.year+")";
        return  result;
    }


}
