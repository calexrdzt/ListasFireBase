package com.example.a1144104313.listasfirebase;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db= FirebaseDatabase.getInstance();

        DatabaseReference reference= db.getReference().child("-LPm9pcxD7VgIowU5G8C");

      //  Usuario calex= new Usuario("asd","Calex","calex@semana.com","1234567");

       // reference.push().setValue(calex);

        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                //for(DataSnapshot data: dataSnapshot.getChildren()){

                    Usuario s = dataSnapshot.getValue(Usuario.class);
                    Log.e("Nombre","Nombre "+ s.nombre);
               // }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}
