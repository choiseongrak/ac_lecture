import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = ' Json pipe실습';

  items={
    apple:'사과',
    melon:'멜론',
    banana:'바나나',
    orange:'오렌지'
  };
 
}
