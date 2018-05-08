package es.montanus.mymessenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends Activity {

    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        setMessage(getIntent().getStringExtra(Intent.EXTRA_TEXT));
    }

    private void setMessage(String message) {
        TextView messageView = (TextView)findViewById(R.id.message);
        messageView.setText(message);
    }
}
