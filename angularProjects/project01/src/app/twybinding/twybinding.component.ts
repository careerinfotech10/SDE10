import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-twybinding',
  templateUrl: './twybinding.component.html',
  styleUrls: ['./twybinding.component.css']
})
export class TwybindingComponent implements OnInit {


  name:string="vishal";

  fruits:string[]=["apple","banana","mango"];

   choice:string="20";
  constructor() { }

  ngOnInit(): void {
  }

}
