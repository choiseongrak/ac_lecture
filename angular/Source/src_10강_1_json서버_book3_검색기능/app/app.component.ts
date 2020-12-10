import { Component } from '@angular/core';
//////////////////////////////
import {BookService} from './book.service';
 
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers:[BookService]  //import 
})
export class AppComponent {
  title = 'chul';
  items;
  constructor(public service:BookService){}
  send(kkk){
    this.service.send(kkk).subscribe(res=>{this.items=res;},
      error=>console.log(error));
  }
}
//json -> db.json
// {
//   "todos":[
//       {
//           "id":"1",
//           "title":"Read Point Article",
//           "complete": false
//       },
//       {
//           "id":"2",
//           "title":"clean in box ",
//           "complete": false
//       },
//       {
//           "id":"3",
//           "title":"make a reservation",
//           "complete": false
//       }
//   ],
// "books":[
//   {"name":"위험한 식탁", "img":"a.jpg"},
//   {"name":"공부의 비결", "img":"b.jpg"},
//   {"name":"오메르타", "img":"c.jpg"},
//   {"name":"행복의 비결", "img":"d.jpg"},
//   {"name":"해케스 토익", "img":"e.jpg"},
//   {"name":"도로안내서", "img":"f.jpg"}
// ]
// }