package net.simplifiedcoding.navigationdrawerexample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class quick_links extends AppCompatActivity {

    String items[] = new String[] {"Map Location","SBI fees payment","GTU website","Academic Calendar","Bonafide form","Character certificate","Application form for True copy","Auditorium booking","Student Section","Placement Portal"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_links);

        final ListView listView = (ListView) findViewById(R.id.list_quicklinks);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/hKEQZdg93qC2"));
                    startActivity(intt);
                }
                else if (i == 1){
                    Intent intt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.onlinesbi.com/prelogin/institutiontypedisplay.htm"));
                    startActivity(intt);
                }
                else if (i == 2){
                    Intent intt = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gtu.ac.in"));
                    startActivity(intt);
                }
                else if (i == 3){
                    Intent intt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/a/vgecg.ac.in/sts-vgecg-ac-in/academic-calender"));
                    startActivity(intt);
                }
                else if (i == 4){
                    Intent intt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/0B4ufpfxUsTYeaHRCandZMWFBaDA"));
                    startActivity(intt);
                }
                else if (i == 5){
                    Intent intt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/0B4ufpfxUsTYeaHRCandZMWFBaDA"));
                    startActivity(intt);
                }
                else if (i == 6){
                    Intent intt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/viewer?a=v&pid=sites&srcid=dmdlY2cuYWMuaW58c3RzLXZnZWNnLWFjLWlufGd4OjViOGQwM2Y2YjRiZGY5MzI"));
                    startActivity(intt);
                }
                else if (i == 7){
                    Intent intt = new Intent(Intent.ACTION_VIEW, Uri.parse("http://audies.vgecg.ac.in/"));
                    startActivity(intt);
                }
                else if (i == 8){
                    Intent intt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/a/vgecg.ac.in/sts-vgecg-ac-in/"));
                    startActivity(intt);
                }
                else if (i == 9){
                    Intent intt = new Intent(Intent.ACTION_VIEW, Uri.parse("http://placement.vgecg.ac.in/"));
                    startActivity(intt);
                }


            }
        });
    }
}
