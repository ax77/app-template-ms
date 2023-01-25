/*
 * Copyright (c) 2023. All rights reserved. https://github.com/ax77
 */

import { Component } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable } from "rxjs";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

  MAIN_API_URL = 'http://localhost:8080/api/';
  AUTH_HTTP_HEADERS = new HttpHeaders({ 'Content-Type': 'application/json' });

  constructor(private http: HttpClient) { }

  getSettings(): Observable<any> {
    return this.http.post<any>('http://localhost:8080/api/cv', {
      "company": 'google',
      "vacancy": 'developer',
      "salary": 1600
    }, {
      headers: this.AUTH_HTTP_HEADERS
    });
  }

  getSettingsResult() {
    let response = this.getSettings().subscribe((res) => {
      console.log(res);
    })

  }
}
