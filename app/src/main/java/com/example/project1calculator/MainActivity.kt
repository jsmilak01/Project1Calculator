package com.example.project1calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.security.KeyStore.TrustedCertificateEntry

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var firstNum = ""
        var secondNum = ""
        var result = 0.0
        var useSecondNum = false
        var operator = ""

        findViewById<Button>(R.id.clearbutton)
            .setOnClickListener {
                findViewById<TextView>(R.id.textbox).text = "0"
                firstNum = ""
                secondNum = ""
                result = 0.0
                useSecondNum = false
                operator = ""
            }

        findViewById<Button>(R.id.percentbutton)
            .setOnClickListener {
                result = firstNum.toDouble()/100
                findViewById<TextView>(R.id.textbox).text = "$result"
            }

        findViewById<Button>(R.id.plusminusbutton)
            .setOnClickListener {

                if(findViewById<TextView>(R.id.textbox).text == "0"){

                }else if(!useSecondNum){
                    if(firstNum.indexOf("-") == 0){
                        firstNum = firstNum.drop(1)
                    }else{
                        firstNum = "-$firstNum"
                    }
                    findViewById<TextView>(R.id.textbox).text = "$firstNum"
                }else{
                    if(secondNum.indexOf("-") == 0){
                        secondNum = secondNum.drop(1)
                    }else{
                        secondNum = "-$secondNum"
                    }
                    findViewById<TextView>(R.id.textbox).text = "$secondNum"
                }
            }

        findViewById<Button>(R.id.dividebutton)
            .setOnClickListener{
                useSecondNum = true
                operator = "/"
            }

        findViewById<Button>(R.id.multiplybutton)
            .setOnClickListener{
                useSecondNum = true
                operator = "*"
            }

        findViewById<Button>(R.id.addbutton)
            .setOnClickListener{
                useSecondNum = true
                operator = "+"
            }

        findViewById<Button>(R.id.subtractbutton)
            .setOnClickListener{
                useSecondNum = true
                operator = "-"
            }

        findViewById<Button>(R.id.periodbutton)
            .setOnClickListener{
                if(!useSecondNum){
                    firstNum = "$firstNum."
                }else{
                    secondNum = "$secondNum."
                }
            }

        findViewById<Button>(R.id.zerobutton)
            .setOnClickListener{
                if(!useSecondNum){
                    firstNum += "0"
                    findViewById<TextView>(R.id.textbox).text = "$firstNum"
                }else{
                    secondNum += "0"
                    findViewById<TextView>(R.id.textbox).text = "$secondNum"
                }
            }

        findViewById<Button>(R.id.onebutton)
            .setOnClickListener{
                if(!useSecondNum){
                    firstNum += "1"
                    findViewById<TextView>(R.id.textbox).text = "$firstNum"
                }else{
                    secondNum += "1"
                    findViewById<TextView>(R.id.textbox).text = "$secondNum"
                }
            }

        findViewById<Button>(R.id.twobutton)
            .setOnClickListener{
                if(!useSecondNum){
                    firstNum += "2"
                    findViewById<TextView>(R.id.textbox).text = "$firstNum"
                }else{
                    secondNum += "2"
                    findViewById<TextView>(R.id.textbox).text = "$secondNum"
                }
            }

        findViewById<Button>(R.id.threebutton)
            .setOnClickListener{
                if(!useSecondNum){
                    firstNum += "3"
                    findViewById<TextView>(R.id.textbox).text = "$firstNum"
                }else{
                    secondNum += "3"
                    findViewById<TextView>(R.id.textbox).text = "$secondNum"
                }
            }

        findViewById<Button>(R.id.fourbutton)
            .setOnClickListener{
                if(!useSecondNum){
                    firstNum += "4"
                    findViewById<TextView>(R.id.textbox).text = "$firstNum"
                }else{
                    secondNum += "4"
                    findViewById<TextView>(R.id.textbox).text = "$secondNum"
                }
            }

        findViewById<Button>(R.id.fivebutton)
            .setOnClickListener{
                if(!useSecondNum){
                    firstNum += "5"
                    findViewById<TextView>(R.id.textbox).text = "$firstNum"
                }else{
                    secondNum += "5"
                    findViewById<TextView>(R.id.textbox).text = "$secondNum"
                }
            }

        findViewById<Button>(R.id.sixbutton)
            .setOnClickListener{
                if(!useSecondNum){
                    firstNum += "6"
                    findViewById<TextView>(R.id.textbox).text = "$firstNum"
                }else{
                    secondNum += "6"
                    findViewById<TextView>(R.id.textbox).text = "$secondNum"
                }
            }

        findViewById<Button>(R.id.sevenbutton)
            .setOnClickListener{
                if(!useSecondNum){
                    firstNum += "7"
                    findViewById<TextView>(R.id.textbox).text = "$firstNum"
                }else{
                    secondNum += "7"
                    findViewById<TextView>(R.id.textbox).text = "$secondNum"
                }
            }

        findViewById<Button>(R.id.eightbutton)
            .setOnClickListener{
                if(!useSecondNum){
                    firstNum += "8"
                    findViewById<TextView>(R.id.textbox).text = "$firstNum"
                }else{
                    secondNum += "8"
                    findViewById<TextView>(R.id.textbox).text = "$secondNum"
                }
            }

        findViewById<Button>(R.id.ninebutton)
            .setOnClickListener{
                if(!useSecondNum){
                    firstNum += "9"
                    findViewById<TextView>(R.id.textbox).text = "$firstNum"
                }else{
                    secondNum += "9"
                    findViewById<TextView>(R.id.textbox).text = "$secondNum"
                }
            }

        findViewById<Button>(R.id.equalbutton)
            .setOnClickListener{
                if(operator=="/"){
                    result = firstNum.toDouble()/secondNum.toDouble()
                    findViewById<TextView>(R.id.textbox).text = "$result"
                }else if(operator=="*"){
                    result = firstNum.toDouble()*secondNum.toDouble()
                    findViewById<TextView>(R.id.textbox).text = "$result"
                }else if(operator=="+"){
                    result = firstNum.toDouble()+secondNum.toDouble()
                    findViewById<TextView>(R.id.textbox).text = "$result"
                }else if(operator=="-"){
                    result = firstNum.toDouble()-secondNum.toDouble()
                    findViewById<TextView>(R.id.textbox).text = "$result"
                }
            }
    }

}