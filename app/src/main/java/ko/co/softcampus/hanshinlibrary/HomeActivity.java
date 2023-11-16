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




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //각버튼에 대한 초기화
        fullstackButton = findViewById(R.id.fullstackButton);
        backendButton = findViewById(R.id.backendButton);
        frontendButton = findViewById(R.id.frontendButton);
        IOTButton = findViewById(R.id.IOTButton);
        cloudButton = findViewById(R.id.cloudButton);
        aiButton = findViewById(R.id.aiButton);

    }
}