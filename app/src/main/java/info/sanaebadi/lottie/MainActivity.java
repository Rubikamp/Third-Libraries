package info.sanaebadi.lottie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatImageView imageViewGlide = findViewById(R.id.imageview_glide);

        Glide.with(MainActivity.this).load("http://goo.gl/gEgYUd").
                placeholder(R.drawable.ic_launcher_background).error(R.drawable.error_iamge).into(imageViewGlide);

    }
}