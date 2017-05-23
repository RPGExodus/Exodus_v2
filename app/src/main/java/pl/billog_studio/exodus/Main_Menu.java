package pl.billog_studio.exodus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Main_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getActionBar().hide();
        this.setContentView(R.layout.activity_main__menu);
        final Button button = (Button)findViewById(R.id.button_nowa_gra); //Button od nowej gry
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main_Menu.this, Gra.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
