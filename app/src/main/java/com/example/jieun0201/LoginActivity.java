package com.example.jieun0201;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView registerButton= (TextView) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
        // 객체로서 변수가 되게 하며 눌렀을 때 이벤트 발생하도록
        // alt+enter로 implements 해 주기.

            @Override
            public void onClick(View v) {
                Intent registerIntent=new Intent(LoginActivity.this, RegisterActivity.class);
                //새로운 화면으로 넘어가게 함 (전자에서 후자로)
                LoginActivity.this.startActivity(registerIntent);
                //registerIntent를 실행함으로써 회원가입을 누르면 registerActivity로 넘어가
            }
        });


    }
}
