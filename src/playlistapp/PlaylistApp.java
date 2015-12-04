/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlistapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
//import javax.media.NoPlayerException;
import jaco.mp3.player.MP3Player;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;

/**
 *
 * @author kris
 */
public class PlaylistApp {

   
    public static void main (String[] args) throws IOException {
        
      //  System.out.println(hello());
        
        int year = 2015;
        
        
       MP3Player myPlayer =  playSong( "Taylor Swift - Wildest Dreams.mp3") ;
        
                String TopSongsOf2014 = 
               "Elle King - Ex's & Oh's.mp3\n" +
               "Meghan Trainor - All About That Bass.mp3\n" +
                "Taylor Swift - Wildest Dreams.mp3" ;
                // Add multiple songs from one year 
                
                
    
                
               // addSong(TopSongsOf2014 , myPlayer );
              addSong ("LockedAwayAdamLevineRCity.mp3" , myPlayer );
      
      addSong ("The Weeknd - Can't Feel My Face.mp3" , myPlayer );
    
      addSong("The Weeknd - The Hills.mp3" , myPlayer);
       
        Connect(2015);
        
        
        
        
    }
    
    
    public static MP3Player  playSong(String songPath )
    {
        MP3Player  player = new MP3Player(new File(songPath)) ; 
            
         try {     
                    player.play();
               // sleep(10000);
                player.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100));

    JFrame frame = new JFrame("MP3 Player");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(player);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
            
            } catch (Exception ex) {
                Logger.getLogger(PlaylistApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        return player;
    }
    
    public static void addSong (String nextSong , MP3Player nextSongPlayer){
    nextSongPlayer.addToPlayList(new File(nextSong));
       
    
    }
    
    public static String[] Connect(int year)
    {
        String Fullhtml[] = new String [100];
        try {
            
            
      String address = "http://ajax.googleapis.com/ajax/services/search/web?v=1.0&q=";
	String query = "top songs of 2015";
	String charset = "UTF-8";
 
	URL url = new URL(address + URLEncoder.encode(query, charset));
 
	BufferedReader in2 = new BufferedReader(new InputStreamReader(
			url.openStream()));
	String str;
 
	while ((str = in2.readLine()) != null) {
		System.out.println(str);
	}
 
	in2.close();
            
            
            
            
            
            
            
    URL myURL = new URL("https://www.google.com/search?q=top+songs+of+2015");
    //URL myURL = new URL ("https://www.google.com/search?q=top+song+of+" + Integer.toString(year) + "&oq=top+song+of+" + Integer.toString(year)+"&gs_l=serp.3..35i39j0l9.6940.7079.0.7238.2.2.0.0.0.0.87.152.2.2.0....0...1c.1.64.serp..0.2.152.gVpdw55b5jk");
    System.out.println(myURL.toString());
    URLConnection myURLConnection = myURL.openConnection();
    myURLConnection.connect();
    BufferedReader in = new BufferedReader(new InputStreamReader(
                                    myURLConnection.getInputStream()));
        String inputLine;
        
        int i = 0 ;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            Fullhtml[i] = inputLine;
        i++;
        }
        in.close();
        i = 0;
    while(Fullhtml[i] != null ){
    System.out.println(Fullhtml[i]);
    i++;}
    System.out.println("Connected");
} 
catch (MalformedURLException e) { 
    // new URL() failed
    // ...
} 
catch (IOException e) {   
    // openConnection() failed
    // ...
}
    
    return Fullhtml;
    }
          
    public static String hello()
    {
        return "hello";
    }
            
            
    
}
