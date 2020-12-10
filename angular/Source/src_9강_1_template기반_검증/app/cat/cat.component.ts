import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cat',
  templateUrl: './cat.component.html',
  styleUrls: ['./cat.component.css']
})
export class CatComponent implements OnInit {
  cat={
    name:"",
    age:"",
    species:'페르시안'
  }
  onSubmit(){
    console.log("onSubmit")
  }

  constructor() { }

  ngOnInit(): void {
  }

}
