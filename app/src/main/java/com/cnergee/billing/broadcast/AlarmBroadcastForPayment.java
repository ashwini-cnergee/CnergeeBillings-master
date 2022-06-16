package com.cnergee.billing.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.cnergee.billing.services.PaymentPickupRequestService;
import com.cnergee.billing.utils.Utils;

public class AlarmBroadcastForPayment extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Utils.log("Alarm broadcast Payment","started");
		
			
			Intent i= new  Intent(context, PaymentPickupRequestService.class);			
			context.startService(i);		
		
		
	}

}