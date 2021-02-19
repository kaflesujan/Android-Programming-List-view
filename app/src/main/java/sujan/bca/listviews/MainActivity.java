package sujan.bca.listviews;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ListView lvCourseName;
    private ArrayAdapter adapterCourse;
    private ArrayList<String> courseName = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvCourseName = findViewById(R.id.lv_course);
        courseName.add("Mobile Programming");
        courseName.add("Management");
        courseName.add("Network programming");
        courseName.add("C programming");
        courseName.add(" programming");
        courseName.add(" java programming");
        courseName.add("advance ");
        courseName.add("advance java ");
        courseName.add("advance programming");
        courseName.add("Nepali");
        courseName.add("social");
        courseName.add("economic");
        adapterCourse = new ArrayAdapter<String>(this, R.layout.content_display_course, R.id.tv_name, courseName);
        lvCourseName.setAdapter(adapterCourse);
    }
}
