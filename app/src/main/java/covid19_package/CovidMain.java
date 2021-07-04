package covid19_package;


import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import com.example.vaccinationapp.R;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;

import androidx.appcompat.app.AppCompatActivity;

public class CovidMain extends AppCompatActivity {


    PlayerView playerView;
    SimpleExoPlayer player;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_main);

        playerView = findViewById(R.id.videoView);

    }

    @Override
    protected void onStart() {
        super.onStart();

        initializePlayer();

    }

    public void initializePlayer() {
        try {
            player = new SimpleExoPlayer.Builder(this).build();
            playerView.setPlayer(player);

            Uri uri = RawResourceDataSource.buildRawResourceUri(R.raw.covid_syndrome);
            MediaItem item = MediaItem.fromUri(uri);
            player.setMediaItem(item);
            player.play();
        } catch (Exception ex) {
            ex.printStackTrace();
            Toast.makeText(this, "error playing the video , باقي محتوى الأكتفتي مبيظهرش".concat(" "), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        player.pause();
    }
}
