package com.devandroid.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
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

	public void showDialog(View view){
		AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

		builder.setTitle("Warning")
				.setMessage("This Alert Message")
				.setCancelable(true)
				.setIcon(R.mipmap.ic_launcher)
				.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialogInterface, int i) {
						Toast.makeText(getApplicationContext(), "You don't agree with us!", Toast.LENGTH_SHORT).show();
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialogInterface, int i) {
						Toast.makeText(getApplicationContext(), "You agree with us!", Toast.LENGTH_SHORT).show();
					}
				})
				.setOnCancelListener(new DialogInterface.OnCancelListener() {
					@Override
					public void onCancel(DialogInterface dialogInterface) {
						Toast.makeText(getApplicationContext(), "You ignored us :(", Toast.LENGTH_SHORT).show();
					}
				});

		AlertDialog alertDialog = builder.create();
		alertDialog.show();
	}
}
