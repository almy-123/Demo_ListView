package sg.edu.rp.id19037610.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Food> food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lvFood);

        food = new ArrayList<Food>();
        food.add(new Food("Ah Lat Coffee", false));
        food.add(new Food("Rocky Choc", true));
        food.add(new Food("Kid Cat Choc", true));

        aa = new FoodAdapter(this, R.layout.row, food);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Food selectedFood = food.get(position);

                Toast.makeText(MainActivity.this, selectedFood.getName() + " Star: "
                + selectedFood.isStar(), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra(Intent.EXTRA_TEXT, selectedFood.getName());
                startActivity(intent);
            }
        });
    }
}