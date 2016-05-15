package com.smashycatdog.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton continueFab = (FloatingActionButton) findViewById(R.id.continueFab);
        final EditText bookText = (EditText) findViewById(R.id.book);
        final EditText chapterText = (EditText) findViewById(R.id.chapter);
        final EditText verseText = (EditText) findViewById(R.id.verse);
        continueFab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String book = bookText.getText().toString();
                String chapter = chapterText.getText().toString();
                String verse = verseText.getText().toString();

                Intent intent = new Intent(getApplicationContext(), ScriptureDisplayActivity.class);
                intent.putExtra("bookText", book);
                intent.putExtra("chapterText", chapter);
                intent.putExtra("verseText", verse);

                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void test() {
        System.out.println("You clicked me!");
    }
}
