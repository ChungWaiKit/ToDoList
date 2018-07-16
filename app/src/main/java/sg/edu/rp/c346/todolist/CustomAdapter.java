package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.CancellationException;

/**
 * Created by 16019865 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ListItem> List;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ListItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        List = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowview = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowview.findViewById(R.id.textViewName);
        TextView tvDate = rowview.findViewById(R.id.textViewDate);

        ListItem currentItem = List.get(position);
        String name = currentItem.getName();
        String date = currentItem.getDateString();
        tvName.setText(name);
        tvDate.setText(date + "");

        return rowview;
    }

}
