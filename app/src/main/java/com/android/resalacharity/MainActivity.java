package com.android.resalacharity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView call = (ImageView) (findViewById(R.id.call));

        call.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean  onLongClick(View v){
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + "19450"));
                startActivity(callIntent);
                return true ;

            }

        });

        call.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){

                Context context = getApplicationContext();

                Toast toast = Toast.makeText(context, "19450", Toast.LENGTH_SHORT);
                toast.show();


            }

        });



        ImageView web = (ImageView) (findViewById(R.id.web));

        web.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean  onLongClick(View v){
                Intent webIntent = new Intent(Intent.ACTION_VIEW);
                webIntent.setData(Uri.parse("http://resala.org/"));
                startActivity(webIntent);
                return true ;

            }

        });

        web.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){

                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, "resala.org", Toast.LENGTH_SHORT);
                toast.show();

            }

        });

        ImageView map = (ImageView) (findViewById(R.id.map));

        map.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean  onLongClick(View v){
                Intent mapIntent = new Intent(Intent.ACTION_VIEW);
                mapIntent.setData( Uri.parse("geo:" + "30.113597,31.350243")  );
                startActivity(mapIntent);
                return true ;

            }

        });




        map.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){

                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, "166 El Hagaz St, Cairo, Egypt", Toast.LENGTH_SHORT);
                toast.show();


            }

        });



    }
}
