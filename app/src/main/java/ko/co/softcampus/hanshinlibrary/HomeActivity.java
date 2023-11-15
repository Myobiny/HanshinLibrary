package ko.co.softcampus.hanshinlibrary;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class HomeActivity extends AppCompatActivity {
    private ImageButton fullstackButton;
    private ImageButton backendButton;
    private ImageButton frontendButton;
    private ImageButton IOTButton;
    private ImageButton cloudButton;
    private ImageButton aiButton;
    private ImageButton schoolMapButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}