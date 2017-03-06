package com.example.yasha.editor3;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import in.nashapp.androidsummernote.Summernote;

public class MainActivity extends AppCompatActivity {

     Summernote summernote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(mToolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle("CREATE NOTICE");
        summernote = (Summernote) findViewById(R.id.summernote);
        summernote.setRequestCodeforFilepicker(5);


        //Fragment.summernote.onActivityResult(requestCode , resultCode, intent);
        //String html_data = summernote.getText();
        //summernote.setText("<h2>Hello World.<h2><br><h3> I'am Summernote</h3>");


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        summernote.onActivityResult(requestCode, resultCode, intent);

    }

       @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_test, menu);//Second es your new xml.
        return true;
    }
    /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.get_text:
                Toast.makeText(this,summernote.getText(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.set_text:
                summernote.setText("<h2>Hello World ' \"</h2>");
                break;
        }
        return true;
    }

    * */
}
