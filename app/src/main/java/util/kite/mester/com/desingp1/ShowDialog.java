package util.kite.mester.com.desingp1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by mester on 2015.01.28..
 */
public class ShowDialog extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_layout);
    }

    public void closeDialog(View v) {
        this.finish();
    }
}
