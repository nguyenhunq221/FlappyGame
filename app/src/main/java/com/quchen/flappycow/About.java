package com.quchen.flappycow;

import static com.quchen.flappycow.GameOverDialog.best_score_key;
import static com.quchen.flappycow.GameOverDialog.score_save_name;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class About extends Activity {
    private Game game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        
        // Version
//        try {((TextView) findViewById(R.id.version_tv)).setText("" + getPackageManager().getPackageInfo(getPackageName(), 0).versionName);
//        } catch (NameNotFoundException e) {e.printStackTrace();}
        
        // Backbutton
        ((Button)findViewById(R.id.back_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ((TextView) findViewById(R.id.Direction)).setText("Điều khiển một chú chim bay qua những cái ống. Nếu chú chim chạm vào chướng ngại vật thì trò chơi sẽ kết thúc. Mỗi khi chú chim vượt qua một cặp ống thì người chơi nhận được một điểm.");
    }
}
