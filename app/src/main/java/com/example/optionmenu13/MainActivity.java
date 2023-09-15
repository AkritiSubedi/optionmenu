package com.example.optionmenu13;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // adding option menu to the activity
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }
    // handling the click event on menu items
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // handle selected items
        switch (item.getItemId())
        {
            case R.id.itm1:
                Toast.makeText(getApplicationContext(),"Item 1 is selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.itm2:
                Toast.makeText(getApplicationContext(), "Item 2 is selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.itm3:
                Toast.makeText(getApplicationContext(), "Item 3 is selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.itm4:
                Toast.makeText(getApplicationContext(), "Item 4 is selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.itm5:
                Toast.makeText(getApplicationContext(), "Item 5 is selected", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
