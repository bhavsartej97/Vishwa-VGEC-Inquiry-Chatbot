package net.simplifiedcoding.navigationdrawerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class faq extends AppCompatActivity {

    String questions[] = new String[] {"WHAT IS VISHWA?","Vishwa is vgec enquiry chatbot application which will reply to user queries related to vgec","","HOW TO CHAT?","example-  1) vgec location","2) Where is vgec located","","WHAT IS QUICK LINKS?","This links will help you to find specific and frequently used information on gtu or vgec website"};     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        final ListView listView = (ListView) findViewById(R.id.list_faq);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,questions);
        listView.setAdapter(adapter);
    }
}
