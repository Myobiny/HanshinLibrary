package ko.co.softcampus.hanshinlibrary;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import android.os.Bundle;
import android.widget.EditText; // EditText 클래스를 import
import android.content.Intent; // Intent 클래스를 import


public class loginActivity extends AppCompatActivity {
    private EditText emailEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
    }

    public void loginButtonClicked(View view){
        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        if(email.endsWith("hs.ac.kr")){
            // 이메일 주소가 hs.ac.kr로 끝나는 경우 로그인 성공
            // 비밀번호와 이메일 주소 확인 후 로그인 로직을 추가하세요.
            // 로그인 성공 또는 실패에 따라 처리를 함.
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "hs.ac.kr 이메일 주소만 허용됩니다.", Toast.LENGTH_LONG).show();
        }
    }
}
