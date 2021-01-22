package sec07_JavaFX_ÄÁÆ®·Ñ.exam05_slider_progressbar;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class RootController implements Initializable{
	@FXML private MediaView mediaView;
	@FXML private ImageView imageView;
	@FXML private Button btnPlay;
	@FXML private Button btnPause;
	@FXML private Button btnStop;
	
	@FXML private Label labelTime;
	@FXML private ProgressBar progressBar;
	@FXML private ProgressIndicator progressIndicator;
	@FXML private Slider sliderVolume;
	
	private boolean endOfMedia;
	
	@Override
	public void initialize(URL location, ResourceBundle resource) {
		Media media = new Media(getClass().getResource("media/media.mp4").toString());
		//Media audio = new Media(getClass().getResource("media/audio.mp3").toString());
		
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		//MediaPlayer mediaPlayer = new MediaPlayer(audio);
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
				
				mediaPlayer.currentTimeProperty().addListener( new ChangeListener<Duration>() {
					@Override
					public void changed(ObservableValue<? extends Duration> observable,
										Duration oldValue, Duration newValue) {
						double currentTime = mediaPlayer.getCurrentTime().toSeconds();
						double totalDuration = mediaPlayer.getTotalDuration().toSeconds(); 
						double progress = currentTime / totalDuration;
						progressBar.setProgress(progress);
						progressIndicator.setProgress(progress);
						labelTime.setText(
								(int) currentTime + "/" + (int) totalDuration + " sec" 
								);
					}
				});
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
			progressBar.setProgress(1.0);
			progressIndicator.setProgress(1.0);
		});
		
		sliderVolume.valueProperty().addListener( new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable,
								Number oldValue, Number newValue) {
				//mediaPlayer.setVolume(sliderVolume.getValue() / 100.0);
				mediaPlayer.setVolume(newValue.doubleValue() / 100.0);
				
			}
		});
		sliderVolume.setValue(50.0);
		
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