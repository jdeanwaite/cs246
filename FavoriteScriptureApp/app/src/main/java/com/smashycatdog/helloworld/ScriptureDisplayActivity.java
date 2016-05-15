package com.smashycatdog.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ScriptureDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scripture_display);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setText();
    }

    private void setText() {
        Intent intent = getIntent();
        String book = intent.getStringExtra("bookText");
        String chapter = intent.getStringExtra("chapterText");
        String verse = intent.getStringExtra("verseText");

        TextView favScriptureText = (TextView) findViewById(R.id.favScriptureText);
        favScriptureText.setText("Your favorite scripture is " + book + " " + chapter + ":" + verse + "!");

    }

}
