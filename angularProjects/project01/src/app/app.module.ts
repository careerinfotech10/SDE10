import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GreetComponent } from './greet/greet.component';
import { WishComponent } from './wish/wish.component';
import { MyWishComponent } from './my-wish/my-wish.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { FormsModule } from '@angular/forms';
import { TablepractComponent } from './tablepract/tablepract.component';
import { TwybindingComponent } from './twybinding/twybinding.component';

@NgModule({
  declarations: [
    AppComponent,
    GreetComponent,
    WishComponent,
    MyWishComponent,
    WelcomeComponent,
    TablepractComponent,
    TwybindingComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
