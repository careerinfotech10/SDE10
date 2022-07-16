import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Pipes07Component } from './pipes07/pipes07.component';
import { ParappipesComponent } from './parappipes/parappipes.component';

@NgModule({
  declarations: [
    AppComponent,
    Pipes07Component,
    ParappipesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
