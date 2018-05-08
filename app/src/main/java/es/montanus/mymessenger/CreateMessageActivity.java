package es.montanus.mymessenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view) {
        Intent intent = getBaseIntent();
        Intent chosenIntent = Intent.createChooser(intent, getString(R.string.chooser_title));
        startActivity(chosenIntent);
    }

    private Intent getBaseIntent() {
        return new Intent(Intent.ACTION_SEND).
                setType("text/plain").
                putExtra(Intent.EXTRA_TEXT, getMessage());
    }

    private String getMessage() {
        EditText messageField = findViewById(R.id.message);
        return messageField.getText().toString();
    }
}
