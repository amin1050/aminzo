package strathmore.com.bbitga;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    private Button mBtlogin;
    private Button mBtCreate_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mBtlogin = (Button) findViewById(R.id.login);
        mBtlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                login();
            }
        });
    }

    private void login(){
        Intent intent = new Intent(this,Homepage.class);
        startActivity(intent);
    }

    public void create_account(View view){
        Intent intent = new Intent(this,signup.class);
        startActivity(intent);
    }
}
