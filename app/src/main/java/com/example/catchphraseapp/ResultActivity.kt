package com.example.catchphraseapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Random

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tvResult:TextView = findViewById(R.id.tvResult)
        val btnReplay:Button = findViewById(R.id.btnReplay)

        // 4) 値を受け取る→テキストに表示
        val myItem = intent.getStringExtra("MY_ITEM")
        //tvResult.text = myItem

        // 5) 配列を用意
        val msgData = arrayOf(
            " 女子高生が選ぶ『 $myItem 』ランキング",
            "100円ショップにあるものだけで『 $myItem 』を作る",
            " 世界の富豪が実践する３つの『 $myItem』",
            " 逆に今『 $myItem 』がナウい！",
            " 世界は『 $myItem 』で出来ている",
            " 彼のハートを打ち抜く神『 $myItem 』",
            " 衝撃！『 $myItem 』だけで１ヵ月生活",
            " あなたの知らない『 $myItem 』の世界",
            " 今からはじめる『 $myItem 』",
            " 乳酸菌が１００億個入った『 $myItem 』",
            " 100年に1度の『 $myItem 』",
            " 愛と『 $myItem 』の物語",
            " 世界よ！これが真の『 $myItem 』だ！！",
            " あのカリスマ『 $myItem 』、待望の映画化！",
            " 今年最高の『 $myItem 』をお届け",
            " あの素晴らしい『 $myItem 』をもう一度",
        )

        // 7) 乱数を作る
        //val num = Random().nextInt(16)
        val num = Random().nextInt(msgData.count())

        // 6) 配列の0番目を表示
        tvResult.text = msgData[num]

        // 9) リプレイボタン
        btnReplay.setOnClickListener {
            finish()
        }

    }
}