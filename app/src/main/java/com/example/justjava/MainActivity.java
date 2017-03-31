package com.example.justjava;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.NumberPicker;
        import android.widget.TextView;

        import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increment(View view) {
         quantity = quantity + 1;
        displayquantity(quantity);
    }

    public void decrement(View view) {
        quantity = quantity - 1;
        displayquantity(quantity);
    }

    public void submitOrder(View view) {
       String priceMessage = "Total:  $" + (quantity * 5) + "  please.";
        priceMessage = priceMessage + "\nThank you!";
       displayMessage(priceMessage);
    }
    private void displayquantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number)  {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
