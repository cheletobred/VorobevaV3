package ru.mirea.vorobevavi.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
    }
    public void shareBookName(View view){
        Bundle extras = getIntent().getExtras();
        EditText editTextBookName = findViewById(R.id.editTextBookName);
        String book = editTextBookName.getText().toString();
        if (extras != null) {
            TextView ageView = findViewById(R.id.textViewBook);
            ageView.setText(String.format("Мой любимая книга: %s", book));
        }
        Intent data = new Intent();
        data.putExtra(MainActivity.USER_MESSAGE, book);
        setResult(ShareActivity.RESULT_OK, data);
        finish();
    }
}