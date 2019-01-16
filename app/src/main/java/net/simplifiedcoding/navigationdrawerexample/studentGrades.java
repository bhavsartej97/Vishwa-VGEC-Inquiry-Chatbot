package net.simplifiedcoding.navigationdrawerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class studentGrades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_grades);
        String url = "http://students.gtu.ac.in/studhist.aspx";
        WebView view = (WebView) findViewById(R.id.gradeWebView);
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setSupportZoom(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.loadUrl(url);
    }
}