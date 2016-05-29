package konyan.net.nyanportfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionPopularMovies(View view){
        showToast(getString(R.string.popular_movies));
    }

    public void actionStockHawk(View view){
        showToast(getString(R.string.stock_hawk));
    }

    public void actionBuildItBigger(View view){
        showToast(getString(R.string.build_it_bigger));
    }

    public void actionMakeMaterial(View view){
        showToast(getString(R.string.make_your_app_material));
    }

    public void actionGoUbiquitous(View view){
        showToast(getString(R.string.go_ubiquitous));
    }

    public void actionCapstone(View view){
        showToast(getString(R.string.capstone_my_own));
    }

    public void showToast(String desc){
        String formatted = String.format(getString(R.string.main_toast_prefix), desc);
        Toast.makeText(this, formatted, Toast.LENGTH_SHORT).show();
    }
}
