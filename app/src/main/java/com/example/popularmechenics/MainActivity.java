package com.example.popularmechenics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArticlesAdapter adapter;
    List<Article> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data=getArticlesData();
        adapter=new ArticlesAdapter(this,data);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    private List<Article> getArticlesData() {
        List<Article> articles=new ArrayList<>();
        Article article=new Article(
                "Velvet Sunrise",
                "Alizyy",
                "December 20, 2022",
                "Velvet Sunrise is like a gentle awakening for your taste buds. Its smooth blend dances on your palate with a subtle hint of caramel, making each sip feel like a warm embrace on a chilly morning. It's my go-to choice for starting the day on a soothing note",
                R.drawable.customer_1
                );
        articles.add(article);
        article=new Article(
                "Midnight Magic",
                "Hamaad ch",
                "March 31, 2023",
                "Midnight Magic lives up to its name with its bold and robust flavor that packs a punch. The dark chocolate undertones leave a lingering richness that satisfies even the most discerning coffee connoisseur.",
                R.drawable.customer_9
                );
        articles.add(article);
        article=new Article(
                "Golden Bliss",
                "Hassan Sheikh",
                "September 01, 2022",
                "Golden Bliss is a delightful surprise with its smooth blend of creamy coconut and a touch of cinnamon. Each sip feels like a warm hug on a rainy day, transporting you to a cozy oasis of relaxation. It's my guilty pleasure whenever I need a little pick-me-up.",
                R.drawable.customer_3
                );
        articles.add(article);
        article=new Article(
                "Zen Garden",
                "Muhammad Raza",
                "December 12, 2023",
                "en Garden is a serene escape from the hustle and bustle of everyday life. Its delicate floral notes and subtle lavender essence create a tranquil experience with every sip. It's like a meditation session in a cup, leaving you refreshed and rejuvenated.",
                R.drawable.customer_4
                );
        articles.add(article);
        article=new Article(
                "Sunny Mornings",
                "Anam Haider",
                "June 10, 2022",
                "Sunny Mornings is a burst of sunshine in a cup! Its vibrant citrus flavors awaken your senses and invigorate your taste buds, making it the perfect choice for a bright start to the day. It's like a cheerful greeting from Mother Nature herself.",
                R.drawable.customer_5
                );
        articles.add(article);

        article=new Article(
                "Caramel Dream",
                "Amna Nawaz",
                "March 12, 2024",
                "Caramel Dream is a decadent indulgence that satisfies my sweet tooth without being overpowering. Its velvety smoothness and rich caramel aroma make it a luxurious treat that I look forward to every morning. It's the ultimate comfort drink that never disappoints." ,
                R.drawable.customer_6
                );
        articles.add(article);


        article=new Article(
                "Mountain Mist",
                "Sohail Butt",
                "Feburary 17, 2024",
                "Mountain Mist is a breath of fresh air with its crisp and clean taste. Its subtle hints of pine and earthy undertones transport you to the serene tranquility of the mountainside with every sip. It's like taking a refreshing hike in nature without leaving the comfort of your home.",
                R.drawable.customer_7
        );
        articles.add(article);






        return articles;
    }
}