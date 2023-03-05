package com.example.demo.model;

import lombok.Data;

/*
 * @Data・・・Lombokの@Dataアノテーションです。GetterやSetter、toStringなどのコードを自動生成してくれます。
 * 自動生成されている事は、[アウトライン]ビューで確認できます（下記イメージ参照）。
 */
 @Data
public class User {
	 private String name;
	 private String email;
	 private Integer age;
	
}
