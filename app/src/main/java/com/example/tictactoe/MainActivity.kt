package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    lateinit var zero:Button
    lateinit var one:Button
    lateinit var two:Button
    lateinit var three:Button
    lateinit var four:Button
    lateinit var five:Button
    lateinit var six:Button
    lateinit var seven:Button
    lateinit var eight:Button


    lateinit var reset:Button


    var arraylist=ArrayList<Button>()
    var j=true





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        zero=findViewById(R.id.zero)
        one=findViewById(R.id.one)
        two=findViewById(R.id.two)
        three=findViewById(R.id.three)
        four=findViewById(R.id.four)
        five=findViewById(R.id.five)
        six=findViewById(R.id.six)
        seven=findViewById(R.id.seven)
        eight=findViewById(R.id.eight)
        reset=findViewById(R.id.reset)

        arraylist.add(0,zero)
        arraylist.add(1,one)
        arraylist.add(2,two)
        arraylist.add(3,three)
        arraylist.add(4,four)
        arraylist.add(5,five)
        arraylist.add(6,six)
        arraylist.add(7,seven)
        arraylist.add(8,eight)

        click(0,zero)
        click(1,one)
        click(2,two)
        click(3,three)
        click(4,four)
        click(5,five)
        click(6,six)
        click(7,seven)
        click(8,eight)


    }

    private fun click(i: Int, b: Button) {



        arraylist[i].setOnClickListener {

            if(arraylist[i].text.isEmpty())
            {
                if(j==true)
                {
                    arraylist[i].text="X"
                    j=false
                }
                else
                {
                    arraylist[i].text="0"
                    j=true
                }


            }


            win(0,1,2)
            win(3,4,5)
            win(6,7,8)
            win(0,4,8)
            win(2,4,6)
            win(0,3,6)
            win(1,4,7)
            win(2,5,8)
        }

        reset.setOnClickListener {

            zero.setText(null)
            one.setText(null)
            two.setText(null)
            three.setText(null)
            four.setText(null)
            five.setText(null)
            six.setText(null)
            seven.setText(null)
            eight.setText(null)

            j=true

        }



    }


    private fun win(a: Int, b: Int, c: Int) {

        if (arraylist[a].text.equals("X") && arraylist[b].text.equals("X") && arraylist[c].text.equals(
                "X"
            ) || arraylist[a].text.equals("0") && arraylist[b].text.equals("0") && arraylist[c].text.equals(
                "0"
            )
        ) {

            for (k in 0..8) {
                if (k == a || k == b || k == c) {
                    arraylist[a].text = "W"
                    arraylist[b].text = "I"
                    arraylist[c].text = "N"
                } else {
                    arraylist[k].text = "-"
                }

            }

        }


    }





}

