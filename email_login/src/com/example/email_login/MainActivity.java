package com.example.email_login;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	String verifyName="root", verifyPassword="moviles";
	EditText txtNombre,txtContrasenia;
	TextView incorrecto;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		txtNombre = (EditText) findViewById(R.id.txtName);
		txtContrasenia = (EditText) findViewById(R.id.txtPassword);
		incorrecto = (TextView) findViewById(R.id.txtIncorrect);
		
		verificar(txtNombre.getText().toString(), txtContrasenia.getText().toString());
	}
	
	private void verificar(String name, String password)
	{
		if(name.equals(name) && password.equals(password))
		{
			Intent intencionCorreo = new Intent(this, Email.class);
			startActivity(intencionCorreo);
		}
		else{
			incorrecto.setText("Datos Incorrectos");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
