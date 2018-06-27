package myfirstcodepathproj.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import static myfirstcodepathproj.simpletodo.MainActivity.ITEM_POSITION;
import static myfirstcodepathproj.simpletodo.MainActivity.ITEM_TEXT;

public class EditItemActivity extends AppCompatActivity {

    //text that contains updated description
    EditText etItemText;

    // tracks the items position in the list
    int position;


    /*
    Gets edited text and updates its position
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        etItemText = (EditText) findViewById(R.id.etItemText);
        etItemText.setText(getIntent().getStringExtra(ITEM_TEXT));
        position = getIntent().getIntExtra(ITEM_POSITION, 0);
        getSupportActionBar().setTitle("Edit Item");
    }

    /*
    saves the edited item to the list
     */
    public void onSaveItem(View v) {
        Intent i = new Intent();
        i.putExtra(ITEM_TEXT, etItemText.getText().toString());
        i.putExtra(ITEM_POSITION, position);
        setResult(RESULT_OK, i);
        finish();
    }


}
