package com.example.l003usingservice;

import android.support.v7.app.ActionBarActivity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements OnClickListener, ServiceConnection {
	private Button btnStartService,btnStopService,btnBindService,btnUnbindService,btnGetCurrentNum;
	private Intent serviceIntent;
	private EchoService echoService=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        serviceIntent=new Intent(this,EchoService.class);
        
        btnStartService=(Button) findViewById(R.id.btnStartService);
        btnStopService=(Button) findViewById(R.id.btnStopService);
        btnBindService=(Button) findViewById(R.id.btnBindService);
        btnUnbindService=(Button) findViewById(R.id.btnUnbindService);
        btnGetCurrentNum=(Button) findViewById(R.id.btnGetCurrentNum);
        
        btnStartService.setOnClickListener(this);
        btnStopService.setOnClickListener(this);
        btnBindService.setOnClickListener(this);
        btnUnbindService.setOnClickListener(this);
        btnGetCurrentNum.setOnClickListener(this);
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


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btnStartService:
			startService(serviceIntent);
			break;
		case R.id.btnStopService:
			stopService(serviceIntent);
			break;
		case R.id.btnBindService:
			bindService(serviceIntent, this, Context.BIND_AUTO_CREATE);
			break;
		case R.id.btnUnbindService:
			unbindService(this);
			echoService=null;
			break;
		case R.id.btnGetCurrentNum:
			if(echoService!=null){
				System.out.println("当前服务中的数字是："+echoService.getCurrentNum());
			}
			break;
		default:
			break;
		}
	}


	@Override
	public void onServiceConnected(ComponentName name, IBinder binder) {
		// TODO Auto-generated method stub
		System.out.println("onServiceConnected");
		
		echoService=((EchoService.EchoServiceBinder)binder).getService();
		
		
	}


	@Override
	public void onServiceDisconnected(ComponentName name) {
		// TODO Auto-generated method stub
		
	}
}
