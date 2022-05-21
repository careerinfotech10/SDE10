import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tablepract',
  templateUrl: './tablepract.component.html',
  styleUrls: ['./tablepract.component.css']
})
export class TablepractComponent implements OnInit {

  fun(){
    console.log('angular learning is very funny!!');
  }
  
  mergeValue:number=2;

  linesWidth:number=5;
  constructor() { }

  ngOnInit(): void {
  }

}
