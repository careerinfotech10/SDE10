import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-wish',
  templateUrl: './wish.component.html',
  styleUrls: ['./wish.component.css']
})
export class WishComponent implements OnInit {

  result:boolean=false;
  username:string="sagar";

  constructor() { }

  ngOnInit(): void {
  }

}
