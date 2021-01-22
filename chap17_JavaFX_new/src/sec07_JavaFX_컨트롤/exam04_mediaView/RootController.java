package sec07_JavaFX_ÄÁÆ®·Ñ.exam04_mediaView;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class RootController implements Initializable{
	@FXML private MediaView mediaView;
	@FXML private ImageView imageView;
	@FXML private Button btnPlay;
	@FXML private Button btnPause;
	@FXML private Button btnStop;
	
	private boolean endOfMedia;
	
	@Override
	public void initialize(URL location, ResourceBundle resource) {
		//Media media = new Media(getClass().getResource("media/media.mp4").toString());
		Media audio = new Media(getClass().getResource("media/audio.mp3").toString());
		
		//MediaPlayer mediaPlayer = new MediaPlayer(media);
		MediaPlayer mediaPlayer = new MediaPlayer(audio);
		mediaView.setMediaPlayer(mediaPlayer);
		
		mediaPlayer.setOnReady(new Runnable() {
			@Override
			public void run() {
				btnPlay.setDisable(false);
				btnPause.setDisable(true);
				btnStop.setDisable(true);
				if(mediaPlayer.isAutoPlay()) {
					mediaView.setVisible(false);
				}
			}
		});
		mediaPlayer.setOnPlaying( () -> {
			btnPlay.setDisable(true);
			btnPause.setDisable(false);
			btnStop.setDisable(false);
		});		
		mediaPlayer.setOnPaused( () -> {
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
		});		
		mediaPlayer.setOnStopped( () -> {
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
		});
		mediaPlayer.setOnEndOfMedia( () -> {
			endOfMedia = true;
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
		});
		
		btnPlay.setOnAction(event -> {
			if(endOfMedia) {
				mediaPlayer.stop();
				mediaPlayer.seek(mediaPlayer.getStartTime());
			}
			mediaPlayer.play();
			endOfMedia = false;
		});
		btnPause.setOnAction(event -> {
			mediaPlayer.pause();
		});
		btnStop.setOnAction(event -> {
			mediaPlayer.stop();
		});
		
	}
}