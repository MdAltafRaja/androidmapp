package io.juspay.moapplibrary.example

import android.content.Context

class PaymentConfiguration(temp:Any, publishableKey:String) {
    companion object {
        fun init(
            context: Context,
            publishableKey: String,
            stripeAccountId: String? = null
        ) {
        }
    }

}