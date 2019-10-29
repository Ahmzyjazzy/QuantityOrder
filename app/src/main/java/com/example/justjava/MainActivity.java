package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display(quantity);
    }

    /**
     * This method increase quantity
     */
    public void increment(View view) {
        quantity++;
        display(quantity);
    }

    /**
     * This method decrease quantity
     */
    public void decrement(View view) {
        if(quantity != 0) {
            quantity--;
            display(quantity);
        }
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = quantity * 5;
        String priceMessage = price != 0 ? "Total: N" + price : "You owe nothing.";
        priceMessage += "\nThank you!";
        displayPrice(priceMessage);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(String message) {
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(message);
        //priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}