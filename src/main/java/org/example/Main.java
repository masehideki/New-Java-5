package org.example;

import java.time.LocalDateTime;

public class Main {

  public static void main(String[] args) {

//    条件式を使った課題。
//    文字列型を使って、変数を2つ用意する。その変数には苗字と名前を入れてください。
//    条件は名字の文字数が2文字以上の場合　かつ　名前の文字数が2文字以上の場合はtrue。
//    条件がtrueの場合はその名前を表示する。
//    条件がfalseの場合は条件に一致しませんでした。という文言を表示する。

    String firstName = "間瀬";
    String lastName = "英紀";

//    以下は動作確認用
//    String firstName = "間瀬";
//    String lastName = "hideki";
//
//    String firstName = "mase";
//    String lastName = "hideki";
//
//    String firstName = "間瀬";
//    String lastName = "英";
//
//    String firstName = "間";
//    String lastName = "英紀";
//
//    System.out.println("名字の長さ：" + firstName.length());
//    System.out.println("名前の長さ：" + lastName.length());

    if(firstName.length() >= 2 && lastName.length() >= 2){
      System.out.println(firstName + lastName);
    }else{
      System.out.println("条件に一致しませんでした。");
    }

//    追加：日付を使って条件分岐をする
//    現在のローカル時刻を取得する。
//    その時刻が午前0時〜午前11時59分なら「AM〇〇:〇〇」、それ以外なら「PM〇〇:〇〇」と表示する。

    LocalDateTime nowTime = LocalDateTime.now();
    int nowHour = nowTime.getHour();
    int nowMin = nowTime.getMinute();

//    以下、動作確認用
//
//    int nowHour = 0;
//    int nowMin = 0;
//
//    int nowHour = 11;
//    int nowMin = 59;

//    int nowHour = 12;
//    int nowMin = 0;
//
//    int nowHour = 23;
//    int nowMin = 59;

    if(nowHour < 12){
      System.out.println("AM"+nowHour+":"+nowMin);
    }else{
      System.out.println("PM"+nowHour+":"+nowMin);
    }
  }
}
