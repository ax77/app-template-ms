/*
 * Copyright (c) 2023. All rights reserved. https://github.com/ax77
 */

import {Component, OnInit} from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable } from "rxjs";
import {Form, FormControl, FormGroup} from "@angular/forms";
import {CV} from "./entity/cv";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {

  MAIN_API_URL = 'http://localhost:8080/api/v1/cv/';
  AUTH_HTTP_HEADERS = new HttpHeaders({ 'Content-Type': 'application/json' });
  form: FormGroup = new FormGroup({});

  constructor(private http: HttpClient) { }

  createNewCv(cv: CV): Observable<any> {
    return this.http.post<CV>(this.MAIN_API_URL + 'create', {
      company: cv.company, salary: cv.salary, vacancy: cv.vacancy
    }, {
      headers: this.AUTH_HTTP_HEADERS
    });
  }

  ngOnInit(): void {
    this.form = new FormGroup({
      company: new FormControl('google', [
      ]),
      vacancy: new FormControl('go developer', [
      ]),
      salary: new FormControl('16000', [
      ]),
    })
  }

  submit() {
    const cv: CV = {
      company: this.form.value.company,
      vacancy: this.form.value.vacancy,
      salary: this.form.value.salary
    }

    let response = this.createNewCv(cv).subscribe((res) => {
      console.log(res);
    })
  }
}
