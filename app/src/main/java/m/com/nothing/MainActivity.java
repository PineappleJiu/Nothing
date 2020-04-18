package m.com.nothing;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {

    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        TextView mName = findViewById(R.id.About_Name);
        mName.setText("开发者：PineappleJiu");
        mName.setTextColor(Color.BLUE);
        mName.setGravity(Gravity.CENTER);

        TextView mAbout_Number = findViewById(R.id.About_Number);
        mAbout_Number.setText("学号：999999999");
        mAbout_Number.setTextColor(Color.BLUE);
        mAbout_Number.setGravity(Gravity.CENTER);

        TextView mAbout_Class = findViewById(R.id.About_Class);
        mAbout_Class.setText("班级：计算机162");
        mAbout_Class.setTextColor(Color.BLUE);
        mAbout_Class.setGravity(Gravity.CENTER);

        TextView mAbout_Build = findViewById(R.id.About_Build);
        mAbout_Build.setText("版本号：1.0.0");
        mAbout_Build.setTextColor(Color.BLUE);
        mAbout_Build.setGravity(Gravity.CENTER);


    }
}
