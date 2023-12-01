package com.example.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    // a dateset means refers to collection of the data
    ArrayList<ContactModel> arrContact = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // first i created the object of the Recycler View Because i Used this
        RecyclerView recyclerView = findViewById(R.id.recyclerContext);

        // then i defined which layout type we need to used (grid , linear , stacked )
        recyclerView.setLayoutManager(new LinearLayoutManager(this) );


        // firstly i created the array list of the contact number soo i can save , edit , delele
        arrContact.add(new ContactModel(R.drawable.b, "John Doe", "0300-1111111"));
        arrContact.add(new ContactModel(R.drawable.b, "Alice Smith", "0300-2222222"));
        arrContact.add(new ContactModel(R.drawable.b, "Bob Johnson", "0300-3333333"));
        arrContact.add(new ContactModel(R.drawable.b, "Emma Brown", "0300-4444444"));
        arrContact.add(new ContactModel(R.drawable.b, "Michael Davis", "0300-5555555"));
        arrContact.add(new ContactModel(R.drawable.b, "Sophia Wilson", "0300-6666666"));
        arrContact.add(new ContactModel(R.drawable.b, "Oliver Taylor", "0300-7777777"));
        arrContact.add(new ContactModel(R.drawable.b, "Lily Martinez", "0300-8888888"));
        arrContact.add(new ContactModel(R.drawable.b, "William Anderson", "0300-9999999"));
        arrContact.add(new ContactModel(R.drawable.b, "Ella Thomas", "0300-1234567"));
        arrContact.add(new ContactModel(R.drawable.b, "Grace White", "0300-9876543"));
        arrContact.add(new ContactModel(R.drawable.b, "Henry Harris", "0300-1357924"));
        arrContact.add(new ContactModel(R.drawable.b, "Samantha Clark", "0300-2468135"));
        arrContact.add(new ContactModel(R.drawable.b, "Daniel Lee", "0300-3692581"));
        arrContact.add(new ContactModel(R.drawable.b, "Mia Rodriguez", "0300-7531902"));
        arrContact.add(new ContactModel(R.drawable.b, "David Moore", "0300-4801623"));
        arrContact.add(new ContactModel(R.drawable.b, "Chloe Walker", "0300-5678901"));


        RecyclerContactAdaptor adaptor  = new RecyclerContactAdaptor(this,arrContact);
        recyclerView.setAdapter(adaptor);
    }
}