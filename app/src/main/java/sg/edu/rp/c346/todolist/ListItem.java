package sg.edu.rp.c346.todolist;

import java.util.Calendar;
import java.util.List;

/**
 * Created by 16019865 on 16/7/2018.
 */

public class ListItem {

    private String name;
    private Calendar date;

    public ListItem(String name, Calendar date) {
        this.name = name;
        this.date = date;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getDateString(){
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        return str;
    }


}
