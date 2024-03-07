package com.example.popularmechenics;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

public class ArticleDetailsActivity extends AppCompatActivity {
    TextView title;
    TextView author;
    TextView date;
    TextView details;
    ImageView image;
    Article article;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_details);

        title=findViewById(R.id.title);
        author=findViewById(R.id.author);
        date=findViewById(R.id.date);
        details=findViewById(R.id.details);
        image=findViewById(R.id.image);

        article=new Gson().fromJson(getIntent().getStringExtra("data"),Article.class);

        title.setText(article.getTitle());
        author.setText(article.getAuthor());
        date.setText(article.getDate());
        details.setText(article.getDescription());
        image.setImageResource(article.getImage());

        author.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
    }
}