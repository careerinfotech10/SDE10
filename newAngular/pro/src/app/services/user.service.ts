import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  baseUrl:any=`http://15.206.171.20:9090`

  constructor(private http:HttpClient) { }

  getCountries()
  {
    return this.http.get(`${this.baseUrl}/countries`)
  }
}
