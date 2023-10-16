package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView txtResult;
    private Button btnSearch;
    private Spinner spnBooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = findViewById(R.id.txtResult);
        btnSearch = findViewById(R.id.btnSearch);
        spnBooks = findViewById(R.id.spnBooks);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "";
                str = spnBooks.getSelectedItem().toString();
                Database dp = new Database();
                List<Book> result = dp.TheBooks(str);
                String s = "";
                for(Book b : result){
                    s+= b.getTitle() +"\n";
                }
                if(s.equals("")){
                    txtResult.setText("No Books In This Gategory");
               }
                else{
                    txtResult.setText(s);
                }

            }
        });
    }
}