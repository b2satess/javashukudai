package com.example.demo.controller;

/*
 * @Controller・・・このクラスをコントローラとして機能させる場合に指定します。
　@GetMapping・・・アノテーション付与によりHTTPのGETリクエストを受け付けます。ここでは"http://localhost:8080/form"のGETリクエストを受け付けます。
　@PostMapping・・・アノテーション付与によりHTTPのPOSTリクエストを受け付けます。ここでは"http://localhost:8080/form"のPOSTリクエストを受け付けます。
　@ModelAttribute・・・モデル属性にバインドします。バインドとは、日本語で「結び付ける」「関連付ける」などの意味です。
	ここでは、入力画面の「氏名」が<input type="text" name="name">の場合、
	リクエストを受け付けたタイミングでSpringが自動でUserクラスのnameプロパティに画面入力値を設定してくれます。
	これは、データバインディングと呼ばれ、パラメータ取得コードの記述が不要となります。
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.model.User;

@Controller
public class HomeController {

    @GetMapping("/form")
    private String readForm(@ModelAttribute User user) {
        return "form";
    }
    
    @PostMapping("/form")
    private String confirm(@ModelAttribute User user) {
        return "confirm";
    }
}