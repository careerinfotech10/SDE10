import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes07',
  templateUrl: './pipes07.component.html',
  styleUrls: ['./pipes07.component.css']
})
export class Pipes07Component implements OnInit {

  name="santosh";
  lastname="turerao";

  dateExmaple=Date.now();
  currencyExmaple=125;

  percentExample=0.7687;

  jsonExample={username:"santosh",email:"tureraosantosh@gail.com",experiance:"12Year Of Experiance"};

  constructor() { }

  ngOnInit(): void {
  }

}
