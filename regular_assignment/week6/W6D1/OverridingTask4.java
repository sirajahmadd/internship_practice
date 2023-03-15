// [15:56] Lalitha Ujjaneni
//     Music Streaming System: In a music streaming system, there may be a superclass called Song with a method called play() that plays the song's audio. Different types of songs, such as PopSong and JazzSong, may be subclasses of Song and override the play() method to play the song audio in a different way based on their specific genre and style. For example, a PopSong may play the audio with a catchy beat and chorus, while a JazzSong may play the audio with a smooth melody and improvisation.

class Song{
  public void play(){
    System.out.println("playing song audio");
  }
}
class PopSong extends Song{
  public void play(){
    super.play();
    System.out.println("playing the audio with a catchy beat and chorus ");
  }
}
class JazzSong extends Song{
  public void play(){
    System.out.println("playing the audio with a smooth melody and improvisation ");
  }
}
class OverridingTask4{
  public static void main(String args[]){
    PopSong p=new PopSong();
    JazzSong j=new JazzSong();
    p.play();
    j.play();
  }
}