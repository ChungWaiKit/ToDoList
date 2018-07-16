package sg.edu.rp.c346.todolist;

import android.app.LauncherActivity;
import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvList;

    ArrayList<ListItem> alListItem;
    CustomAdapter caList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar date1 = Calendar.getInstance();
        date1.set(2018,7,1);

        Calendar date2 = Calendar.getInstance();
        date2.set(2018,9,22);



        lvList = findViewById(R.id.ListViewList);

        alListItem = new ArrayList<>();
        ListItem Item1 = new ListItem("Avenger Infinity war", date1);
        ListItem Item2 = new ListItem("Jusice League",date2);
        alListItem.add(Item1);
        alListItem.add(Item2);

        caList = new CustomAdapter(this,R.layout.list_item,alListItem );

        lvList.setAdapter(caList);
    }
}
