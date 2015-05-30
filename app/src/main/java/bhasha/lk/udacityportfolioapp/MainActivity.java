package bhasha.lk.udacityportfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void openApp(View view){
        int id = view.getId();
        switch (id){
            case R.id.btn_spotify_app:
                showToast("Spotify App");
                break;
            case R.id.btn_scores_app:
                showToast("Scores App");
                break;
            case R.id.btn_library_app:
                showToast("Library App");
                break;
            case R.id.btn_build_it_bigger:
                showToast("Build It Bigger App");
                break;
            case R.id.btn_xyz_reader:
                showToast("XYZ Reader App");
                break;
            case R.id.btn_my_app:
                showToast("My Capstone App");
        }
    }

    private void showToast(String msg){
        String str = "This button will launch ";
        Toast.makeText(this,str + "\""+ msg + "\"",Toast.LENGTH_SHORT).show();
    }


}
